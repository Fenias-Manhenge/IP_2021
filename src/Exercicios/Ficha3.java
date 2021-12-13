package Exercicios;

/**
 *
 * @author Fenias 
 */

import java.util.*;
import java.util.Collections;
import java.io.*;

public class Ficha3 {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Random r;
    
    public void exercicio3() throws IOException{
        System.out.println("Quantos numeros pretende introduzir?");
        int intr = Integer.parseInt(br.readLine());
        
        
        Integer[] nrs = new Integer[intr];
        
        for (int i = 0; i < nrs.length; i++) {
            System.out.println((i + 1) + "º numero:");
            nrs[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println("""
                           
                           1_ Imprimir o conteudo do Array
                           2_ Imprimir o maior numero
                           3_ Imprimir o menor numero
                           """);
        
        switch(Integer.parseInt(br.readLine())){
            case 1: System.out.println(Arrays.asList(nrs)); break;
            case 2: 
                int maior = nrs[0];
                for (int i = 0; i < nrs.length; i++) {
                    if (maior < nrs[i]) {
                        maior = nrs[i];
                    }
                }
                System.out.println("Maior numero: " + maior); break;
            case 3: 
                int menor = nrs[0];
                for (int i = 0; i < nrs.length; i++) {
                    if (menor > nrs[i]) {
                        menor = nrs[i];
                    }
                } 
                System.out.println("Maior numero: " + menor); break;
            default: System.err.println("Escolha uma das opcoes [ 1 | 2 | 3 ]"); break;
        }
    }
    
    public void exercicio4() throws IOException{
        Integer[] nrs10 = new Integer[3];
        
        for (int i = 0; i < nrs10.length; i++) {
            System.out.println((i + 1) + "º numero:");
            nrs10[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println("Verifique se um elemento esta contido no Array");
        int existe = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < nrs10.length; i++) {
            if (existe == nrs10[i]) {
                System.out.println("O Numero esta na posicao " + i + " do Array"); break;
            } else {
                System.err.println("O numero  nao esta contido no Array"); break;
            }
        }
    }
    
    public void exercicio5() throws IOException{
        
        Integer[] array1 = new Integer[5], array2 = new Integer[5], array3 = new Integer[5];
        
        r = new Random();
        
        int soma = 0;
        
        for (int i = 0; i < array1.length; i++) {
            array1[i] = r.nextInt(10);
            array2[i] = r.nextInt(10);
            soma = array1[i] + array2[i];

            array3[i] = soma;
        }
        
        System.out.print("Array 1: " + Arrays.asList(array1));
        System.out.print("\nArray 2: " + Arrays.asList(array2));
        System.out.print("\nArray 3: " + Arrays.asList(array3));
    }
    
    public void exercicio6() throws IOException{
        Integer nrsImp[] = new Integer[10], nrsPar[] = new Integer[5];
        
        System.out.println("""
                           I - Impares
                           P - pares
                           """);
        
        switch(br.readLine().charAt(0)){
            case 'I':
                for (int i = 0; i < nrsImp.length; i++) {
                    System.out.println((i + 1) + "º numero:");
                    nrsImp[i] = Integer.parseInt(br.readLine());

                    if (nrsImp[i] % 2 == 1) {
                        nrsImp[i] = nrsImp[i];
                    }
                    
                    while (nrsImp[i] % 2 == 0 || nrsImp[i] > 50 || nrsImp[i] < 0) {                
                        System.err.println("Introduza numeros impares e no intervalo de 0 - 50");
                        nrsImp[i] = Integer.parseInt(br.readLine());
                    }
                } break;
                
            case 'P':
                for (int i = 0; i < nrsPar.length; i++) {
                    System.out.println((i + 1) + "º numero:");
                    nrsPar[i] = Integer.parseInt(br.readLine());

                    if (nrsPar[i] % 2 == 0) {
                        nrsPar[i] = nrsPar[i];
                    }

                    while (nrsPar[i] % 2 == 1 || nrsPar[i] < 50 || nrsPar[i] > 100) {                
                        System.err.println("Introduza numeros pares e no intervalo de 50 - 100");
                        nrsPar[i] = Integer.parseInt(br.readLine());
                    }
                }
                Arrays.sort(nrsPar, Collections.reverseOrder());
                System.out.println(Arrays.asList(nrsPar));
                break;
                
            default: System.err.println("Opcao [ 1 || 2 ]");
        }        
    }
    
    public void exercicio7() throws IOException{
        Integer[] nrsPrimo = new Integer[250];
        boolean primo;
        
        for (int i = 2; i < 260; i++) {
            primo = true;
            
            for (int j = 2; j < i; j++) {
                if (i % j == 0) 
                    primo = false; break;
            }
            if (primo) {
                if (primo) {
                    System.out.print(i + ", ");
                } 
            }  
        }
    }
    
    public void menu() throws Exception{
        
        do {            
            System.out.println("""
                               
                               1 - Exercicio 3
                               2 - Exercicio 4
                               3 - Exercicio 5
                               4 - Exercicio 6
                               5 - Exercicio 7
                               6 - Sair
                               """);
            
            switch(Integer.parseInt(br.readLine())){
                case 1: exercicio3(); break;
                case 2: exercicio4(); break;
                case 3: exercicio5(); break;
                case 4: exercicio6(); break;
                case 5: exercicio7(); break;
                case 6: System.exit(0); break;
                default:System.out.println("Escolha entre as opcoes [ 1 | 2 | 3 | 4 | 5 | 6 ]");
            }
                
        } while (true);
    }
    
    public static void main(String[] args) throws IOException, Exception {
        Ficha3 f = new Ficha3();
        f.menu();
    }
}
