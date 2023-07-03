package com.example.elmboot.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable {

    @ApiModelProperty(value = "用户编号( 手机号码 ")
    private String userid;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "真实姓名")
    private String realname;

    @ApiModelProperty(value = "用户性别 (1: 男;0女)")
    private Integer sex;

    @ApiModelProperty(value = "身份证号")
    private String identitycard;

    @ApiModelProperty(value = "出生日期")
    private Date birthday;

    @ApiModelProperty(value = "用户类型(1: 普通用户 ; 2 : 东软内部员工:3 : 其他 ")
    private Integer usertype;

    public Users() {

    }

    public Users(String userid, String realname, Integer sex, String identitycard, Date birthday, Integer usertype) {
        this.userid = userid;
        this.realname = realname;
        this.sex = sex;
        this.identitycard = identitycard;
        this.birthday = birthday;
        this.usertype = usertype;
    }

    private static final long serialVersionUID = 1L;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", password=").append(password);
        sb.append(", realname=").append(realname);
        sb.append(", sex=").append(sex);
        sb.append(", identitycard=").append(identitycard);
        sb.append(", birthday=").append(birthday);
        sb.append(", usertype=").append(usertype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}