package aula7algoritimos;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner visor = new Scanner(System.in);
        int x, resto = 0;
        System.out.println("Digite o Numero");
        x = visor.nextInt();
        
        for (int i = 1; i < x ; i++) {
            resto = x % 2;
            if (resto == 1) {
                 System.out.println("Numero" + resto);
            
            }
           
        }
        
        
    }
    
}
