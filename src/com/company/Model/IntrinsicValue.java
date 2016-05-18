package com.company.Model;

/**
 * Created by yzfun on 5/17/16.
 */
public class IntrinsicValue {
    private Double cashTakenOutOfBusiness; // Cash Taken out of business -> This is dividends recieved for 1 year
    private Double currentBookValue; // Current Book Value -> We need to know this so we can determine the base value that's changing
    private Double averagePercentChangeInBookValuePerYear; // Average Percent Change in book value per year -> This will determine the estimate BV at the end of the next 10 years
    private Integer years; // Years -> This will most likely be 10 (if you're comparing a 10 year federal note)
    private Double tenYearFederalNote; // 10 year federal note -> Look up the ten year treasury note by clicking on this text

    public Double getCashTakenOutOfBusiness() {
        return cashTakenOutOfBusiness;
    }

    public void setCashTakenOutOfBusiness(Double cashTakenOutOfBusiness) {
        this.cashTakenOutOfBusiness = cashTakenOutOfBusiness;
    }

    public Double getCurrentBookValue() {
        return currentBookValue;
    }

    public void setCurrentBookValue(Double currentBookValue) {
        this.currentBookValue = currentBookValue;
    }

    public Double getAveragePercentChangeInBookValuePerYear() {
        return averagePercentChangeInBookValuePerYear;
    }

    public void setAveragePercentChangeInBookValuePerYear(Double averagePercentChangeInBookValuePerYear) {
        this.averagePercentChangeInBookValuePerYear = averagePercentChangeInBookValuePerYear;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public Double getTenYearFederalNote() {
        return tenYearFederalNote;
    }

    public void setTenYearFederalNote(Double tenYearFederalNote) {
        this.tenYearFederalNote = tenYearFederalNote;
    }
}
