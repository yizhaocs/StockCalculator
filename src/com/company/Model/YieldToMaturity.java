package com.company.Model;

/**
 * Created by yzfun on 5/17/16.
 */
public class YieldToMaturity {
    private Double coupon; // Coupon -> This is the total coupons recieved for 1 year
    private Double parValue; // par -> Par Value
    private Double yearsToMaturity; // year -> Years to Maturity
    private Double marketPrice; // price -> Market Price ($)

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

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }
}
