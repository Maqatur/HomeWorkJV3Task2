public class BmiService {
    public double calculate(double kg, double m) {
        double m2 = Math.pow(m, 2);
        double index = kg / m2;
        return index;
    }
}
