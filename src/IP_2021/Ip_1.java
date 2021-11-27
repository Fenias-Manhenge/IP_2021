package IP_2021;

/**
 *
 * @author fenia
 */
import java.util.*;

public class Ip_1 {
    
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("What is your name?");
        String name = t.next();
        System.out.println("Hello " + name + ", how are you?");
        String ans = t.next();
        if (ans.equalsIgnoreCase("I'm fine and you") || ans.startsWith("I'm fine")) {
            System.out.println("I'm fine too!");
        }
        System.out.println("How old are you?");
        byte age = t.nextByte();
        System.out.println("Ohhhh " + age + " years old, good!");
    }
    
}
