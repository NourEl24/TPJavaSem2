
 
public class app4 {
    
    public static void main(String[] args) {
    	String ch;
    	System.out.println("donner une chaine");
    	ch= Clavier.lireString();
    	String chinv="";
    	int i = ch.length ()-1;
    	while (i>=0){
    		chinv+=ch.charAt(i);
    		i--;
    		
    	}
    	System.out.println("la chaine inversée est : "+chinv);
    	
    	
    }
}
