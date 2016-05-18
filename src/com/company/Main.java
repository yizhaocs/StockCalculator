package com.company;

import com.company.Calculators.AverageBookValueChangeCalculator;
import com.company.Calculators.IntrinsicValueCalculator;
import com.company.Model.AverageBookValueChange;
import com.company.Model.IntrinsicValue;

public class Main {

    public static void main(String[] args) {
        testData();

    }


    public static void testData(){
        IntrinsicValue mIntrinsicValue = new IntrinsicValue();
        mIntrinsicValue.setCashTakenOutOfBusiness(0.0);
        mIntrinsicValue.setCurrentBookValue(48.0);
        mIntrinsicValue.setAveragePercentChangeInBookValuePerYear(6.0);
        mIntrinsicValue.setYears(10.0);
        mIntrinsicValue.setTenYearFederalNote(5.0);
        IntrinsicValueCalculator mIntrinsicValueCalculator = new IntrinsicValueCalculator();
        System.out.println("Intrinsic Value: $" + mIntrinsicValueCalculator.cal(mIntrinsicValue)); // 52.7724065270687


        AverageBookValueChange mAverageBookValueChange = new AverageBookValueChange();
        mAverageBookValueChange.setCurrentBookValue(20.0);
        mAverageBookValueChange.setOldBookValue(10.0);
        mAverageBookValueChange.setNumberOfYearsBetweenBookValues(10.0);

        AverageBookValueChangeCalculator mAverageBookValueChangeCalculator = new AverageBookValueChangeCalculator();
        System.out.println("Average Book Value change (%): " + mAverageBookValueChangeCalculator.cal(mAverageBookValueChange)); // 7.177346253629313
    }


}
