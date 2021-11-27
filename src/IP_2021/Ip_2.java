package IP_2021;

/**
 *
 * @author fenia
 */

import java.io.*;

public class Ip_2 {
    
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        System.out.println("1• numero: ");
        int a = Integer.parseInt(br.readLine());
        System.out.println("2• numero: ");
        int b = Integer.parseInt(br.readLine());
        
        int soma = a + b;
        int mul = a * b;
        
        System.out.println("Soma = " + soma + "\n" + "Multiplicacao = " + mul);
    }
    
}
