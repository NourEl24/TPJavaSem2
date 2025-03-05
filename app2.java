
public class app2 {
    
    public static void main(String[] args) {
    	
    	String ch;
    	System.out.println("donner une chaine");
    	ch= Clavier.lireString();
    	String mot;
    	int p=ch.indexOf(" ");
    	if(p==1){
    		mot=ch;
    	}
    	else{
    		mot=ch.substring(0,p);
    		
    	}
    	System.out.println(mot);
    	}
    }

