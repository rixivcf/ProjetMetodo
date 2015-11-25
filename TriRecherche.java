import java.util.*;


public class TriRecherche{

    static final Random random = new Random();

    static void initTab(int[] tab, int max) {
        for (int i = 0; i < tab.length; i++)
            tab[i] = random.nextInt(max);
    }
    
    static void afficheTab(int[] tab) {
        System.out.print("[");
        for (int i = 0; i < tab.length; i++)
            System.out.print(" " + tab[i]);
        System.out.println(" ]");
    }
    
    static void echangerValeurs(int[] tab, int i, int j) {
        int tmp = tab[i];
        tab[i] = tab[j];
        tab[j] = tmp;
    }
    
    static void triBullesCroissant(int[] tab) {
        int i;
        int limite;
        boolean echange;
        limite = 0;
        echange = true;
        while (echange && limite < tab.length - 1) {
            echange = false;
            for (i = tab.length - 1; i > limite; i--) {
                if (tab[i] < tab[i - 1]) {
                    echangerValeurs(tab, i, i - 1);
                    echange = true;
                }
            }
            limite = limite + 1;
        }
    }
    static void triBullesDecroissant(int[] tab) {
        int i;
        int limite;
        boolean echange;
        limite = 0;
        echange = true;
        while (echange && limite < tab.length - 1) {
            echange = false;
            for (i = tab.length - 1; i > limite; i--) {
                if (tab[i] > tab[i - 1]) {
                    echangerValeurs(tab, i, i - 1);
                    echange = true;
                }
            }
            limite = limite + 1;
        }
    }
    
    static void rechercher(int [] tab , int x){
    	int compteur=0;
    	for (int i=0 ; i<tab.length; i++){
    		if(tab[i]==x){	
    			compteur++;   			
    		}
    	}
    		if(compteur !=0)
    		{
    			System.out.println(x+" est dans le tableau");
    		}
    		else System.out.println(x+" n'apparait pas dans le tableau");
    	
    	
    }

    public static void main(String[] args) {
		
			int x ;
    		int taille = 6;
	        int[] tab = new int[taille];
	        initTab(tab, 10 * taille);
	        int s;
	        afficheTab(tab);
	        Scanner sch= new Scanner(System.in);
		    System.out.println("Quel tri voulez-vous faire\n");
	        System.out.println("1) Croissant");
	        System.out.println("2) Decroissant");
	        s=sch.nextInt();
	        
	        
	       if(s==1){
	    	   triBullesCroissant(tab);
	       }
	       else if(s==2){
	    	   triBullesDecroissant(tab);
	       }
		
		    afficheTab(tab);
		    Scanner sc= new Scanner(System.in);
		    System.out.println("Quel valeur voulez vous rechercher");
		    x = sc.nextInt();
		    rechercher(tab,x);

	}

}
