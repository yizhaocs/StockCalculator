package com.company.Model;

/**
 * Created by yzfun on 5/17/16.
 */
public class AverageBookValueChange {
    private Double currentBookValue; // cbv -> Current Book Value
    private Double oldBookValue; // obv -> Old Book Value
    private Double numberOfYearsBetweenBookValues; // years -> # of Years between Book Values

    public Double getCurrentBookValue() {
        return currentBookValue;
    }

    public void setCurrentBookValue(Double currentBookValue) {
        this.currentBookValue = currentBookValue;
    }

    public Double getOldBookValue() {
        return oldBookValue;
    }

    public void setOldBookValue(Double oldBookValue) {
        this.oldBookValue = oldBookValue;
    }

    public Double getNumberOfYearsBetweenBookValues() {
        return numberOfYearsBetweenBookValues;
    }

    public void setNumberOfYearsBetweenBookValues(Double numberOfYearsBetweenBookValues) {
        this.numberOfYearsBetweenBookValues = numberOfYearsBetweenBookValues;
    }
}
