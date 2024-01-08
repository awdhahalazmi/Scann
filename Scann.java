package Scann;

import java.util.Scanner;

public class Scann {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        String username = myScanner.nextLine();
        int password = myScanner.nextInt();
        if (password == 1234) {
            System.out.println("welcome" + username);
        } else {
            System.out.println("Access denied");
        }

    }
}
