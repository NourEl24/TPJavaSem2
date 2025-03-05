
 
public class app1 {
    
    public static void main(String[] args) {
    	
    	
    String ch;
    System.out.println("donner une chaine");
    ch= Clavier.lireString();
    char car;
    System.out.println("donner un caractére");
    car=Clavier.lireChar();
    int a=ch.length();
    int s=0;
    for ( int i=0; i<a; i++){
    	 if (ch.charAt(i)==car){
    	 	s+=1;
    	 }
    }
    System.out.println("Le nombre d'occurrences de '" + car + "' dans \"" + ch + "\" est : " + s);
    }
}
