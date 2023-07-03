package com.example.elmboot.result;

/**
 * 错误的返回结果
 */
public class ErrorResult extends BaseResult {
    public ErrorResult(String status, String message) {
        super(status, message);
    }

    public ErrorResult() {
    }

    public ErrorResult(String message) {
        super("400", message);
    }
}