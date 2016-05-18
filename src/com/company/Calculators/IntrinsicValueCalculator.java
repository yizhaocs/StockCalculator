package com.company.Calculators;

import com.company.Model.IntrinsicValue;

/**
 * LESSON 21 WARREN BUFFETT'S 4TH RULE: INTRINSIC VALUE CALCULATOR
 * http://buffettsbooks.com/howtoinvestinstocks/course2/stocks/intrinsic-value-calculator.html#sthash.0i6iAOlw.dpbs
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
