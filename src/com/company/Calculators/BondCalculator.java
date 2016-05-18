package com.company.Calculators;

import com.company.Model.BondPrice;

/**
 * Created by yzfun on 5/17/16.
 */
public class BondCalculator {
    /*
        r=r/100;
        base=Math.pow((1+r),year);
        c=coupon*((1-(1/(base)))/r)+par/(base);
    */
    public Double cal(BondPrice mBondPrice){
        Double coupon = mBondPrice.getCoupon(); // coupon -> Coupon -> This is the annual coupon payment in dollars.
        Double parValue = mBondPrice.getParValue(); // par -> Par Value
        Double yearsToMaturity = mBondPrice.getYearsToMaturity(); // year -> Years to Maturity
        Double newInterestRate = mBondPrice.getNewInterestRate(); // r -> New Interest rate -> This is the new interest rate that a person could get.

        newInterestRate=newInterestRate/100;
        Double base=Math.pow((1+newInterestRate),yearsToMaturity);
        Double c=coupon*((1-(1/(base)))/newInterestRate)+parValue/(base);

        return c;
    }
}
