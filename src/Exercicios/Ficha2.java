package Exercicios;

/**
 *
 * @author fenia
 */
import java.io.*;
import java.util.*;

public class Ficha2 {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public void exercicio1 () throws IOException{
        float soma = 0, med = 0;
        
        for (int i = 0; i <= 2; i++) {
            System.out.println("Introduza a " + (i + 1) + "ª nota:");
            float nota = Float.parseFloat(br.readLine());
            
            if (nota >= 0 && nota <= 20) {
                soma += nota;
            }else{
                System.err.println("Digite as notas num valor de 0...20!"); 
                System.out.println("\nIntroduza a " + (i + 1) + "ª nota:");
                nota = Float.parseFloat(br.readLine());
                soma += nota;
            }
        }
        
        if (soma/3 < 10) {
            System.out.println("Excluido");
        } else if (soma/3 < 14) {
            System.out.println("Admitido");
        } else {
            System.out.println("Dispensado");
        }
    }
    
    public void exercicio2 () throws Exception{
        Float[] numeros = new Float[5];
        
        for (int i = 0; i <= 4; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero:");
            numeros[i] = Float.parseFloat(br.readLine());
        }
        
        Arrays.sort(numeros);
        System.out.println(Arrays.asList(numeros));
    }
    
    public void exercicio3 () throws Exception{
        //Float[] fim = {00.0, 04.0, 08.0};
    }
    
    public void exercicio4() throws Exception{
        
        System.out.println("Digite o 1º numero:");
        float numeros = Float.parseFloat(br.readLine());
        System.out.println("Digite o 2º numero:");
        float numeros1 = Float.parseFloat(br.readLine());
        
        System.out.println("\nDigite o operador:");
        switch(br.readLine().charAt(0)){
            case '+' : System.out.println("\nA soma é " + (numeros + numeros1)); break;
            case '-' : System.out.println("\nA subtracao é " + (numeros - numeros1)); break;
            case '*' : System.out.println("\nA multiplicacao é " + (numeros * numeros1)); break;
            case '/' : System.out.println("\nA divisao é " + (numeros / numeros1)); break;
        }
    }

    public static void main(String[] args) throws Exception{
        Ficha2 f = new Ficha2();
        f.exercicio4();
    }
    
}
