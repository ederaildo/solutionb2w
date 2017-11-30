package solution;

public class Rearranjo
{
	public static int contarRearranjo =0;
    static void rearranjo(int[] a, int k) 
    {
    	
        if (k == a.length) 
        {
            for (int i = 0; i < a.length; i++) 
            {
            	if(i==0) {
            		if( a[i]==0) {
            			contarRearranjo--;
            			break;
            		} 
            	}
            }
            contarRearranjo++;
        } 
        else 
        {
            for (int i = k; i < a.length; i++) 
            {
                int t = a[k];
                a[k] = a[i];
                a[i] = t;
                 rearranjo(a, k + 1);
                t = a[k];
                a[k] = a[i];
                a[i] = t;
            }
        }
        
        
    }
 
    public static void main(String args[]) 
    {     
       int numero = Integer.valueOf(args[0]);

       String seq = String.valueOf(numero);
       int[] sequencia = new int[seq.length()];
       
       for(int i=0;i<seq.length();i++) {
    	   sequencia[i] = Integer.valueOf(seq.charAt(i));
       }

       rearranjo(sequencia, 0);
       System.out.println("Há " + contarRearranjo + " rearranjos de digitos possíveis com o número " + numero);

    }
}