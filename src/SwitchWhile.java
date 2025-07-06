import java.util.Scanner;

public class SwitchWhile {
    public static void execute(Scanner sc) {

        String rocketSound = "El cohete suena ziuuum!";
        String bikeSound = "La moto suena brrrmmm!";
        String menu =
        """
        Elige que sonido quieres escuchar:
        1-cohete, y suena ziuuum!
        3-moto, y suena brrrmmmm!
        """;


        System.out.printf(menu);

        String sound = sc.nextLine().trim();

        while (true) {

            switch (sound) {
                case "1":
                    System.out.println(rocketSound);
                    break;
                case "3":
                    System.out.println(bikeSound);
                    break;
                default:
                    System.out.println("No reconozco este sonido...");
            }

            System.out.println("Quieres escuchar otro sonido? si/no");
            String answer = sc.nextLine().trim().toLowerCase();

            if (answer.equals("si")) {
                System.out.printf("Genial!\n" + menu);
                sound = sc.nextLine().trim();
            } else {
                System.out.println("Hasta la proxima!");
                break;
            }
        }
    }
}
