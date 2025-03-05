

public class application3 {

    public static void main(String[] args) {
        //declaration de variable:
            int Nmax = 100; 
            int[] T = new int[Nmax];

    	//controle de saisir de taille de tableau:
    	do{
    		System.out.Println("saisir de taille de tab");
    		n=Clavier.lireInt();
    	}while(n<=0);
    	//remplissage de tableau:
    	for(int i=0; i<n; i++)
{
    		System.out.println("T["+i+"]=");
    		T[i]=Clavier.lireInt();
    	}
    	
    for(int i=0; i<n; i++) {
    if(T[i] % 2 != 0) { 
        s += T[i]; 
    }
}
System.out.println("somme des entiers impaires est = " + s);

    		}
    		
    	}
    	
    	
    	
    
  

