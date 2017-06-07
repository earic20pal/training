/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package environment;

/**
 *
 * @author ravi
 */
public class Tree<T> {

    Tnode<T> Root = null;

    void add(T val) {
        Tnode<T> root = new Tnode<>();
        if(Root==null)
        {
            Root=new Tnode<>();
            Root.info=val;
        }
        else
        {

        while (root != null) {
            if (root.left == null) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        root.info = val;
        }
    }

    void print() {
        Tnode<T> head = Root;
        showprint(head);

    }

    private void showprint(Tnode<T> head) {

        System.out.println(head.info);
        if (head.left != null) {
            showprint(head.left);
        
        }
        if (head.right != null) {
            showprint(head.right);
    
        }
    }

}

class Tnode< T> {

    T info;
    Tnode left;
    Tnode right;

    public Tnode() {
        info = null;
        left = null;
        right = null;
    }

}
