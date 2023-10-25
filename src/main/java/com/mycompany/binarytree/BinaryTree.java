/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binarytree;

/**
 *
 * @author User
 */
class BinaryTree {
    public static void main (String[] data) {
        // 4 8 2 1 7 9
        Node root = null;
        root = insert(root, 4);
        root = insert(root, 8);
        root = insert(root, 2);
        root = insert(root, 1);
        root = insert(root, 7);
        root = insert(root, 9);
        
        
        System.out.println(count(root));
    }
    
    static Node insert(Node current, int value) {
        if (current == null) {
            current = new Node();
            current.value = value;
            return current;
        }
        
        if (value < current.value) current.left = insert(current.left, value);
        if (value > current.value) current.right = insert(current.right, value);
        //if (value >= current.value) current.right = insert(current.right, value); 
        //^---It for count same data.
        return current;
    }
    
    static int count(Node parent) {
        if (parent == null) return 0;
        int a = count(parent.left);
        int b = count(parent.right);
        return a + b + 1;
    }
}

class Node {
    int value;
    String name;
    Node left;
    Node right;
}

