/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ravi
 */
public class te4st {

    public static void main(String args[]) {
        String sourceString = "A$jkiguv@#$kj8\"7\\n689@@?????@@[]@@@@@@@@@@@\\@@@@@@@@|yi\\u_";
        String specialChars[] = {"\"", "\'", "!", "@", "#", "$", "%", "^", "&",
            "*", "(", ")", "[", "]", "+", "=", ";", "/", "{", "}", "|",
            "<", ">", "?", "_", "\\", "`", "~", ";", ":", ",", "<", ">", ".", "|"};

        StringBuffer result = new StringBuffer();
        for (int i = 0; i < specialChars.length; i++) {
            if (specialChars[i] == "\"" || specialChars[i] == "\'" || specialChars[i] == "\\" || specialChars[i] == "[" || specialChars[i] == "]") {
                result.append("\\");
            }
            result.append(specialChars[i]);
        }
        Pattern p = null;
        p = Pattern.compile("([" + result.toString() + "])");
        Matcher m = null;
        for (int i = 0; i < specialChars.length; i++) {
            m = p.matcher(sourceString); // get a matcher object
            sourceString = m.replaceAll("");
        }
        System.out.println("string is " + sourceString);
    }

}
