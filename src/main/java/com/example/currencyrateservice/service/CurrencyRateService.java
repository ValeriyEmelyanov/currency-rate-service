package com.example.currencyrateservice.service;

import com.example.currencyrateservice.dto.CurrencyRateOnDateByCharCodeRequest;
import com.example.currencyrateservice.dto.CurrencyRateOnDateRequest;
import com.example.currencyrateservice.dto.CurrencyRatePlanByCharCodeRequest;
import com.example.currencyrateservice.dto.CurrencyRateResponse;

import java.util.List;

public interface CurrencyRateService {
    List<CurrencyRateResponse> getCurrencyRatesOnDate(CurrencyRateOnDateRequest request);

    CurrencyRateResponse getCurrencyRateByCharCodeOnDate(CurrencyRateOnDateByCharCodeRequest request);

    List<CurrencyRateResponse> getCurrencyRatesPlan();

    CurrencyRateResponse getCurrencyRateByCharCodePlan(CurrencyRatePlanByCharCodeRequest request);
}
