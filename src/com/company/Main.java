package com.company;


//import

import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        String name = " NO NAME                         ";

        //System.out.println("");
        //while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("╔═════════════════════════════════╗");
            System.out.println("║            MAIN MENU            ║");
            System.out.println("╠═════════════════════════════════╣");
            System.out.println("║ 1) SETTINGS                     ║");
            System.out.println("║ 2) EXAMPLES                     ║");
            System.out.println("║ 3) PERSONALIZE                  ║");
            System.out.println("║ 4) LOCK                         ║");
            System.out.println("╠═════════════════════════════════╣");
            System.out.println("║" + name + "║");
            System.out.println("╚═════════════════════════════════╝");

            System.out.print("COMMAND: ");
            String command = scanner.nextLine();

            if (command == "LOCK") {

            }
        while (true) { System.out.println("HELLO!!"); java.util.concurrent.TimeUnit.MILLISECONDS.sleep(50); }

        //}
    }
}
