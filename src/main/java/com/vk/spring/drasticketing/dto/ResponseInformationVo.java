package com.vk.spring.drasticketing.dto;

import java.io.Serializable;

public class ResponseInformationVo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String status;
    private String message;

    public ResponseInformationVo(){
        super();
    }

    public ResponseInformationVo(String status, String message){
        super();
        this.status = status;
        this.message = message;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public String toString(){
        return "status="+status+", message="+message;
    }
}