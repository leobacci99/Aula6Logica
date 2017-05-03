package aula6logica;

import java.util.Scanner;

public class Aula6Logica {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String play1;
        String play2;

        System.out.println("Conecta 4");

     

        String[][] tab = new String[7][6];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = " ";

                System.out.println(" | | | | | | |");
                System.out.println(" | | | | | | |");
                System.out.println(" | | | | | | |");
                System.out.println(" | | | | | | |");
                System.out.println(" | | | | | | |");
                System.out.println(" | | | | | | |");

            }

        }

    }

}
