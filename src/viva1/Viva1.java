package viva1;
import java.util.Scanner;
public class Viva1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        
        //printing the number of spaces
        for (int i=1; i<=num; i++){ 
            for (int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            
            //printing number in decreasing order from i to 1
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
              
            //printing number in increasing order from 2 to i
            for (int k=2; k<=i; k++){
                System.out.print(k);
            }
            
            //printing number in multiple lines  
            System.out.println("");  

        } 
    }
}

       
        

        
           
