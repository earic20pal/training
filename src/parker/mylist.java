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
            head = current;
        } else {
            temp = new node<T>();
            temp.info = obj;
            temp.next = null;
            current.next = temp;
            current = temp;
        }
    }

    void print() {
        temp = head;
        while (temp != null) {
            System.out.println(temp.info);
            temp = temp.next;
        }

    }

    void insertatbegining(T obj) {
        temp = new node<T>();
        temp.info = obj;
        temp.next = head;
        head = temp;

    }

    void insertatend(T obj) {
        temp = new node<T>();
        temp.info = obj;
        temp.next = null;
        current.next = temp;
        current = temp;

    }

    void InsertAtIndex(int index, T obj) {
        int i = 0;
        temp = head;

        while (i < index) {
            temp = temp.next;
            i++;
        }
        node<T> newnode = new node<>();
        newnode.info = obj;
        newnode.next = temp.next;
        temp.next = newnode;
    }

    void deleteAtBegining() {
        temp = head;
        head = head.next;
        temp = null;
        System.gc();
    }

    void deleteAtEnd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void reverse() {
        node<T> previousnode = null;
        node<T> nextnode = null;
        node<T> temp = head;
        while (temp != null) {
            nextnode = temp.next;
            temp.next = previousnode;

            previousnode = temp;
            temp = nextnode;
        }
        head = previousnode;
    }

    int findsizeIterative() {
        int size = 0;
        temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    int findsizeRecusive() {
        temp = head;
        return count(temp);
    }

    private int count(node<T> temp) {
        if (temp == null) {
            return 0;
        } else {
            return count(temp.next) + 1;
        }
    }

    void SwapKeys(int i, int j) {
        temp = head;
        node<T> node1 = temp;
        node<T> Prevnode1 = null;
        node<T> node2 = temp;
        node<T> Prevnode2 = null;
        if(i==j)
            return;
        int size = findsizeRecusive();
        if (size < i || size < j) {
            throw new OutOfMemoryError("list size is less then key.......... kindly check");
        } else {
            while (i > 1) {
                Prevnode1 = node1;
                node1 = node1.next;
                i--;
            }
            while ( j > 1) {
                Prevnode2 = node2;
                node2 = node2.next;
                j--;
            }
            if(Prevnode1==null)
            {
                head=node2;
            }
            if(Prevnode2==null)
            {
                head=node1;
            }
            if(Prevnode1!=null)
            {
            Prevnode1.next=node2;
            }
            if(Prevnode2!=null)
            {
                Prevnode2.next=node1;
            }
            node<T> temp1=node1.next;
            node1.next=node2.next;
            node2.next=temp1;
        }
    }

    boolean findloop() {
        temp=head;
        node<T> temp1=head.next;
        while(temp!=null && temp1!=null && temp1.next!= null)
        {
           temp=temp.next;
           temp1=temp1.next.next;
           if(temp==temp1)
               return true;
        }
        
        return false;
    }

    void findNthElementFromEnd(int i) {
       temp=head;
       node<T> tempnode=temp;
       while(i>0)
       {
           tempnode=tempnode.next;
           i--;
       }
       while(tempnode!=null)
       {
           temp=temp.next;
           tempnode=tempnode.next;
       }
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
