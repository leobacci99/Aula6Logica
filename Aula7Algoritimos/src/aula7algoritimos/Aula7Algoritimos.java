package aula7algoritimos;

import java.util.Scanner;

public class Aula7Algoritimos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);        
        int x, soma = 0;
        for (int i = 1; i < 10; i++ ) {
            System.out.println("Digite o item " + i);
            x = leitor.nextInt();
            soma = soma + x;
        }
        System.out.println("TOTAL: " + soma);
        
        
    }
    
}
