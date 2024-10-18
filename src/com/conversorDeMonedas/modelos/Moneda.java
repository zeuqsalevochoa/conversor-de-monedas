package com.conversorDeMonedas.modelos;

import java.util.Map;

public class Moneda {
    private String result;
    private String base_code;
    private Map<String, Double> conversion_rates;
    private String time_last_update_utc;
    // Setters y Getters
    public String getResult() {
        return result;
    }

    public String getBase_code() {
        return base_code;
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    public String getTime_last_update_utc() {
        return time_last_update_utc;
    }
}
