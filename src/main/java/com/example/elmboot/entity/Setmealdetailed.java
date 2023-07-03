package com.example.elmboot.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Setmealdetailed implements Serializable {
    @ApiModelProperty(value = "体检套餐项目明细缩号(无意义主键 )")
    private Integer sdid;

    @ApiModelProperty(value = "体检套编号")
    private Integer smid;

    @ApiModelProperty(value = "体检检查项编号")
    private Integer cild;

    private static final long serialVersionUID = 1L;

    public Integer getSdid() {
        return sdid;
    }

    public void setSdid(Integer sdid) {
        this.sdid = sdid;
    }

    public Integer getSmid() {
        return smid;
    }

    public void setSmid(Integer smid) {
        this.smid = smid;
    }

    public Integer getCild() {
        return cild;
    }

    public void setCild(Integer cild) {
        this.cild = cild;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sdid=").append(sdid);
        sb.append(", smid=").append(smid);
        sb.append(", cild=").append(cild);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}