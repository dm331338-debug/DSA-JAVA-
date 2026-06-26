package Basic;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
//        Area Of Circle = pi*r*r
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius-" + " ");
        double r = sc.nextInt();
        double a = 3.141592 * r * r;
        System.out.print("Area Of Circle is- ");
        System.out.println(3.14*r*r);


    }
}
