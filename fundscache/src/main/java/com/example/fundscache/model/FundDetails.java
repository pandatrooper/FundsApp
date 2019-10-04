package com.example.fundscache.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FundDetails {

    private final String name;
    private final int FundPrice;
    private final int FundUnits;

    public FundDetails(@JsonProperty("Name") String name,@JsonProperty("Price")  int fundPrice,@JsonProperty("Units")  int fundUnits) {
        this.name = name;
        FundPrice = fundPrice;
        FundUnits = fundUnits;
    }

    public String getName() {
        return name;
    }

    public int getFundPrice() {
        return FundPrice;
    }

    public int getFundUnits() {
        return FundUnits;
    }


}
