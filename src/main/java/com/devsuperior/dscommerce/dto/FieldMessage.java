package com.devsuperior.dscommerce.dto;

public class FieldMessage {

    private String fileldName;
    private String message;

    public FieldMessage(String fileldName, String message) {
        this.fileldName = fileldName;
        this.message = message;
    }

    public String getFileldName() {
        return fileldName;
    }

    public String getMessage() {
        return message;
    }
}
