import java.util.Scanner;

public class While {
    public static void execute(Scanner sc) {

        System.out.printf("Una ayudita? (si/no) ");
        String answer = sc.nextLine().trim().toLowerCase();
        double amount = 0;
        int cnt = 0;

        while (answer.equals("si")) {
            System.out.printf("Genial! Cuanto dinero quieres donar? (€): ");
            amount += Double.parseDouble(sc.nextLine());
            cnt++;

            System.out.println("Quieres seguir donando? si/no");
            answer = sc.nextLine().trim().toLowerCase();
        }

        if (cnt > 0) {
            System.out.printf("Genial! Hemos recaudado %.2f € gracias a la contribucion de %d personas", amount, cnt);
        } else {
            System.out.println("Lastima... me voy deprimido");
        }
    }
}
