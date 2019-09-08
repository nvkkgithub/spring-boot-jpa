package com.vk.spring.drasticketing.dto;

import java.io.Serializable;

public class InputRequestVo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private int counter;
    private String request;

    public void setCounter(int counter){
        this.counter = counter;
    }

    public int getCounter(){
        return counter;
    }

    public void setRequest(String request){
        this.request = request;
    }

    public String getRequest(){
        return request;
    }

    public String toString(){
        return "counter="+counter+", request="+request;
    }
}