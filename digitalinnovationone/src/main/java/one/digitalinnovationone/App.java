package one.digitalinnovationone;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Hello World!" );
        System.out.println("Pressione Enter para sair...");
        scanner.nextLine();
        scanner.close();
    }
}
