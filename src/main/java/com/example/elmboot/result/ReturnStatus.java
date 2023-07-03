package com.example.elmboot.result;

public interface ReturnStatus {
    String STATUS_OK = "200";
    String STATUS_EXCEPTION = "400";
    String STATUS_UNAUTHORIZED = "401";
    String STATUS_FORBIDDEN = "403";
    String STATUS_NOTFOUND = "404";
    String STATUS_NOUSER = "405";
    String STATUS_DUPLICATE = "900";
    String STATUS_IMPERFECT = "901";
    String STATUS_NOPASS = "902";
    String STATUS_PASSWORD_EXPIRE = "903";
    String RESPONSE_ERROR_HEADER = "RESPONSE_ERROR_RESULT";
}
