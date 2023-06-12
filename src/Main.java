public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        // int price = 10_000;
        double index = service.calculate(98, 1.87); // должно получиться 500
        System.out.println(index);
    }
}