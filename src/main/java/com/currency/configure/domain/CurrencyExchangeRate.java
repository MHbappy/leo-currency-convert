package com.currency.configure.domain;

import com.currency.configure.enumuration.Countries;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyExchangeRate {

    @Id
    @SequenceGenerator(name = "sequenceGenerator")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    Countries fromCurrency;

    @Enumerated(EnumType.STRING)
    Countries toCurrency;

    Double close;

    Double ask;

    Double bid;

    Double open;

    Double high;

    Double low;

    LocalDateTime time;
}
