/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.s;

import java.util.Scanner;

/**
 *
 * @author NITRO
 */
public class AKevinandArithmetic {
   public static void main (String []args)
   {
       int[] arrr = new int[10];
       Scanner omar = new Scanner(System.in);
       System.out.println("enter your number");
       int y=arrr.length;
       for(int x=0;x<y;x++)
       {
           arrr[x]=omar.nextInt();
       }
       int s=0;
       
        for(int x=0;x<y;x++)
        {
            if(arrr[x]%2==0)
            {
                s=arrr[x]+s;
                while(s%2==0)
                {
                    s=s/2;
                }
                
            }
        }
        System.out.println("the value of s="+ s);
       
   }
    
}
