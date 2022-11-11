package com.example.currencyrateservice.dto;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

@Value
@Builder
public class CurrencyRateResponse {

    String id;

    String numCode;

    String charCode;

    Integer nominal;

    String name;

    BigDecimal value;

}
