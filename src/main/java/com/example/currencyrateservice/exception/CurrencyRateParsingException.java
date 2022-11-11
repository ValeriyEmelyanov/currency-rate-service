package com.example.currencyrateservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class CurrencyRateParsingException extends RuntimeException {
    public CurrencyRateParsingException(Exception e) {

    }
}
