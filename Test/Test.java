public class Test{

// add main method

  public static void main(String[] args) {
   
   // Math.round() how to convert double into 2 decimal points 
            double a = 56.78676;
            double b =14.346;
            double c = 34.111;
            
            double x =  Math.round(a*100);
            System.out.println(x);
            x =  Math.round(a*100)/100;
            System.out.println(x);
            x =  (double) Math.round(a*100)/100; // this one is the correct one
            x = Math.round(a*100)/100d // this one also works fine
            System.out.println(x);
            x =  Math.round((a*100)/100);
            System.out.println(x);
            x =  Math.round(a);
            System.out.println(x);
            

           

  }
}