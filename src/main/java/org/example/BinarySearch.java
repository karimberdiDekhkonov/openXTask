package org.example;

import java.util.ArrayList;

public class BinarySearch {

    private static class Node{
        private int value;

        private Node left;
        private Node right;

        public Node(int value){
            this.value=value;
        }

    }

    private Node root;

    public void insert(int item){
        if (root==null){
            root = new Node(item);
            return;
        }
        Node current = root;

        while (true){
            if (item> current.value){
                if (current.right==null){
                    current.right = new Node(item);
                    break;
                }
                current=current.right;
            }
            else{
                if (current.left==null){
                    current.left = new Node(item);
                    break;
                }
                current=current.left;
            }
        }
    }

    public void print(){
        printInner(root);
    }
    private void printInner(Node node){
        if (node==null) return;
        System.out.println(node.value);
        printInner(node.left);
        printInner(node.right);
    }

    public ArrayList<Integer> getNumbers(){
        return  innerGetNumbers(root);
    }
    private ArrayList<Integer> innerGetNumbers(Node node){
        ArrayList<Integer> res = new ArrayList<>();
        if (node==null) return res;
        res.add(node.value);
        res.addAll(innerGetNumbers(node.left));
        res.addAll(innerGetNumbers(node.right));
        return res;
    }

    public int height(){
        return innerHeight(root);
    }
    private int innerHeight(Node node){
        if (node==null) return 0;

        int lHeight = innerHeight(node.left);
        int rHeight = innerHeight(node.right);

        if (lHeight > rHeight) return lHeight+1;
        else return rHeight + 1;
    }

    public void printAllLeaves(){
        innerPrintAllLeaves(root);
    }
    private void innerPrintAllLeaves(Node root){
        if (root==null) return;
        else if (root.left==null && root.right==null) {
            System.out.println(root.value);
        }else {
            innerPrintAllLeaves(root.left);
            innerPrintAllLeaves(root.right);
        }

    }

    public void printRightNodes(){
        for (int i = 0; i <= height(); i++) {
            innerPrintRightNodes(root, i);
        }
    }

    private void innerPrintRightNodes(Node root, int level){
        if (root==null) return;
        else if (level==1){
            System.out.println(root.value);
        }

        innerPrintRightNodes(root.right, level-1);

    }
}
