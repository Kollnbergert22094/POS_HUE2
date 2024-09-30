package net.htlgkr.kollnbergert22094;

public class RationalCalculator extends AbstractCalculator {
    public RationalCalculator(CalculationOperation add, CalculationOperation substract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, substract, multiply, divide);
    }

    @Override
    public java.lang.Number add(java.lang.Number a, java.lang.Number b) {
        return super.add.calc(a,b);
    }

    @Override
    public java.lang.Number substract(java.lang.Number a, java.lang.Number b) {
        return super.substract.calc(a, b);
    }

    @Override
    public java.lang.Number multiply(java.lang.Number a, java.lang.Number b) {
        return super.multiply.calc(a, b);
    }

    @Override
    public java.lang.Number divide(java.lang.Number a, java.lang.Number b) {
        return super.divide.calc(a, b);
    }
}
