package com.company.Calculators;

import com.company.Model.YieldToMaturity;

/**
 * Lesson 8 Value a Bond Yield to Maturity (YTM)
 * http://buffettsbooks.com/howtoinvestinstocks/course1/bonds-for-beginners/value-a-bond.html#sthash.NwwkeH4s.i7p5xpJK.dpbs
 */
public class YieldToMaturityYTMCalculator {


    // c=((coupon+(par-price)/year)/((par+price)/2))*100;
    public Double cal(YieldToMaturity mYieldToMaturity){
        Double coupon = mYieldToMaturity.getCoupon(); // Coupon -> This is the total coupons recieved for 1 year
        Double parValue = mYieldToMaturity.getParValue(); // par -> Par Value
        Double yearsToMaturity = mYieldToMaturity.getYearsToMaturity(); // year -> Years to Maturity
        Double marketPrice = mYieldToMaturity.getMarketPrice(); // price -> Market Price ($)

        Double c=((coupon+(parValue-marketPrice)/yearsToMaturity)/((parValue+marketPrice)/2))*100;
        return c;
    }
}
