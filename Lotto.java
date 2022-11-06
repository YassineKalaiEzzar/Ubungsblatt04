// //Ubungsblatt04
// Aufgabe 2: Lotto
public class Lotto {
    public static void main(String args[]) {
        
    Double n=Double.parseDouble(args[0]),m=Double.parseDouble(args[1]);
    System.out.println("java Lotto 6 49");
    if(n<1 || n>m ){System.out.println("ERROR");
    }else{
        int rand;
    for (int i=0;i<6;i++){
        rand=(int)(Math.random()*(m-n+1)+n);

        if (i==5){System.out.print(rand);}
        else {System.out.print(rand+",");}
    }
 }     
}}

