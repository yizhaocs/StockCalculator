package com.company;

import com.company.Model.IntrinsicValue;

public class Main {

    public static void main(String[] args) {
        IntrinsicValue mIntrinsicValue = new IntrinsicValue();
    }


    public static Double intrinsicValueCalculator(IntrinsicValue mIntrinsicValue) {
        Double cashTakenOutOfBusiness = mIntrinsicValue.getCashTakenOutOfBusiness();
        Double currentBookValue = mIntrinsicValue.getCurrentBookValue();
        Double averagePercentChangeInBookValuePerYear = mIntrinsicValue.getAveragePercentChangeInBookValuePerYear();
        Integer years = mIntrinsicValue.getYears();
        Double tenYearFederalNote = mIntrinsicValue.getTenYearFederalNote();
        return null;
    }
}
