import java.util.Scanner;

public class Tptest  {

    
    public static int Lecture() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un entier strictement positif : ");
            n = scanner.nextInt();
        } while (n <= 0);
        return n;
    }

    
    public static int Compter(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

  
    public static void main(String[] args) {
        int nombre = Lecture();
        int nbChiffres = Compter(nombre);
        System.out.println("Le nombre contient " + nbChiffres);
    }
}