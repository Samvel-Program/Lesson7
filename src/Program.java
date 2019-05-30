import java.util.Scanner;

/**
 * Created by OUT-Akopyan-SR on 16.05.2019.
 */
public class Program {

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int x = 20;
        int y = 40;
        int z = 60;

        if (t == x)
        {
            System.out.println("Данное значение имеется в константах");

            if (t == y)

                System.out.println("Данное значение имеется в константах");

            if (t == z)

                System.out.println("Данное значение имеется в константах");
        }
        else {
            System.out.println("Такой константы нет!");
        }
    }


}
