package com.company.Calculators;

import com.company.Model.AverageBookValueChange;
import com.company.Model.IntrinsicValue;

/**
 * Created by yzfun on 5/17/16.
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
