public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double kg = 49.1;
        double m = 1.56;
        int index = (int)service.calculate(kg, m);
        System.out.println("Индекс Вашего тела: " + index);

    }
}
