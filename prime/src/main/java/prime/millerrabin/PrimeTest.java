package prime.millerrabin;
public class PrimeTest {

    public static void main(String[] args) {
    	long f=System.currentTimeMillis();
      
    	for(int i=0;i<100000000;i++){
    	   if(isPrime(i)){
    		   System.out.println(i);
    	   }
    	   
       }
       long l=System.currentTimeMillis();
    	System.out.println("\ntotal time laps:"+(l-f)/1000);
    }

    static  boolean isPrime(int n)
    {
        // Corner cases
        if (n <= 1)  return false;
        if (n <= 3)  return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n%2 == 0 || n%3 == 0) return false;

        for (int i=5; i*i<=n; i=i+6)
            if (n%i == 0 || n%(i+2) == 0)
                return false;

        return true;
    }
}
