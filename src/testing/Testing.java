/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.util.Date;

/**
 *
 * @author ravi
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "A$jkiguv@#$kj8\"7\\689@@@@@@@@@@@@@@@\\@@@@@@@@|yi\\u_";
        StringBuilder sb;
        String spcialChar[] = {"\"", "\'", "!", "@", "#", "$", "%", "^", "&",
            "*", "(", ")", "+", "=", "[", "]", ";", "/", "{", "}", "|",
            "<", ">", "?", "_", "\\"};
        System.out.println("time is ");
        for (int i = 0; i < spcialChar.length; i++) {
            String newstr = null;

            if (str.contains(spcialChar[i].toString())) {
                System.out.println("replaced           :" + spcialChar[i]);
                newstr = str.replace(spcialChar[i], "");
                str = newstr;
            }
            System.out.println("                  " + str);
        }
        System.out.println("string is " + str);
//        char[] ravi= str.toCharArray();
//        for(int i=0;i<str.length();i++)
//        {
//            if(ravi[i]>=33 && ravi[i]<=126)
//                if(ravi[i]>=65 && ravi[i]<=90||ravi[i]>=48 && ravi[i]<=57||ravi[i]>=97 && ravi[i]<=122)
//                {
//                    
//                }
//                else
//                    ravi[i]=' ';
//            else
//            {
//                
//            }
//        }
//        str=String.valueOf(ravi).replaceAll("\\s", "");
//        System.out.println(" new string is"+str);

    }

}
