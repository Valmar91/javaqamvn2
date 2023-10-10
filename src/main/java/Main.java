import ru.netology.services.BonusService;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        System.out.println(service.calculate(10_000, 3_000, 20_000));
    }
}