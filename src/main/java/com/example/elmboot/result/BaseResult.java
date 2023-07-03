package com.example.elmboot.result;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * 基础结果
 */
public class BaseResult implements ReturnStatus, Serializable {
    private static final long serialVersionUID = 1L;
    //value = "状态，200-成功，400-出错，401-未登录，403-禁止访问，900-数据重复，901-验证失败",
    protected String status;
    protected String message;

    public BaseResult() {
        this.status = "200";
    }

    public BaseResult(String status) {
        this.status = status;
    }

    public BaseResult(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public boolean success() {
        return "200".equalsIgnoreCase(this.status);
    }

    public void setMessage(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String toString() {
        return JSON.toJSONString(this);
    }

    public String getStatus() {
        return this.status;
    }

    public String getMessage() {
        return this.message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
