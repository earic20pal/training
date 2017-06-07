/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parker;

import java.util.Scanner;

/**
 *
 * @author ravi
 */
public class Permutation_of_a_String {
    private static void permute(char[] a) 
    {
        
    // char[] a = {'c','a','r','b','o','n'};
    int c=0,w=0;
    for(int q = 0;q<a.length;q++) 
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=1;j<a.length;j++)
            {
                for(int k=1;k<a.length-1;k++) 
                {
                    for(int z=0;z<a.length;z++)
                    {
                        System.out.print(a[z]);
                        c++;
                    }
                    w++;
                    System.out.println();
                    char p=a[k+1];
                    a[k+1]=a[k];
                    a[k]=p;
                }
                System.out.println();
            }
            System.out.println();
            char x=a[0];
            a[0]=a[1];
            a[1]=x;
        }
      }
    System.out.println(" Character count = " + c);
    System.out.println(" Word count = " + w);
    
    }
    
    public static void main(String args[])
    {
        Scanner input= new Scanner(System.in);
        String str= input.next();
        System.out.println("you entered "+str);
//        permutation(str);
        char[] arr=str.toCharArray();
        permute(arr);
    }

    public static void permutation(String str) { 
    permutation("", str); 
}

private static void permutation(String prefix, String str) {
    int n = str.length();
    if (n == 0) 
        System.out.println(prefix);
    else {
        for (int i = 0; i < n; i++)
        {
            System.out.println("prefix "+prefix+"  str.charAt(i)  "+str.charAt(i)+"  str.substring(0, i)   "+str.substring(0, i)+""+str.substring(i+1, n));
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
}
}
