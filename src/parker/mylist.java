/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parker;

/**
 *
 * @author ravi
 */
class mylist<T> {

    node<T> head = null;
    node<T> current = null;
    node<T> temp = new node<T>();

    void add(T obj) {

        if (head == null) {
            head = new node<T>();
            current = new node<T>();
            current.info = obj;
            current.next = null;
            head=current;
        } else {
            temp = new node<T>();
            temp.info = obj;
            temp.next = null;
            current.next = temp;
            current=temp;
        }
    }

    void print() {
        temp=head;
        while(temp!=null)
        {
            System.out.println(temp.info);
            temp=temp.next;
        }
        
    }

    void insertatbegining(T obj) {
        temp= new node<T>();
        temp.info=obj;
        temp.next=head;
        head=temp;
        
    }

    void insertatend(T obj) {
        temp = new node<T>();
            temp.info = obj;
            temp.next = null;
            current.next = temp;
            current=temp;
        
    }

    void InsertAtIndex(int index, T obj) {
        int i=0;
        temp=head;
        
        while(i<index)
        {
            temp=temp.next;
            i++;
        }
        node<T> newnode= new node<>();
        newnode.info=obj;
        newnode.next=temp.next;
        temp.next=newnode;
    }

    void deleteAtBegining() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void deleteAtEnd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void reverse() {
        node<T> previousnode=null;
        node<T> nextnode=null;
        node<T> temp=head;
        while(temp!=null)
        {
            nextnode=temp.next;
            temp.next=previousnode;
            
            previousnode=temp;
            temp=nextnode;
        }
        head=previousnode;
    }
}

class node< T> {

    T info;
    node next;

    public node() {
        info = null;
        next = null;
    }

}
