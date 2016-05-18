package com.company.DataSet;

import com.company.Model.IntrinsicValue;

/**
 * Created by yzfun on 5/17/16.
 */
public class IntrinsicValueData {
    private IntrinsicValue mIntrinsicValue;

    // expected result: 52.7724065270687
    public IntrinsicValueData(){
        mIntrinsicValue = new IntrinsicValue();
        mIntrinsicValue.setCashTakenOutOfBusiness(0.0);
        mIntrinsicValue.setCurrentBookValue(48.0);
        mIntrinsicValue.setAveragePercentChangeInBookValuePerYear(6.0);
        mIntrinsicValue.setYears(10);
        mIntrinsicValue.setTenYearFederalNote(5.0);
    }

    public IntrinsicValue getmIntrinsicValue() {
        return mIntrinsicValue;
    }
}
