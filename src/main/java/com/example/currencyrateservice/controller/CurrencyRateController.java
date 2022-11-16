package com.example.currencyrateservice.controller;

import com.example.currencyrateservice.api.CurrencyratesApi;
import com.example.currencyrateservice.dto.CurrencyRateOnDateByCharCodeRequest;
import com.example.currencyrateservice.dto.CurrencyRateOnDateRequest;
import com.example.currencyrateservice.dto.CurrencyRatePlanByCharCodeRequest;
import com.example.currencyrateservice.dto.CurrencyRateResponse;
import com.example.currencyrateservice.service.CurrencyRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CurrencyRateController implements CurrencyratesApi {

    private final CurrencyRateService currencyRateService;

    @Override
    public ResponseEntity<List<CurrencyRateResponse>> getCurrencyRatesOnDate(
            @RequestBody CurrencyRateOnDateRequest request) {
        return ResponseEntity.ok(currencyRateService.getCurrencyRatesOnDate(request));
    }

    @Override
    public ResponseEntity<CurrencyRateResponse> getCurrencyRateOnDateByCharCode(
            @RequestBody CurrencyRateOnDateByCharCodeRequest request) {
        return ResponseEntity.ok(currencyRateService.getCurrencyRateOnDateByCharCode(request));
    }

    @Override
    public ResponseEntity<List<CurrencyRateResponse>> getCurrencyRatesPlan() {
        return ResponseEntity.ok(currencyRateService.getCurrencyRatesPlan());
    }

    @Override
    public ResponseEntity<CurrencyRateResponse> getCurrencyRatePlanByCharCode(
            @RequestBody CurrencyRatePlanByCharCodeRequest request) {
        return ResponseEntity.ok(currencyRateService.getCurrencyRatePlanByCharCode(request));
    }
}
