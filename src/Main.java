public class Main {
    public static void main(String[] args) {

        int initialAccount = 2843;
        int add = 1001;
        int bonus;

        if (add > 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }

        int finalAccount = initialAccount + add + bonus;

        System.out.println("Итоговый счёт: " + finalAccount);
        System.out.println("Бонус: " + bonus);

    }
}
