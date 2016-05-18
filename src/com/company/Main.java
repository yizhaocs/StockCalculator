package com.company;

import com.company.Calculators.AverageBookValueChangeCalculator;
import com.company.Calculators.BondCalculator;
import com.company.Calculators.IntrinsicValueCalculator;
import com.company.Calculators.YieldToMaturityYTMCalculator;
import com.company.Model.AverageBookValueChange;
import com.company.Model.BondPrice;
import com.company.Model.IntrinsicValue;
import com.company.Model.YieldToMaturity;

public class Main {

    public static void main(String[] args) {
        testData();

    }


    public static void testData(){
        /*
        * Intrinsic Value
        * */
        IntrinsicValue mIntrinsicValue = new IntrinsicValue();
        mIntrinsicValue.setCashTakenOutOfBusiness(0.0);
        mIntrinsicValue.setCurrentBookValue(48.0);
        mIntrinsicValue.setAveragePercentChangeInBookValuePerYear(6.0);
        mIntrinsicValue.setYears(10.0);
        mIntrinsicValue.setTenYearFederalNote(5.0);
        IntrinsicValueCalculator mIntrinsicValueCalculator = new IntrinsicValueCalculator();
        System.out.println("Intrinsic Value: $" + mIntrinsicValueCalculator.cal(mIntrinsicValue)); // 52.7724065270687


        /*
        * Average Book Value Change
        * */
        AverageBookValueChange mAverageBookValueChange = new AverageBookValueChange();
        mAverageBookValueChange.setCurrentBookValue(20.0);
        mAverageBookValueChange.setOldBookValue(10.0);
        mAverageBookValueChange.setNumberOfYearsBetweenBookValues(10.0);

        AverageBookValueChangeCalculator mAverageBookValueChangeCalculator = new AverageBookValueChangeCalculator();
        System.out.println("Average Book Value change (%): " + mAverageBookValueChangeCalculator.cal(mAverageBookValueChange)); // 7.177346253629313


        /*
        * Bond Price
        * */
        BondPrice mBondPrice = new BondPrice();
        mBondPrice.setCoupon(50.0);
        mBondPrice.setParValue(1000.0);
        mBondPrice.setYearsToMaturity(29.0);
        mBondPrice.setNewInterestRate(4.0);
        BondCalculator mBondCalculator = new BondCalculator();
        System.out.println("Bond Price: $" + mBondCalculator.cal(mBondPrice)); // $1169.8371463269107

        /*
        * Yield To Maturity
        * */

        YieldToMaturity mYieldToMaturity = new YieldToMaturity();

        YieldToMaturityYTMCalculator mYieldToMaturityYTMCalculator = new YieldToMaturityYTMCalculator();
        System.out.println("Yield to Maturity: " + mYieldToMaturityYTMCalculator.cal(mYieldToMaturity));
    }


}
