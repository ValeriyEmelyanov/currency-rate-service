package com.example.currencyrateservice.service.impl;

import com.example.currencyrateservice.dto.CurrencyRateOnDateByCharCodeRequest;
import com.example.currencyrateservice.dto.CurrencyRateOnDateRequest;
import com.example.currencyrateservice.dto.CurrencyRatePlanByCharCodeRequest;
import com.example.currencyrateservice.dto.CurrencyRateResponse;
import com.example.currencyrateservice.service.CurrencyRateProvider;
import com.example.currencyrateservice.service.CurrencyRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CurrencyRateServiceImpl implements CurrencyRateService {

    private final CurrencyRateProvider currencyRateServise;

    @Override
    public List<CurrencyRateResponse> getCurrencyRatesOnDate(CurrencyRateOnDateRequest request) {
        return currencyRateServise.getCurrencyRatesOnDate(request.getDate())
                .values()
                .stream()
                .sorted(Comparator.comparing(CurrencyRateResponse::getId))
                .collect(Collectors.toList());
    }

    @Override
    public CurrencyRateResponse getCurrencyRateByCharCodeOnDate(CurrencyRateOnDateByCharCodeRequest request) {
        return currencyRateServise.getCurrencyRatesOnDate(request.getDate())
                .get(request.getCharCode());
    }

    @Override
    public List<CurrencyRateResponse> getCurrencyRatesPlan() {
        return currencyRateServise.getCurrencyRatesPlan()
                .values()
                .stream()
                .sorted(Comparator.comparing(CurrencyRateResponse::getId))
                .collect(Collectors.toList());
    }

    @Override
    public CurrencyRateResponse getCurrencyRateByCharCodePlan(CurrencyRatePlanByCharCodeRequest request) {
        return currencyRateServise.getCurrencyRatesPlan()
                .get(request.getCharCode());
    }
}
