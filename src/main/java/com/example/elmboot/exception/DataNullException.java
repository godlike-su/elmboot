package com.example.elmboot.exception;

public class DataNullException extends BaseException {

    /** 错误码 */
    private String resultCode = "400";

    /** 错误描述 */
    private String resultMsg = "DataNullException";

    public String getResultCode() {
        return resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public DataNullException(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public DataNullException() {
    }

    public DataNullException(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}
