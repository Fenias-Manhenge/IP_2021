package Exercicios;

/**
 *
 * @author fenia
 */
import java.util.*;
import java.io.*;

    
public class Ficha5 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    static boolean verificar;
    
    static int somaValores(int[] somaArray){
        int soma = 0;
        
        for (int i = 0; i < somaArray.length; i++) {
            soma += somaArray[i];
        }
        return  soma;
    }
    
    void valoresPares(int[] paresArray){
        System.out.print("Pares: ");
        for (int i = 0; i < paresArray.length; i++) {
            if (paresArray[i] % 2 == 0) {
                System.out.print(paresArray[i] + ", ");
            }
        }
    }
    
    void pesquisaSequencial(int[] pesqArray) throws IOException{
        System.out.println("\n\nIntroduza o valor a ser encotrado no Array: ");
        int proc = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < pesqArray.length; i++) {
            if (proc == pesqArray[i]) {
                System.out.println(proc);
            }
        }
    }
    
    void exercicio4() throws IOException{
        int[] nrs = new int[5];
        for (int i = 0; i < nrs.length; i++) {
            System.out.println("Introduza o " + (i + 1) + " numero");
            nrs[i] = Integer.parseInt(br.readLine());
            
            while(nrs[i] <= 0 || nrs[i] >= 200){
                System.err.println("Introduza numeros no intervalo de 0-200");
                nrs[i] = Integer.parseInt(br.readLine());
            }
        }
        
        System.out.println("\nSoma: " + somaValores(nrs));
        valoresPares(nrs);
        pesquisaSequencial(nrs);
    }
    
    String fazBumm(int faz, int bumm, int max){
        String concat = "";
        
        for (int i = 1; i <= max; i++) {
            if (i % faz == 0) {
                concat += "Faz, ";
            }else if(i % bumm == 0){
                concat += "Bumm, ";
            }else
                concat += i + ", ";
        }
        return concat;
    }
    
    void exercicio5() throws IOException{
        System.out.println("Introduza o FAZ:");
        int faz = Integer.parseInt(br.readLine());
        System.out.println("Introduza o BUMM");
        int bumm = Integer.parseInt(br.readLine());
        System.out.println("Introduza o MAX");
        int max = Integer.parseInt(br.readLine());
        
        String ans = fazBumm(faz, bumm, max);
        
        System.out.println("\n" + ans);
    }
    
    void exercicio6 () throws IOException{
        System.out.println("Introduza um valor com digitos acima de 3 unidades: ");
        int nr = Integer.parseInt(br.readLine());
        
        String rev = String.valueOf(nr);
        
        if (rev.length() >= 3) {
            StringBuilder sb = new StringBuilder(rev);
            System.out.println(sb.reverse().toString());
        }else
            System.err.println("Introduza numeros acima de 3 digitos");
    }
    
    static byte acharIndice(char test, Character[] c){
        
        byte indice = 0;
        
        for (int i = 0; i < c.length; i++) {
            if (test == c[i]) {
                indice = (byte) i;
                verificar = true;
            }
        }
        return indice;
    }
    
    public void exercicio7() throws IOException{
        Character[]car = {'w', 'y', 'r', 't', 'a', 'p', 'm', 'i', 'o', 'a'};
        System.out.println(Arrays.asList(car));
        Arrays.sort(car);
        System.out.println(Arrays.asList(car) + "\n");
        
        System.out.println("Pesquise por um caracter");
        char teste = br.readLine().charAt(0);
        
        byte index = acharIndice(teste, car);
        
        if (verificar) {
            System.out.println("Caracter " + teste + " esta na posicao " + index); 
        } else
            System.err.println("O Caracter nao existe no Array");
    }
   
    public void menu() throws IOException{
        
        do {  
            System.out.println("""
                           1- exercicio 4
                           2- exercicio 5
                           3- exercicio 6
                           4- exercicio 7
                           5- Sair
                           """);
            
            switch(Byte.parseByte(br.readLine())){
                case 1: exercicio4(); break;
                case 2: exercicio5(); break;
                case 3: exercicio6(); break;
                case 4: exercicio7(); break;
                case 5: System.exit(0); break;
                default: System.err.println("Escolha opcao 1 | 2 | 3 | 4 | 5");
            }
        } while (true);
    }
    
    public static void main(String[] args) throws IOException {
        Ficha5 f = new Ficha5();
        f.menu();
    }
    
}
