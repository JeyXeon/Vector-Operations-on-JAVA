import java.util.Scanner;

public class input {
    public static double coordinate_X() {
        System.out.println("Введите координату x: ");
        Scanner console = new Scanner(System.in);
        double x = console.nextInt();
        return x;

    }
    public static double coordinate_Y() {
        System.out.println("Введите координату y: ");
        Scanner console = new Scanner(System.in);
        double y = console.nextInt();
        return y;

    }
    public static double coordinate_Z() {
        System.out.println("Введите координату z: ");
        Scanner console = new Scanner(System.in);
        double z = console.nextInt();
        return z;

    }
}

