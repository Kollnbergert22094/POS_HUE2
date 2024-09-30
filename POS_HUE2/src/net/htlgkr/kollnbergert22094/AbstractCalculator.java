package net.htlgkr.kollnbergert22094;

public abstract class AbstractCalculator {
    protected CalculationOperation add;
    protected CalculationOperation substract;
    protected CalculationOperation multiply;
    protected CalculationOperation divide;

    public AbstractCalculator(CalculationOperation add, CalculationOperation substract, CalculationOperation multiply, CalculationOperation divide) {
        this.add = add;
        this.substract = substract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public abstract java.lang.Number add(java.lang.Number a, java.lang.Number b);
    public abstract java.lang.Number substract(java.lang.Number a, java.lang.Number b);
    public abstract java.lang.Number multiply(java.lang.Number a, java.lang.Number b);
    public abstract java.lang.Number divide(java.lang.Number a, java.lang.Number b);
}
