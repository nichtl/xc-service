package com.xuecheng.xc_mall_tiny_01.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class PasswordHistory implements Serializable {
    private String host;

    private String user;

    private Date passwordTimestamp;

    private String password;

    private static final long serialVersionUID = 1L;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getPasswordTimestamp() {
        return passwordTimestamp;
    }

    public void setPasswordTimestamp(Date passwordTimestamp) {
        this.passwordTimestamp = passwordTimestamp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host=").append(host);
        sb.append(", user=").append(user);
        sb.append(", passwordTimestamp=").append(passwordTimestamp);
        sb.append(", password=").append(password);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}