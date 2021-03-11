package com.javatechie.cloud.stream.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TasaGobierno {

    private Date fecha_desde;
    private Date fecha_hasta;
    private int nro_cuotas;
    private BigDecimal tasa;
    private int tipo_tasa;

}
