package com.example.currencyrateservice.dataclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@FeignClient(name = "currencyrate", url = "${cb.currencyrate.url}")
public interface CbClient {

    @GetMapping
    String getCurrencyRatesPlan();

    @GetMapping
    String getCurrencyRatesOnDate(@RequestParam("date_req") @DateTimeFormat(pattern = "dd.MM.yyyy") LocalDate date);

}
