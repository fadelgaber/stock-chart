package com.stockchart.stockchart.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta {
    @JsonProperty("Symbol")
    private String symbol;
    @JsonProperty("Interval")
    private String interval;

    public Meta(){

    }

    public String getSymbol(){
        return symbol;
    }

    public void setSymbol(String symbol){
        this.symbol = symbol;
    }

    public String getInterval(){
        return interval;
    }

    public void setInterval(String interval){
        this.interval = interval;
    }
}