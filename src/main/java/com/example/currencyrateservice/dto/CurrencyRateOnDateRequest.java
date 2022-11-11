package com.example.currencyrateservice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
public class CurrencyRateOnDateRequest {

    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate date;

}
