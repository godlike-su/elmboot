package com.example.elmboot.result;

/**
 * 单个数据结果
 */
public class SingleResult<T> extends BaseResult {
    private static final long serialVersionUID = 1L;
    private T data;

    public SingleResult(T t) {
        super("200");
        this.data = t;
    }

    public SingleResult(T t, String msg) {
        super("200", msg);
        this.data = t;
    }

    public SingleResult(String status, String msg) {
        super(status, msg);
    }

    public SingleResult(T data, String status, String msg) {
        super(status, msg);
        this.data = data;
    }

    public SingleResult() {
        super("200");
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}