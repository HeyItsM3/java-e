package ponyE;

public class PonyExpress {
	public static int jinetes(int[] distancias) {
		  int caballo=1, millas=0;
		  
		  for(int i=0; i < distancias.length; i++){
			  
			  millas += distancias[i];
			  
		     if (millas > 100){
		    	 
		    	 millas = distancias[i];
		    	 
		         caballo+=1;
		      }
		     
		     }
		  
		   return caballo;
	}
}
