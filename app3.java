
public class app3 {
    
    public static void main(String[] args) {
    	
    	String ch;
    	System.out.println("donner une chaine");
    	ch= Clavier.lireString();
    	int i=0;
    	int j=ch.length()-1;
    	boolean test = true;
    	while(i<j){
    		if ( ch.charAt(i) != ch.charAt(j)){
    			test=false;
    			break;
    		}
    	i++;
    	j--;	
    		
    	}
    	if ( test){
    		System.out.println("la chaine \""+ch+"\" est un palindrome.");
    	}else{
    		System.out.println("la chaine \""+ch+"\" n'est pas un palindrome.");
    		
    	}
    	
    }
}
