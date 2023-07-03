package com.example.elmboot.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Doctor implements Serializable {
    @ApiModelProperty(value = "医生编号")
    private Integer docid;

    @ApiModelProperty(value = "医生码(登录用 )")
    private String doccode;

    @ApiModelProperty(value = "真实姓名")
    private String realname;

    @ApiModelProperty(value = "密码(用 )")
    private String password;

    @ApiModelProperty(value = "用户性别 (1: 男;0女)")
    private Integer sex;

    @ApiModelProperty(value = "所属科室(1: 检验科 ;2 : 内科 ;3 : 外科 )")
    private Integer deptno;

    private static final long serialVersionUID = 1L;

    public Integer getDocid() {
        return docid;
    }

    public void setDocid(Integer docid) {
        this.docid = docid;
    }

    public String getDoccode() {
        return doccode;
    }

    public void setDoccode(String doccode) {
        this.doccode = doccode;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", docid=").append(docid);
        sb.append(", doccode=").append(doccode);
        sb.append(", realname=").append(realname);
        sb.append(", password=").append(password);
        sb.append(", sex=").append(sex);
        sb.append(", deptno=").append(deptno);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}