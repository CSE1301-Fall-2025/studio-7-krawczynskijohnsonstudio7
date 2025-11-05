public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numer, int denomer) {
        this.numerator = numer;
        this.denominator = denomer;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double value() {
        return (double) numerator/denominator;
    }

    public static double sum(Fraction frac1, Fraction frac2) {
        return frac1.value()+frac2.value();
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(9,12);
        System.out.println(sum(f1, f2));
    }
}
