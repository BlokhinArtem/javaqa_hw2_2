public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int income = 1100;
        int bonus;
        if (income > 1000) {
            bonus = income / 100;
        } else {
            bonus = 0;
        }
        System.out.println(initialAccount + income + bonus + "рублей");
    }

}