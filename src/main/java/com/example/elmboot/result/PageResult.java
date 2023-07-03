package com.example.elmboot.result;

import com.github.pagehelper.Page;

import java.util.List;

/**
 * 分页结果集
 */
public class PageResult<T> extends BaseResult {
    private static final long serialVersionUID = 1L;
    private List<T> data;
    private int page;
    private long total;
    /** @deprecated */
    @Deprecated
    private long records;

    public PageResult(String status, String message) {
        super(status, message);
        this.data = null;
    }

    public PageResult() {
        this.data = null;
    }

    public PageResult(long total, List<T> rows) {
        this.data = null;
        this.setData(rows);
        this.setTotal(total);
        this.setRecords(total);
    }

    public PageResult(Page<T> page) {
        this(page.getTotal(), page);
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    /** @deprecated */
    @Deprecated
    public void setRecords(long records) {
        this.records = records;
    }

    public List<T> getData() {
        return this.data;
    }

    public int getPage() {
        return this.page;
    }

    public long getTotal() {
        return this.total;
    }

    /** @deprecated */
    @Deprecated
    public long getRecords() {
        return this.records;
    }
}
