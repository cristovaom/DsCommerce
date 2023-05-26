package com.devsuperior.dscommerce.dto;

import java.lang.reflect.Field;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidatonError extends CustomError{

    public List<FieldMessage> errors = new ArrayList<>();


    public ValidatonError(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName,String message){
        errors.add(new FieldMessage(fieldName,message));
    }
}
