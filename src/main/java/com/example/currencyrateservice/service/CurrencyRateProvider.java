package com.example.currencyrateservice.service;

import com.example.currencyrateservice.dto.CurrencyRateResponse;

import java.time.LocalDate;
import java.util.Map;

public interface CurrencyRateProvider {

    Map<String, CurrencyRateResponse> getCurrencyRatesOnDate(LocalDate date);

    Map<String, CurrencyRateResponse> getCurrencyRatesPlan();

}
