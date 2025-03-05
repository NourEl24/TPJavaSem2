
 
public class app5 {
    
    public static void main(String[] args) {
    	
    	String ch;
    	System.out.println("donner une chaine");
    	ch= Clavier.lireString();
    	String ch1 = "";
        for (int i = 0; i < ch.length(); i++) {
            ch1 += ch.charAt(i);
            if (i < ch.length() - 1) { 
                ch1 += "*";
            }
        }
    	System.out.println("Résultatt : "+ ch1);
    	
    	
    }
}

