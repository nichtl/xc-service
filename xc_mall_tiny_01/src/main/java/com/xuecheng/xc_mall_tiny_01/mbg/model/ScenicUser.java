package com.xuecheng.xc_mall_tiny_01.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class ScenicUser implements Serializable {
    private Integer id;

    /**
     * 真实姓名
     *
     * @mbggenerated
     */
    private String realname;

    /**
     *  0 男 1 女
     *
     * @mbggenerated
     */
    private String sex;

    /**
     * 毕业学校
     *
     * @mbggenerated
     */
    private Byte age;

    private String graduation;

    /**
     * 数字越大权限越大
     *
     * @mbggenerated
     */
    private Byte authority;

    /**
     * 邮箱
     *
     * @mbggenerated
     */
    private String email;

    /**
     * 用户名
     *
     * @mbggenerated
     */
    private String loginname;

    /**
     * 最后一次登陆时间
     *
     * @mbggenerated
     */
    private Date lastlogintime;

    /**
     * 头像url地址
     *
     * @mbggenerated
     */
    private String imageurl;

    /**
     * 账户
     *
     * @mbggenerated
     */
    private String count;

    /**
     * 密码
     *
     * @mbggenerated
     */
    private String password;

    private String telephone;

    private String address;

    /**
     * 是否在线
     *
     * @mbggenerated
     */
    private String isonlinestatus;

    private String company;

    private Date birthday;

    /**
     * 账户是否注销 默认 0 未注销 1 注销
     *
     * @mbggenerated
     */
    private String islogoff;

    /**
     * 账户注册日期
     *
     * @mbggenerated
     */
    private Date registrydate;

    /**
     * 身份证号码
     *
     * @mbggenerated
     */
    private String identitynum;

    /**
     * 用户类型 0 开发 1 管理 2 用户 3 维护
     *
     * @mbggenerated
     */
    private String usertype;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    public Byte getAuthority() {
        return authority;
    }

    public void setAuthority(Byte authority) {
        this.authority = authority;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getIsonlinestatus() {
        return isonlinestatus;
    }

    public void setIsonlinestatus(String isonlinestatus) {
        this.isonlinestatus = isonlinestatus;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIslogoff() {
        return islogoff;
    }

    public void setIslogoff(String islogoff) {
        this.islogoff = islogoff;
    }

    public Date getRegistrydate() {
        return registrydate;
    }

    public void setRegistrydate(Date registrydate) {
        this.registrydate = registrydate;
    }

    public String getIdentitynum() {
        return identitynum;
    }

    public void setIdentitynum(String identitynum) {
        this.identitynum = identitynum;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", realname=").append(realname);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", graduation=").append(graduation);
        sb.append(", authority=").append(authority);
        sb.append(", email=").append(email);
        sb.append(", loginname=").append(loginname);
        sb.append(", lastlogintime=").append(lastlogintime);
        sb.append(", imageurl=").append(imageurl);
        sb.append(", count=").append(count);
        sb.append(", password=").append(password);
        sb.append(", telephone=").append(telephone);
        sb.append(", address=").append(address);
        sb.append(", isonlinestatus=").append(isonlinestatus);
        sb.append(", company=").append(company);
        sb.append(", birthday=").append(birthday);
        sb.append(", islogoff=").append(islogoff);
        sb.append(", registrydate=").append(registrydate);
        sb.append(", identitynum=").append(identitynum);
        sb.append(", usertype=").append(usertype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}