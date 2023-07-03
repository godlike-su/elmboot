package com.example.elmboot.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Oberallresult implements Serializable {
    @ApiModelProperty(value = "总检结论项编号")
    private Integer orld;

    @ApiModelProperty(value = "总检结论项标题")
    private String title;

    @ApiModelProperty(value = "总检结论项内容")
    private String content;

    @ApiModelProperty(value = "所属预约编号  ")
    private Integer orderid;

    private static final long serialVersionUID = 1L;

    public Integer getOrld() {
        return orld;
    }

    public void setOrld(Integer orld) {
        this.orld = orld;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orld=").append(orld);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", orderid=").append(orderid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}