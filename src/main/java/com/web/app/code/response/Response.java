package com.web.app.code.response;

import lombok.Data;

import java.util.Date;

@Data
public class Response {
    private Date timeStamp;
    private String message;
    private int statusCode;
    private Object data;

    public Response(Date timeStamp, String message, int statusCode, Object data) {
        this.timeStamp = timeStamp;
        this.message = message;
        this.statusCode = statusCode;
        this.data = data;
    }
}
