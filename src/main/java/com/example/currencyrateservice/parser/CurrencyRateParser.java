package com.example.currencyrateservice.parser;

import com.example.currencyrateservice.dto.CurrencyRateResponse;

import java.util.List;

public interface CurrencyRateParser {
    List<CurrencyRateResponse> parse(String ratesAsString);
}
