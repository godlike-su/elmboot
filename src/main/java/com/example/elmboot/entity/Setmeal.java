package com.example.elmboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value="体检套餐信息", description="体检套餐信息")
public class Setmeal implements Serializable {
    @ApiModelProperty(value = "体检套餐编号")
    private Integer smid;

    @ApiModelProperty(value = "体检套餐名称")
    private String name;

    @ApiModelProperty(value = "体检套类型(1: 男士套; 0: 女餐 )")
    private Integer type;

    @ApiModelProperty(value = "体检套餐价格")
    private Integer price;

    private static final long serialVersionUID = 1L;

    public Integer getSmid() {
        return smid;
    }

    public void setSmid(Integer smid) {
        this.smid = smid;
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
        sb.append(", smid=").append(smid);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}