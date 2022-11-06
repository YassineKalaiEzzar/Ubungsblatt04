// //Ubungsblatt04
// Aufgabe 1: Cosinus
public class Cosinus {
    public static void main(String args[]) {
     int s=0;
     double x=Math.PI*0.5;
    for (int i=1;i<x;i++){ 
        s+=(Math.pow(-1,i)/fac(2*i))*Math.pow(x,2*i);
      
        System.out.println(i);}
      System.out.println("Sum of s="+s);
    }
    
    static int fac(int n){    
    if (n == 0)    
        return 1;    
     else    
     return(n * fac(n-1));    
 }     
}

