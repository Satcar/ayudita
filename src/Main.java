import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       Switch.execute(sc);
       While.execute(sc);
       SwitchWhile.execute(sc);

        sc.close();
    }
}
