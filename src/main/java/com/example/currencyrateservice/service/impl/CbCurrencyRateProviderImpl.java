package com.example.currencyrateservice.service.impl;

import com.example.currencyrateservice.dataclient.CbClient;
import com.example.currencyrateservice.dto.CurrencyRateResponse;
import com.example.currencyrateservice.parser.CurrencyRateParser;
import com.example.currencyrateservice.service.CurrencyRateProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class CbCurrencyRateProviderImpl implements CurrencyRateProvider {

    private final CbClient cbClient;

    private final CurrencyRateParser parser;

    @Override
    @Cacheable(value = "ondate")
    public Map<String, CurrencyRateResponse> getCurrencyRatesOnDate(LocalDate date) {
        log.info("Getting currency rates plan on date {}", date);
        String xml = cbClient.getCurrencyRatesOnDate(date);
        return parser.parse(xml)
                .stream()
                .collect(Collectors.toMap(CurrencyRateResponse::getCharCode, item -> item));
    }

    @Override
    @Cacheable(value = "plan")
    public Map<String, CurrencyRateResponse> getCurrencyRatesPlan() {
        log.info("Getting currency rates plan");
        String xml = cbClient.getCurrencyRatesPlan();
        return parser.parse(xml)
                .stream()
                .collect(Collectors.toMap(CurrencyRateResponse::getCharCode, item -> item));
    }

}
