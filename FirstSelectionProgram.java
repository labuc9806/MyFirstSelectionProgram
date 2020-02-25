/*
 * Launa Bucher-Austin
 * To change this template file, choose Tools | Templates
 * February 20 2020
 */

package firstselectionprogram;

import java.util.Scanner;

/**
 *
 * @author labuc9806
 */
public class FirstSelectionProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner (System.in);
        
        double price;
        double total;
        double sale1;
        double sale2; 
        double sale3;
        double sale4;
        
        
        
        System.out.println("Please enter the amount spent: ");
        
        price = keyedInput.nextDouble();
        
        sale1 = 0.10*price;
        sale2 = 0.20*price;
        sale3 = 0.30*price;
        sale4 = 0.40*price;
       
        
          if (price <= 40.0)
          {
            total = price-sale1;
           
            System.out.println("You spent : " +price +" ");
            System.out.println("You are saving 10% ");
            System.out.println("You are saving "+ sale1 +" ");
            System.out.println("Your total is "+ total +" ");
            
            
          } 
        
          else if (price <= 80.0)
         { 
            total = price-sale2;
            
            System.out.println("You spent : "+ price +" ");
            System.out.println("You are saving 20%");
            System.out.println("You are saving "+ sale2 +" ");
            System.out.println("Your total is "+ total +"");
            
          }
        
          else if (price <= 120.0)
          { 
              total = price - sale3;
              
              System.out.println("You spent : "+ price +" ");
              System.out.println("You are saving 30%");
              System.out.println("You are saving : "+sale3+"");
              System.out.println("Your total is : "+total+" ");
          }    
          
          else if (price >120)
          { 
              total = price - sale4;
              
              System.out.println("You spent : "+ price+" ");
              System.out.println("You are saving 40%");
              System.out.println("You are saving : "+sale4+"");
              System.out.println("Your total is : "+total+" ");
              
          }
         
        
        
        
        
    }
    
}
