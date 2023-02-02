package com.currency.configure.repository;

import com.currency.configure.domain.CurrencyExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CurrencyExchangeRateRepository extends JpaRepository<CurrencyExchangeRate, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM `currency_exchange_rate` WHERE concat(from_currency,to_currency) IN (?1)")
    List<CurrencyExchangeRate> countCurrencyExchangeRateBy(List<String> fromToCountry);
}
