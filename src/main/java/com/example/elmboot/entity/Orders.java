package com.example.elmboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value="订单信息", description="订单信息")
public class Orders implements Serializable {
    @ApiModelProperty(value = "订单编号")
    private Integer orderid;

    @ApiModelProperty(value = "预约日期")
    private Date orderdate;

    @ApiModelProperty(value = "客户编号")
    private String userid;

    @ApiModelProperty(value = "所属医院编号  ")
    private Integer hpld;

    @ApiModelProperty(value = "所属套餐编号  ")
    private Integer smid;

    @ApiModelProperty(value = "订单状态(1: 末归档 ; 2 : 已归档 ) ")
    private Integer state;

    // 冗余信息
    @ApiModelProperty(value = "体检套餐名称")
    private String name;

    @ApiModelProperty(value = "体检套类型(1: 男士套; 0: 女餐 )")
    private Integer type;

    @ApiModelProperty(value = "体检套餐价格")
    private Integer price;

    @ApiModelProperty(value = "医院名称")
    private String hpName;

    @ApiModelProperty(value = "真实姓名")
    private String realname;

    @ApiModelProperty(value = "用户性别 (1: 男;0女)")
    private Integer sex;




    private static final long serialVersionUID = 1L;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getHpld() {
        return hpld;
    }

    public void setHpld(Integer hpld) {
        this.hpld = hpld;
    }

    public Integer getSmid() {
        return smid;
    }

    public void setSmid(Integer smid) {
        this.smid = smid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", orderdate=").append(orderdate);
        sb.append(", userid=").append(userid);
        sb.append(", hpld=").append(hpld);
        sb.append(", smid=").append(smid);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}