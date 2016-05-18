package com.company;

import com.company.Calculators.IntrinsicValueCalculator;
import com.company.DataSet.IntrinsicValueData;
import com.company.Model.IntrinsicValue;

public class Main {

    public static void main(String[] args) {
        IntrinsicValueCalculator mIntrinsicValueCalculator = new IntrinsicValueCalculator();

        IntrinsicValueData mIntrinsicValueData = new IntrinsicValueData();
        System.out.println(mIntrinsicValueCalculator.cal(mIntrinsicValueData.getmIntrinsicValue())); // 52.77
    }


}
