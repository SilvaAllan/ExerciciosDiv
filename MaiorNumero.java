
package exerciciosdiv;

import java.util.Scanner;

class MaiorNumero {
    int n1;
    int n2;
    public MaiorNumero(){
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        n1 = num.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = num.nextInt();
        
        if (n1 > n2){
            System.out.println(n1 +" is greater than "+ n2);
        }else {
            System.out.println(n2+ " is greater than " + n1);
        }
        
    
}
}