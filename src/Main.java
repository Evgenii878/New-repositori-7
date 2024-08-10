
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 58;
        double height = 1.65;
        int bmiIndex = service.calculate(weight, height);
        System.out.println("Индекс массы тела:" + bmiIndex);
    }
}











