
 
public class TP7 {
    
    public static void main(String[] args) {
    	
    		
    	int[][] M1=new int[50][50];
        int n1,nc,i,j;

        do {
            System.out.print("Entrez un entier strictement  positif inférieur à 50 : ");
           n1=Clavier.lireInt();
            
            if (n1 >= 50 || n1 < 0) {
                System.out.println("Valeur invalide. Veuillez entrer un entier positif inférieur à 50.");
            }
        } while (n1 >= 50 || n1 < 0);

        System.out.println("La valeur de n1 est : " + n1);
        
          do {
            System.out.print("Entrez un entier strictement  positif inférieur à 50 : ");
          nc=Clavier.lireInt();
            if (nc >= 50 || nc < 0) {
                System.out.println("Valeur invalide. Veuillez entrer un entier positif inférieur à 50.");
            }
        } while (nc >= 50 || nc < 0);

        System.out.println("La valeur de nc est : " + nc);
          for(i=0;i<n1;i++){
          	for(j=0;j<50;j++){
         
          		System.out.println("remplir M1["+i+","+j+"]");
          		M1[i][j]=Clavier.lireInt();
          		
          }}
}
    }

