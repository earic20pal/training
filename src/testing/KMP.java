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
public class KMP {

    public static void main(String args[]) {
        String txt = "ABCABCABCABC ABCDAB ABCDABCDABDE";
        String pat = "ABCABC";
        KMPSearch(pat.toCharArray(), txt.toCharArray());
    }

    private static void KMPSearch(char[] pat, char[] txt) {
        int m=pat.length;
        int n=txt.length;
        int[] arr=ComputeLpsArray(pat,m);
        int i=0;
        int j=0;
        while(i<n)
        {
            if(pat[j] == txt[i]) {
                i++;
                j++;
            }
            if(j == m)
            {
                System.out.println("SubString found at "+ (i-j));
                j = arr[j - 1];
            }
            // mismatch after j matches
            else if (i < n && pat[j] != txt[i])
	{
		// Do not match lps[0..lps[j-1]] characters,
		// they will match anyway
		if (j != 0)
		{
		j = arr[j-1];
		}
		else
		i = i+1;
	}
        }
    }

    private static int[] ComputeLpsArray(char[] pat, int M) {
        int i=1;
        int[] arr= new int[pat.length];
        int j=0;
        while(i<M)
        {
            if(pat[i]==pat[j])
            {
                j++;
                arr[i]=j;
                i++;
            }
            else
            {
                if(j!=0)
                {
                    j=arr[j-1];
                }
                else
                {
                    arr[i]=0;
                    i++;
                }
            }
        }
        for(int i1=0;i1<arr.length;i1++)
        System.out.println(" "+arr[i1]);
        return arr;
    }
}
