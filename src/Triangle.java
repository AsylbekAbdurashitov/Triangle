import java.util.Scanner;

public class Triangle {
       /*** "area" методу полелериндеги маалыматтарга(маалымат объектти тузгондон кийин берилет)

    таянып консолго уч бурчтуктун аянтын чыгарсын*/
    double a;
    double b;
    double c;

    public void area() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A:");
        double a = scanner.nextDouble();
        System.out.println("B:");
        double b = scanner.nextDouble();
        System.out.println("C:");
        double c = scanner.nextDouble();
        double p = (a + b + c) / 2;
        System.out.println("Ayanty:" + Math.sqrt(p * (p - a) * (p - b) * (p - c)));


    }
}



