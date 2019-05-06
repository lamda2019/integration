package com.wsc.common;

import java.io.Serializable;


public class UserBean<T> implements Serializable {

    private static final long serialVersionUID = -4577255781088498763L;
    private static final int OK = 0;
    private static final int FAIL = 1;
    private static final int UNAUTHORIZED = 2;

    private T data; //服务端数据
    private int status = OK; //状态码
    private String msg = ""; //描述信息

    //APIS
    public static UserBean isOk() {
        return new UserBean();
    }

    public static UserBean isFail() {
        return new UserBean().status(FAIL);
    }

    public static UserBean isFail(Throwable e) {
        return isFail().msg(e);
    }

    public UserBean msg(Throwable e) {
        this.setMsg(e.toString());
        return this;
    }

    public UserBean data(T data) {
        this.setData(data);
        return this;
    }

    public UserBean status(int status) {
        this.setStatus(status);
        return this;
    }


    public UserBean() {

    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
