package test;
class Example1
{
   public static void main(String args[])
   {
      try{
         int num1=30, num2=0;
        
         if (num2 == 0) { 
     	    throw new IllegalArgumentException("Argument 'divisor' is 0");
     	}
         int output=num1/num2;
         
         System.out.println ("Result: "+output);
         
       
      }catch(ArithmeticException ee){
    	  System.out.println ("IllegalArgumentException");
      }
      catch(IllegalArgumentException e){
         System.out.println ("You Shouldn't divide a number by zero");
      }
   }
}