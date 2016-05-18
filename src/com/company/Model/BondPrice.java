package com.company.Model;

/**
 * Created by yzfun on 5/17/16.
 */
public class BondPrice {
    private Double coupon; // coupon -> Coupon -> This is the annual coupon payment in dollars.
    private Double parValue; // par -> Par Value
    private Double yearsToMaturity; // year -> Years to Maturity
    private Double newInterestRate; // r -> New Interest rate -> This is the new interest rate that a person could get.

    public Double getCoupon() {
        return coupon;
    }

    public void setCoupon(Double coupon) {
        this.coupon = coupon;
    }

    public Double getParValue() {
        return parValue;
    }

    public void setParValue(Double parValue) {
        this.parValue = parValue;
    }

    public Double getYearsToMaturity() {
        return yearsToMaturity;
    }

    public void setYearsToMaturity(Double yearsToMaturity) {
        this.yearsToMaturity = yearsToMaturity;
    }

    public Double getNewInterestRate() {
        return newInterestRate;
    }

    public void setNewInterestRate(Double newInterestRate) {
        this.newInterestRate = newInterestRate;
    }
}
