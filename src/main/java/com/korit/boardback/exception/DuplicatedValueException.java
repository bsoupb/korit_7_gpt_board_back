package com.korit.boardback.exception;

import com.korit.boardback.controller.advice.FieldError;
import lombok.Getter;

import java.util.List;
import java.util.Map;

@Getter
public class DuplicatedValueException extends RuntimeException {
    private List<FieldError> fieldErrors;

    public DuplicatedValueException(List<FieldError> fieldErrors) {
        super("중복 오류");
        this.fieldErrors = fieldErrors;
    }
}
