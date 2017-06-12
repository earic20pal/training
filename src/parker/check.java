/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parker;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ravi
 */
public class check {
    public static void main(String args[])
    {
       mylist list= new mylist();
       LinkedList li= new LinkedList();
        list.add("ravi");
        list.add("kumar");
        list.add("pal");
        list.add(9);
        list.add(9);
        for(int i=0;i<5;i++)
        {
            list.add(i);
        }
        for(int i=0;i<5;i++)
        {
            list.add(i);
        }
        for(int i=0;i<5;i++)
        {
            list.add(i);
        }
        list.insertatbegining("hello1");
        list.insertatend("hello2");
        list.InsertAtIndex(3,"hello3");
        list.deleteAtBegining();
        list.findNthElementFromEnd(3);
        int size=list.findsizeRecusive();
        size=list.findsizeIterative();
        list.SwapKeys(1,4);
        boolean isloop=list.findloop();
        System.out.println(isloop);
        System.out.println("after swaping 2 and 4");
        
//        list.deleteAtEnd();
        list.print();
        System.out.println("now reverse the list........");
       list.reverse();
       list.print();
    }
    
}
