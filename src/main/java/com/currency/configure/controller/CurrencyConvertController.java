package com.currency.configure.controller;

import com.currency.configure.domain.CurrencyExchangeRate;
import com.currency.configure.repository.CurrencyExchangeRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConvertController {
    @Autowired
    CurrencyExchangeRateRepository currencyExchangeRateRepository;

    @GetMapping("/api/v1/quote")
    public List<CurrencyExchangeRate> getAppVersion(@RequestParam String symbol){
        List<String> symbolList = Arrays.asList(symbol.split(","));
        return currencyExchangeRateRepository.countCurrencyExchangeRateBy(symbolList);
    }
}
