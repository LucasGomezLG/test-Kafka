package com.javatechie.cloud.stream.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TasaPublisher {

    private String originDate;

    private String estNumber;

    private String emitterBank;

    private String appliedRate;

    private String numPayments;

    private String amexPromo;

}
