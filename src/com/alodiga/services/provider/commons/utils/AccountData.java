package com.alodiga.services.provider.commons.utils;

import java.io.Serializable;

public class AccountData implements Serializable {

    String login;
    String password;
    String ipRemoteAddress;
    Long userId;

    public AccountData() {
    }

    public AccountData(String login, String password,String ipRemoteAddress) {
        this.login = login;
        this.password = password;
        this.ipRemoteAddress = ipRemoteAddress;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIpRemoteAddress() {
        return ipRemoteAddress;
    }

    public void setIpRemoteAddress(String ipRemoteAddress) {
        this.ipRemoteAddress = ipRemoteAddress;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
