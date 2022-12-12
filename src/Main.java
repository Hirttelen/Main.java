import java.util.Scanner;

public class Main {
    public static  void  main(String[] args){
        String sor;
        do {
            Scanner sc=new Scanner(System.in);
            sor=sc.nextLine();
            switch (sor){
                case "hello":
                    System.out.println("Hello World");
                break;
                case "info":
                    System.out.println("Alpha");
                break;
                case "exit":
                    System.out.println("Kilépés...");
                break;
                default:
                    System.out.println("Nincs ilyen parancs");
            }
        }while (!sor.equals("exit"));

    }
}