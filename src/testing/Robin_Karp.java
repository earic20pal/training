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
public class Robin_Karp {
    static int q=101;
    static int d=256;
    public static void main(String args[])
    {
        String txt="me: myname is ramesh";
        String pat="me";
        Search(txt,pat);
    }

    private static void Search(String txt, String pat) {
        int h_p=0;
        int h_t=0;
        int h=1;
        
        for(int i=0;i<pat.length()-1;i++)
        {
            h=(h*d)%q;
        }
        for(int i=0;i< pat.length();i++)
        {
            h_t=(h_t*d+txt.charAt(i))%q;
            h_p=(h_p*d+txt.charAt(i))%q;
            
        }
        for(int i=0;i<txt.length()-pat.length();i++)
        {
            if(h_t==h_p)
            {
                int j=0;
                for(j=0;j<pat.length();j++)
                {
                    if(txt.charAt(j+i)!=pat.charAt(j))
                    break;
                }
                if(j==pat.length())
                    System.out.println("Value found at index "+i);
            }
            if(i<txt.length()-pat.length())
            {
                h_t=  (d*(h_t-txt.charAt(i)*h)+txt.charAt(i+pat.length()))%q;
                if(h_t<0)
                    h_t=(q+h_t);
            }
        }
    }
    
}
