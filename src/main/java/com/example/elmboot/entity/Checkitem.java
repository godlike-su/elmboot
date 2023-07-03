package com.example.elmboot.entity;

import com.example.elmboot.pagination.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value="检查项信息表", description="检查项信息表")
public class Checkitem extends PageParam implements Serializable {
    @ApiModelProperty(value = "检查项编号")
    private Integer cild;

    @ApiModelProperty(value = "检查项名称")
    private String ciname;

    @ApiModelProperty(value = "检查项内容")
    private String cicontent;

    @ApiModelProperty(value = "检查项意义  ")
    private String meaning;

    @ApiModelProperty(value = "备注")
    private String remarks;

    @ApiModelProperty(value = "检查明细")
    private List<Checkitemdetailed> checkitemdetailedList;

    @ApiModelProperty(value = "检查报告明细")
    private List<Cidetailedreport> cidetailedreportList;

    private static final long serialVersionUID = 1L;

    public Integer getCild() {
        return cild;
    }

    public void setCild(Integer cild) {
        this.cild = cild;
    }

    public String getCiname() {
        return ciname;
    }

    public void setCiname(String ciname) {
        this.ciname = ciname;
    }

    public String getCicontent() {
        return cicontent;
    }

    public void setCicontent(String cicontent) {
        this.cicontent = cicontent;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cild=").append(cild);
        sb.append(", ciname=").append(ciname);
        sb.append(", cicontent=").append(cicontent);
        sb.append(", meaning=").append(meaning);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}