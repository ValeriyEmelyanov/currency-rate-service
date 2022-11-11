package com.example.currencyrateservice.controller;

import com.example.currencyrateservice.dto.CurrencyRateOnDateByCharCodeRequest;
import com.example.currencyrateservice.dto.CurrencyRateOnDateRequest;
import com.example.currencyrateservice.dto.CurrencyRatePlanByCharCodeRequest;
import com.example.currencyrateservice.dto.CurrencyRateResponse;
import com.example.currencyrateservice.service.CurrencyRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/currencyrates")
public class CurrencyRateController {

    private final CurrencyRateService currencyRateService;

    @PostMapping("/ondate")
    public List<CurrencyRateResponse> getCurrencyRatesOnDate(
            @RequestBody CurrencyRateOnDateRequest request) {
        return currencyRateService.getCurrencyRatesOnDate(request);
    }

    @PostMapping("/ondate/bycharcode")
    public CurrencyRateResponse getCurrencyRateOnDateByCharCode(
            @RequestBody CurrencyRateOnDateByCharCodeRequest request) {
        return currencyRateService.getCurrencyRateByCharCodeOnDate(request);
    }

    @PostMapping("/plan")
    public List<CurrencyRateResponse> getCurrencyRatesPlan() {
        return currencyRateService.getCurrencyRatesPlan();
    }

    @PostMapping("/plan/bycharcode")
    public CurrencyRateResponse getCurrencyRateByCharCodePlan(
            @RequestBody CurrencyRatePlanByCharCodeRequest request) {
        return currencyRateService.getCurrencyRateByCharCodePlan(request);
    }
}
