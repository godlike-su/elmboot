package com.example.elmboot.pagination;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 传入的分页参数
 */
public class PageParam {
    private static final long serialVersionUID = 1L;
     @ApiModelProperty("页号")
    private int page;
     @ApiModelProperty("每页行数")
    private int rows;
    /**
     * @deprecated
     */

    @Deprecated
    private Map<String, Object> params = new ConcurrentHashMap();
     @ApiModelProperty("排序字段名")
    private String sortName;
     @ApiModelProperty("排序类型")
    private String order;

    public PageParam() {
    }

    public PageParam(int page, int rows) {
        this.page = page;
        this.rows = rows;
    }

    public String toString() {
        return JSON.toJSONString(this);
    }

    public int getPage() {
        return this.page;
    }

    public int getRows() {
        if (this.rows == 0) {
            this.rows = 10;
        }
        return this.rows;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public Map<String, Object> getParams() {
        return this.params;
    }

    public String getSortName() {
        return this.sortName;
    }

    public String getOrder() {
        return this.order;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
