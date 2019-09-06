package com.vk.spring.drasticketing.dto;

import java.io.Serializable;

public class InputRequestVo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String request;

    public void setRequest(String request){
        this.request = request;
    }

    public String getRequest(){
        return request;
    }

    public String toString(){
        return "request="+request;
    }
}