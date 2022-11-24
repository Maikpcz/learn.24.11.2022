package de.neueFische;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] name = new String[11];
        name[0] = "null" ;
        name[1] = "eins";
        name[2] = "zwei";
        name[3] = "drei";
        name[4] = "vier";
        name[5] = "fünf";
        name[6] = "sechs";
        name[7] = "sieben";
        name[8] = "acht";
        name[9] = "neuen";
        name[10] = "zehn";

        //System.out.println(fünfMalSchleife(5));
        //groeßerAlsNull(0);
        //greetingsscanner("Maik");
        //System.out.println(name[5]);


    }



        public static String namedefinieren(String name1){
         return name1;
        }
        public static String fünfMalSchleife(int schleife1){

        for (int i = 0; i< schleife1; i++) {
            System.out.println(namedefinieren("Maik"));
        }
        return "";

        }
        public static boolean groeßerAlsNull(int many){
            if (many > 0);
            System.out.println(many + "ist groeßer als 0");
            return true;
        }
    public static void greetingsscanner(String greeting){
        greeting = "Maik";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hallo. Wie heisst du?");
        String greeting1 = scanner.nextLine();

        System.out.println("Hallo." + "wie geht es dir " + greeting1);
    }
}