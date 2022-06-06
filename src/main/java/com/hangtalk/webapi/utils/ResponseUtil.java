package com.hangtalk.webapi.utils;

public class ResponseUtil {

    public static ResponseResult<Boolean> success() {
        return success(true);
    }

    public static <T> ResponseResult<T> success(T data) {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.setData(data);
        return responseResult;
    }

    public static <T> ResponseResult<T> error(String code , T data, String message) {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.setErrorCode(code);
        responseResult.setErrorMessage(message);
        responseResult.setData(data);
        return responseResult;
    }

}
