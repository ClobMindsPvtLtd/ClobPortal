package com.clobportal.controller;

public class ServiceResponse {


    private  String hhtpstatus;
    private String data;
    private Object obj;


    public ServiceResponse(String hhtpstatus, String data, Object obj) {
        this.hhtpstatus = hhtpstatus;
        this.data = data;
        this.obj = obj;
    }

    public String getHhtpstatus() {
        return hhtpstatus;
    }

    public void setHhtpstatus(String hhtpstatus) {
        this.hhtpstatus = hhtpstatus;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
