package org.veta;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 7) {
            System.out.println("Привет");
        }
        sc.close();
    }
}
