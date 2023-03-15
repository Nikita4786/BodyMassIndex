public class BmiService {
    public double calculate(double rostSm, double vesKg) {
        double bmi = vesKg / ((rostSm / 100) * (rostSm / 100));
        return bmi;
    }
}
