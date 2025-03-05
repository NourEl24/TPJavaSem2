
 
public class application2 {
    
    public static void main(String[] args) {
    	
    
    int n1, n2; 
        
        
        do {
            System.out.print("Entrez le nombre de lignes  : ");
            n1 =Clavier.lireInt();
        } while (n1 <= 0 || n1 >= 30);

        do {
            System.out.print("Entrez le nombre de colonnes  : ");
            n2=Clavier.lireInt();
        } while (n2 <= 0 || n2 >= 30);
        
        int[][] M = new int[n1][n2]; 
        	

        
        System.out.println("Entrez les éléments de la matrice :");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
               M[i][j]=Clavier.lireInt();
            }
        }

        
        int somme = 0;
        long produit = 1; 
        int nombreElements = n1 * n2;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                somme += M[i][j];
                produit *= M[i][j]; 
            }
        }

        double moyenne = (double) somme / nombreElements;

        System.out.println("\nRésultats :");
        System.out.println("Somme des éléments = " + somme);
        System.out.println("Produit des éléments = " + produit);
        System.out.println("Moyenne des éléments = " + moyenne);

       
    }
}

    	
    
