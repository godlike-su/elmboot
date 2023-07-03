package com.example.elmboot.result;

/**
 * 正常的没有数据的返回结果
 */
public class MessageResult extends BaseResult {
    public MessageResult(String msg) {
        super("200", msg);
    }

    public MessageResult() {
    }
}