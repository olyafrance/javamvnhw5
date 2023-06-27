public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount = 1_000_000, registered = false);
        System.out.println(expected + "==?==" + actual);
    }
}
