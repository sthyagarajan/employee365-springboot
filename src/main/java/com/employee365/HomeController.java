package com.employee365;

import com.auth0.SessionUtils;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.interfaces.RSAPublicKey;
import java.util.Enumeration;
import java.util.Map;

@SuppressWarnings("unused")
@Controller
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private static final String MARKETING_SUBJECT = "auth0|5aebdae704eb0b243f1daaeb";

    @RequestMapping(value = "/portal/home", method = RequestMethod.GET)
    protected String home(final Map<String, Object> model, final HttpServletRequest req) {
        logger.info("Home page");
        String accessToken = (String) SessionUtils.get(req, "accessToken");
        System.out.println("accessToken.." + accessToken);
        String idToken = (String) SessionUtils.get(req, "idToken");
        System.out.println("idToken.." + idToken);
        String sub = (String) SessionUtils.get(req, "sub");
        String nickname = (String) SessionUtils.get(req, "nickname");
        String subject = decodeJWT(idToken);


        String nickName = (String) SessionUtils.get(req, "nickname");
        if (accessToken != null) {
            model.put("userId", accessToken);
        } else if (idToken != null) {
            model.put("userId", idToken);
        }
        if (MARKETING_SUBJECT.equals(subject)){
            return "marketing";
        }
        return "developer";
    }


    private String decodeJWT(String token ) {
         DecodedJWT jwt = null;
         String subject = null;
        try {
              jwt = JWT.decode(token);
            subject =  jwt.getSubject();

            System.out.println("nickname.." + jwt.getClaim("nickname").asString());


            System.out.print("Subject = "+ subject);
        } catch (JWTDecodeException exception) {
            //UTF-8 encoding not supported
        } catch (JWTVerificationException exception) {
            //Invalid signature/claims

        }
        return subject;
    }
}
