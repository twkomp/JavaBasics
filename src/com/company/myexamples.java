package com.company;

//import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

public class myexamples {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] args) throws InterruptedException {
        //for(int i=0;i<=100;i++){
        //System.out.println(i);
        //}

        double r = 0;
        int intr = 0;
        System.out.println(ANSI_GREEN + "wow" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "R" + ANSI_RESET + ANSI_RED + "A" + ANSI_RESET + ANSI_GREEN + "I" + ANSI_YELLOW + ANSI_BLUE + "N" + ANSI_RESET + ANSI_CYAN + "B" + ANSI_RESET + ANSI_PURPLE + "O" + ANSI_RESET + ANSI_RED + "W" + ANSI_RESET);
        for(int i=0;i<=100;i++){
            System.out.print(ANSI_GREEN + "R" + ANSI_RESET + ANSI_RED + "A" + ANSI_RESET + ANSI_GREEN + "I" + ANSI_YELLOW + ANSI_BLUE + "N" + ANSI_RESET + ANSI_CYAN + "B" + ANSI_RESET + ANSI_PURPLE + "O" + ANSI_RESET + ANSI_RED + "W" + ANSI_RESET);
            for(int a=0;a<=i;a++) {

                intr = (int)(Math.random() * ((7 - 1) + 1)) + 1;
                if(intr == 1) {
                    System.out.print(ANSI_PURPLE);
                }
                if(intr == 2) {
                    System.out.print(ANSI_RED);
                }
                if(intr == 3) {
                    System.out.print(ANSI_GREEN);
                }
                if(intr == 4) {
                    System.out.print(ANSI_YELLOW);
                }
                if(intr == 5) {
                    System.out.print(ANSI_CYAN);
                }
                if(intr == 6) {
                    System.out.print(ANSI_BLUE);
                }
                if(intr == 7) {
                    System.out.print(ANSI_BLACK);
                }
                System.out.print("!" + ANSI_RESET); //RAINBOW!!!!!!!!!!!!!!!!!!!
            }
            System.out.println();
        }

        java.util.concurrent.TimeUnit.MILLISECONDS.sleep(50);


        // 2nd color example
        for(int b=0;b<=500;b++) {
            for(int c=0;c<=210;c++) {
                intr = (int)(Math.random() * ((7 - 1) + 1)) + 1;
                if(intr == 1) {
                    System.out.print(ANSI_PURPLE);
                }
                if(intr == 2) {
                    System.out.print(ANSI_RED);
                }
                if(intr == 3) {
                    System.out.print(ANSI_GREEN);
                }
                if(intr == 4) {
                    System.out.print(ANSI_YELLOW);
                }
                if(intr == 5) {
                    System.out.print(ANSI_CYAN);
                }
                if(intr == 6) {
                    System.out.print(ANSI_BLUE);
                }
                if(intr == 7) {
                    System.out.print(ANSI_BLACK);
                }

                int intr2 = (int)(Math.random() * ((7 - 1) + 1)) + 1;
                if(intr2 == 1) {
                    System.out.print(ANSI_PURPLE_BACKGROUND);
                }
                if(intr2 == 2) {
                    System.out.print(ANSI_RED_BACKGROUND);
                }
                if(intr2 == 3) {
                    System.out.print(ANSI_GREEN_BACKGROUND);
                }
                if(intr2 == 4) {
                    System.out.print(ANSI_YELLOW_BACKGROUND);
                }
                if(intr2 == 5) {
                    System.out.print(ANSI_CYAN_BACKGROUND);
                }
                if(intr2 == 6) {
                    System.out.print(ANSI_BLUE_BACKGROUND);
                }
                if(intr2 == 7) {
                    System.out.print(ANSI_BLACK_BACKGROUND);
                }
                System.out.print("▄" + ANSI_RESET);
            }
            System.out.println();
            //TimeUnit.MILLISECONDS.sleep(100);
        }
        // bw static
        for(int b=0;b<=500;b++) {
            for (int c = 0; c <= 210; c++) {

                int intr2 = (int) (Math.random() * ((2 - 1) + 1)) + 1;
                int intr1 = (int) (Math.random() * ((2 - 1) + 1)) + 1;
                int intr3 = (int) (Math.random() * ((5000 - 1) + 1)) + 1;
                if (intr1 == 1) {
                    System.out.print(ANSI_WHITE_BACKGROUND);
                }
                if (intr1 == 2) {
                    System.out.print(ANSI_BLACK_BACKGROUND);
                }
                if (intr2 == 1) {
                    System.out.print(ANSI_WHITE);
                }
                if (intr2 == 2) {
                    System.out.print(ANSI_BLACK);
                }
                if (intr3 == 2) {
                    System.out.print("Hello");
                    c = c + 5;
                }

                System.out.print("▄" + ANSI_RESET);
            }
            System.out.println();
        }

    }
}
