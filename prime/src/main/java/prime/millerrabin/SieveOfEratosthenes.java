/*package prime.millerrabin;
class SieveOfEratosthenes{
  void sieveOfEratosthenes(int n){
     Array[Boolean] = new Array[Boolean](n+1);
    for(int i i=0;i< <- 0 to n) prime(i) = true;
      int p=2;
     while (p*p <=n ){
         if(prime(p)){
           // Update all multiples of p
           int i = p * 2;
           while ( i <= n) {
             prime(i) = false;
             i += p
           }
         }
        p+=1
      }
    // Print all prime numbers// Print all prime numbers

    int i = 2;
    while (i <= n) {
      if (prime(i)) println(i + " ");
        i += 1;
    }

  }
}

object Prime {
  def main(args: Array[String]): Unit = {
    val n = 100000000
    var intial = System.currentTimeMillis()
    print("Following are the prime numbers ")
    println("smaller than or equal to " + n)
    val g = new SieveOfEratosthenes
    g.sieveOfEratosthenes(n)
    var aft = System.currentTimeMillis()
    println("total time taken in second:"+(aft-intial)/1000)
  }
}
*/