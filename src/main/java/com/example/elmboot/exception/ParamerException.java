package com.example.elmboot.exception;

public class ParamerException extends BaseException {

    /** 错误码 */
    private String resultCode = "400";

    /** 错误描述 */
    private String resultMsg = "ParameterException";

    public String getResultCode() {
        return resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public ParamerException(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public ParamerException(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public ParamerException() {}
}
