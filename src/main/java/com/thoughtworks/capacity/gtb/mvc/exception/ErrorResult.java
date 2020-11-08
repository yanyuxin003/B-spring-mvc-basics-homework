package com.thoughtworks.capacity.gtb.mvc.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/*@AllArgsConstructor
@Data*/
public class ErrorResult {
    private int code;
    private String message;

    //mac Lombok引入老没反应
    public ErrorResult(String message, int code) {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

