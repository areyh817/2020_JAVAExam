package Array;

import java.util.Scanner;

public class Array_bost {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      
      int[] a = new int[5];
      for(int i = 0; i < a.length; i++) {
         System.out.print("ют╥б : ");
         a[i] = scan.nextInt();
      }
      
      for(int i = 0; i < a.length; i++) {
         for(int j = 0; j < a.length-i-1; j++) {
            if(a[j] > a[j+1]) {
               int temp = a[j];
               a[j] = a[j+1];
               a[j+1] = temp;
            }
         }
      }
      
      for(int i=0; i<a.length; i++)
      System.out.println(a[i]);
   }

}