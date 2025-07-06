import java.util.Scanner;

public class Switch {

    public static void execute(Scanner sc){

        System.out.printf("En que estacion del año nos encontramos? ");
        String season = sc.nextLine();

        switch (season.trim().toLowerCase()) {
            case "primavera":
                System.out.println("Las flores empiezan a abrirse y el aire huele a nuevos comienzos.");
                break;
            case "verano":
                System.out.println("Es tiempo de sol, vacaciones y días largos para disfrutar al máximo.");
                break;
            case "otoño":
                System.out.println("Las hojas caen y el ambiente se llena de colores cálidos y nostalgia.");
                break;
            case "invierno":
                System.out.println("El frío invita a quedarse en casa, abrigado y con una taza caliente.");
                break;
            default:
                System.out.println("No reconozco esa estación... ¡quizá vienes de otro planeta!");
        }
    }

}
