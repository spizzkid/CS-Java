/**
 * This is Fraction object
 * @author Jiacheng Jiang
 * @version 1.0 Aug 18 2020
 */
public class Fraction {
   // ********** Fields ****************

    private int numerator;
    private int denominator;



    /**
     * This is dealt constructor which set both numerator and denominator to 1
     */
    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    /**
     * This is full constructor which get numerator and denominator from the input value
     * @param numerator numerator of a fraction
     * @param denominator denominator of a fraction
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if(denominator == 0)
            this.denominator = 1;
    }

    /**
     * This method convert numerator and denominator from int to string, then return them
     * @return  String format of a fraction
     */
    public String toString() {
        String n = String.valueOf(numerator);
        String d = String.valueOf(denominator);
        if (denominator == 1 )
            return n;
        else
            return n + "/" + d;
    }

    /**
     * Get numerator for a fraction
     * @return numerator of a fraction
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Get denominator of a fraction
     * @return  denominator of a fraction
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Set numerator to the input value
     * @param numerator input value for the numerator
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Set denominator to the input value, if it's 0 then set it to 1
     * @param denominator input value for the denominator
     */
    public void setDenominator(int denominator) {
        this.denominator = denominator;
        if (denominator == 0)
            this.denominator = 1;
    }

    /**
     * Get the decimal value of a fraction
     * @return decimal value of a fraction
     */
    public double getDecimalValue() {
        return (double) numerator/denominator;
    }

    /**
     * Determine if decimal value of two fractions are equal
     * @param other Target fraction compare with original fraction
     * @return result of comparison
     */
    public boolean equals(Fraction other) {
        double deci = (double) numerator/denominator;
        double deci2 = (double) other.numerator/other.denominator;

        return deci == deci2;
    }

    /**
     * Multiply two fractions
     * @param other Target fraction multiply with original one
     */
    public void multiply(Fraction other) {

        this.numerator *= other.numerator;
        this.denominator *= other.denominator;
    }

}
