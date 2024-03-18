public class Main {
    public static void main(String[] args) {
        int initial_account = 100;
        int income = 1100;
        int bonus;
        if (income > 1000) {
            bonus = income / 100;
        } else {
           bonus = 0;
        }
        System.out.println(initial_account + income + bonus + "рублей");
    }

    }