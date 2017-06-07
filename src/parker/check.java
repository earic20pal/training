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
        list.insertatbegining("hello1");
        list.insertatend("hello2");
        list.InsertAtIndex(3,"hello3");
//        list.deleteAtBegining();
//        list.deleteAtEnd();
        list.print();
        System.out.println("now reverse the list........");
       list.reverse();
       list.print();
    }
    
}
