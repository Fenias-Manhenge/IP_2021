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
        
        System.out.println("""
                           
                           Soma (+)
                           Multiplicacao (*)
                           Divisao (/)
                           Subtracao (-)
                           """);
        
        System.out.println("\nDigite o operador Aritmetico:");
        switch(br.readLine().charAt(0)){
            case '+' : System.out.println("\nA soma é " + (numeros + numeros1)); break;
            case '-' : System.out.println("\nA subtracao é " + (numeros - numeros1)); break;
            case '*' : System.out.println("\nA multiplicacao é " + (numeros * numeros1)); break;
            case '/' : System.out.println("\nA divisao é " + (numeros / numeros1)); break;
        }
    }
    
    public void exercicio5 () throws IOException {
        System.out.println("""
                           1 – Frango à Zambeziana (1000MZN)
                           2 – Guizado de carangueijo (650MZN)
                           3 – Matapa com arroz branco (350MZN)
                           4 – Mucapata (400MZN)
                           """);
        
        switch(Integer.parseInt(br.readLine())){
            case 1: System.out.println("Frango à Zambeziana (1000MZN)"); break;
            case 2: System.out.println("Guizado de carangueijo (650MZN)"); break;
            case 3: System.out.println("Matapa com arroz branco (350MZN)"); break;
            case 4: System.out.println("Mucapata (400MZN)"); break;
            case 5: System.out.println("Escolha entre as opcoes seguintes [ 1 | 2 | 3 | 4 ]");
        }
    }
    
    public void exercicio6() throws IOException {
        int nr;
        
        System.out.println("Digite valores consecutivos!");
        
        do{
            nr = Integer.parseInt(br.readLine());
        }while (nr > 0);           
    }
    
    public void exercicio7() throws IOException {
        int nr;
        
        System.out.println("Digite n numeros:");
        
        do {            
            nr = Integer.parseInt(br.readLine());
            
            if (nr % 2 == 1) {
                System.out.println("Impar: " + nr);
            }
        } while (true);
    }
    
    public void exercicio8() throws IOException {
        System.out.println("Imprimindo numeros primos entre 1 ha 20");
        
        for (int i = 2; i <= 50; i++) {
            
            boolean primo = true;
            
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false; break;
                }
            }
            
            if (primo) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
    
    public void exercicio9() throws IOException {
        
        System.out.println("Quanto o senhor recebe mensalmente?");
        double salario = Double.parseDouble(br.readLine());
        System.out.println("Quanto o senhor deseja poupar do seu salario?");
        double poupanca = Double.parseDouble(br.readLine());
        System.out.println("Que valor voce deseja atingir?");
        double meta = Double.parseDouble(br.readLine());
        System.out.println("Em quantos meses o senhor deseja que a meta seja atingida?");
        byte mes = Byte.parseByte(br.readLine());
        
        double nrMes = meta / poupanca;
        
        System.out.println("O numero de meses que levara para atingir a meta e: " + nrMes);
        
        double valor = meta / 20;
        
        System.out.println("O senhor deve poupar " + valor + "MT para atingir essa meta em 20 meses!");
    }
    
    public void exercicio10() throws IOException, Exception {
        
        final double SALDO = 50000;
        double salActu = 0;
        
        salActu = SALDO;
        do{
            System.out.println("""
                               
                            A – Visualizar o saldo;
                            B – Levantamento;
                            C – Transferência;
                            D – Deposito.
                            E - Sair
                           """);
            
            switch(br.readLine().charAt(0)){
                case 'A': System.out.println("Saldo: " + salActu); break;
                case 'B': 
                    System.out.println("Digite o valor que o sennhor deseja levantar:");
                    double levantar = Double.parseDouble(br.readLine());
                    if (levantar < (salActu - 5)) {
                        salActu = (salActu - 5) - levantar;
                        System.out.println("\nO senhor levantou " + levantar + "MT, o seu saldo atual e " + salActu + ".");
                    }else{
                        System.err.println("\nSaldo insuficiente!");
                    }
                    ; break;
                case 'C': 
                    System.out.println("Digite o valor que o sennhor deseja transferir:");
                    double transferir = Double.parseDouble(br.readLine());
                    if (transferir < (salActu - 10)) {
                        salActu = (salActu - 10) - transferir;
                        System.out.println("\nO senhor transferiu " + transferir + "MT, o seu saldo atual e " + salActu + ".");
                    }else{
                        System.err.println("\nSaldo insuficiente!");
                    }
                    ; break;
                case 'D': 
                    System.out.println("Digite o valor que o sennhor deseja Depositar: ");
                    double deposito = Double.parseDouble(br.readLine());
                    salActu += deposito;
                    System.out.println("O senhor depositou " + deposito + "MT, o seu saldo atual e " + salActu + ".");
                    break;
                case 'E': menu();    
                default: System.err.println("Escolha uma das opcoes [ A | B | C | D ]"); break;
            }
        }while (true);            
            
    }
    
    public void menu() throws Exception{
        
        do {            
            System.out.println("""
                               
                               1 - Exercicio 1
                               2 - Exercicio 2
                               3 - Exercicio 3
                               4 - Exercicio 4
                               5 - Exercicio 5
                               6 - Exercicio 6
                               7 - Exercicio 7
                               8 - Exercicio 8
                               9 - Exercicio 9
                               10 - Exercicio 10
                               11 - Sair
                               """);
            
            switch(Integer.parseInt(br.readLine())){
                case 1: exercicio1(); break;
                case 2: exercicio2(); break;
                case 3: exercicio3(); break;
                case 4: exercicio4(); break;
                case 5: exercicio5(); break;
                case 6: exercicio6(); break;
                case 7: exercicio7(); break;
                case 8: exercicio8(); break;
                case 9: exercicio9(); break;
                case 10: exercicio10(); break;
                case 11: System.exit(0); break;
                default:System.out.println("Escolha entre as opcoes [ 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 ]");
            }
                
        } while (true);
    }
    
    public static void main(String[] args) throws Exception{
        Ficha2 f = new Ficha2();
        f.menu();
    }
    
}
