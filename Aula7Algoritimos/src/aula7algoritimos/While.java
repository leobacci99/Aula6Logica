package aula7algoritimos;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i = 0, soma = 0, x;
        
        while (i<10) {            
            System.out.println("Linha " + i);
            i = i + 1;
        }
        
        //Do while
           while (i<10) {            
            System.out.println("Digite o item " + i);
            x = leitor.nextInt();
            if (x<0) {
                System.err.println("NUMERO INVALIDO");
                break;
            }
            soma = soma + x;
            i = i + 1;
        }
        System.out.println("Total: " + soma);
        
        
    }
    
}
