/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;
/**
 *
 * @author ravi
 */
public class RobinKarp {
    static int d=256;
    public static void main(String args[])
    {
        String txt= "GEEK FOR GEEKS";
        String pat = "GEEK";
        int q=101;
        search(pat,txt,q);
        
    }

    private static void search(String pat, String txt, int q) {
        System.out.println("Welcome to Robin karp");
        int l_t=txt.length();
        int l_p=pat.length();
        int h_t=0; 
        int h_p=0;
        int h=1;
        // value of h would be pow (d, M-1)%q
        for(int i=0; i<pat.length()-1;i++)
        h=(h*d)%q;
        
        for(int i=0;i<pat.length();i++)
        {
           h_t=(d*h_t+txt.charAt(i))%q;
          h_p=(d*h_p+pat.charAt(i))%q;
        }
        System.out.println("  "+h_p+""+h_t);
        for(int i=0;i<l_t-l_p;i++)
        {
            if(h_p==h_t)
            {
                int j;
                for(j=0;j<l_p;j++)
                {
                    if(txt.charAt(i+j)!=pat.charAt(j))
                        break;
                }
                if(j==l_p)
                    System.out.println("String has been found at index "+i);
            }
            
            if(i<l_t-l_p)
            {
                h_t=(d*(h_t-txt.charAt(i)*h)+txt.charAt(i+l_p))%q;
                if (h_t < 0)
            h_t= (h_t + q);
            }
        }
        
    }
}
