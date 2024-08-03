package com.applepie.helloworldapi.response;

public class ResultUtil {
    public static CustomResponse success(int code, String message, Object data) {
        return new CustomResponse(code, message, data);
    }
    public static CustomResponse error(String message, Object data) {
        return new CustomResponse(500, message, data);
    }
}
