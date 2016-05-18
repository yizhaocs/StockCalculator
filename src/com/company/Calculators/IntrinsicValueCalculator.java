package com.company.Calculators;

import com.company.Model.IntrinsicValue;

/**
 * Created by yzfun on 5/17/16.
 */
public class IntrinsicValueCalculator {
    public Double cal(IntrinsicValue mIntrinsicValue) {
        Double cashTakenOutOfBusiness = mIntrinsicValue.getCashTakenOutOfBusiness();
        Double currentBookValue = mIntrinsicValue.getCurrentBookValue();
        Double averagePercentChangeInBookValuePerYear = mIntrinsicValue.getAveragePercentChangeInBookValuePerYear();
        Double years = mIntrinsicValue.getYears();
        Double tenYearFederalNote = mIntrinsicValue.getTenYearFederalNote();

        Double perc = (1 + averagePercentChangeInBookValuePerYear / 100);
        Double base = Math.pow(perc, years);
        Double parr = currentBookValue * base;
        tenYearFederalNote = tenYearFederalNote / 100;

        Double extra = Math.pow((1 + tenYearFederalNote), years);

        Double c = cashTakenOutOfBusiness * (1 - (1 / extra)) / tenYearFederalNote + parr / extra;


        return c;
    }
}
