package net.htlgkr.kollnbergert22094;

public class RationalCalculator extends AbstractCalculator {
    public RationalCalculator(CalculationOperation add, CalculationOperation substract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, substract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        return super.add.calc(a,b);
    }

    @Override
    public Number substract(Number a, Number b) {
        return super.substract.calc(a, b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return super.multiply.calc(a, b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return super.divide.calc(a, b);
    }
}
