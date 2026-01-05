package de0915;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math;

public class Ld4_241RDB316 {
    public static void main(String[] args) {
        double x = 0, y = 0, V0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("241RDB316");
            System.out.println("Vladislav Ebert");
            System.out.println("7");
            System.out.print("V0: ");
            V0 = sc.nextDouble();
            double t = 0.05, a = 50, g = 23.95;
            boolean hitTarget = false;
            boolean grunts = false;

            System.out.println("t\t\tx\t\ty");
            do {
                x = V0 * t * Math.cos(Math.toRadians(a));
                y = V0 * t * Math.sin(Math.toRadians(a)) - ((g * (t * t)) / 2);

                System.out.printf("%.2f\t\t%.2f\t\t%.2f\n", t, x, y);

                grunts = (((x >= 0) && (x <= 11) && (y >= -8) && (y <= 0)) || ((x >= 11) && (x <= 23) && (y >= -8) && (y <= -7)));
                boolean Merkis = ((x >= 17) && (x <= 20) && (y >= -7) && (y <= -2));

                if (Merkis) {
                    hitTarget = true;
                    break;
                }//Man ir sajuta, ka šeit vajag izveidot break gruntam
                // Vajag notestet

                t += 0.05;
            } while (y >= -8);

            if (hitTarget) {
                System.out.println("the target was destroyed");
            } else if (grunts) {
                System.out.println("shot off the target");
            } else {
                System.out.println("shot off the target");
            }

            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Nav reāli skaitli");
        }
    }
}