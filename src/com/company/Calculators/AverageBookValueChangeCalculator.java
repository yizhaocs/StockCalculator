package com.company.Calculators;

import com.company.Model.AverageBookValueChange;
import com.company.Model.IntrinsicValue;

/**
 * LESSON 21 WARREN BUFFETT'S 4TH RULE: INTRINSIC VALUE CALCULATOR
 * http://buffettsbooks.com/howtoinvestinstocks/course2/stocks/intrinsic-value-calculator.html#sthash.0i6iAOlw.dpbs
 */
public class AverageBookValueChangeCalculator {
/*
    upper=1/years;
    base=cbv/obv;
    a=Math.pow(base,upper);
    c=100*(a-1);*/
    public Double cal(AverageBookValueChange mAverageBookValueChange) {
        Double currentBookValue = mAverageBookValueChange.getCurrentBookValue(); // cbv -> Current Book Value
        Double oldBookValue = mAverageBookValueChange.getOldBookValue(); // obv -> Old Book Value
        Double numberOfYearsBetweenBookValues = mAverageBookValueChange.getNumberOfYearsBetweenBookValues();

        Double upper=1/numberOfYearsBetweenBookValues;
        Double base=currentBookValue/oldBookValue;
        Double a=Math.pow(base,upper);
        Double c=100*(a-1);
        return c;
    }
}
