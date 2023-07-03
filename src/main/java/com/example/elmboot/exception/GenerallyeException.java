package com.example.elmboot.exception;

public class GenerallyeException extends BaseException {

    /** 错误码 */
    private String resultCode = "400";

    /** 错误描述 */
    private String resultMsg = "GenerallyException";

    public String getResultCode() {
        return resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public GenerallyeException(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public GenerallyeException() {
    }

    public GenerallyeException(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}
