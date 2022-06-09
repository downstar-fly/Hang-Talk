package com.hangtalk.webapi.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

public class JwtUtil {
    public static String getToken(String username, String sign) {
        return JWT.create()
                .withClaim("sub",username)
                .sign(Algorithm.HMAC256(sign));
    }
}
