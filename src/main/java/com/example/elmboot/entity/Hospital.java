package com.example.elmboot.entity;

import com.example.elmboot.pagination.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

@ApiModel(value="医院信息表", description="医院信息表")
public class Hospital extends PageParam implements Serializable  {
    @ApiModelProperty(value = "医院编号")
    private Integer hpld;

    @ApiModelProperty(value = "医院名称")
    private String name;

    @ApiModelProperty(value = "医院电话")
    private String telephone;

    @ApiModelProperty(value = "医院地址")
    private String address;

    @ApiModelProperty(value = "营业时间")
    private String businesshours;

    @ApiModelProperty(value = "采血截止时间")
    private String deadline;

    @ApiModelProperty(value = "预约人数规则")
    private String rule;

    @ApiModelProperty(value = "医院状态(1: 正常; 2: 其他)")
    private Integer state;

    @ApiModelProperty(value = "医院图片")
    private String picture;

    private static final long serialVersionUID = 1L;

    public Integer getHpld() {
        return hpld;
    }

    public void setHpld(Integer hpld) {
        this.hpld = hpld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBusinesshours() {
        return businesshours;
    }

    public void setBusinesshours(String businesshours) {
        this.businesshours = businesshours;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hpld=").append(hpld);
        sb.append(", name=").append(name);
        sb.append(", telephone=").append(telephone);
        sb.append(", address=").append(address);
        sb.append(", businesshours=").append(businesshours);
        sb.append(", deadline=").append(deadline);
        sb.append(", rule=").append(rule);
        sb.append(", state=").append(state);
        sb.append(", picture=").append(picture);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}