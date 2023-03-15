public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double imt = service.calculate(178, 102);
        int bmi = (int) imt;

        System.out.println("индекс массы тела:" + bmi);
    }
}