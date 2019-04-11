package com.example.demo.binary;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class BinaryNode {

    private Object obj;

    private BinaryNode left;

    private BinaryNode right;

    public BinaryNode() {

    }

    public BinaryNode(Object obj, BinaryNode left, BinaryNode right) {
        this.obj = obj;
        this.left = left;
        this.right = right;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public BinaryNode createBinaryNode(){
        BinaryNode node = new BinaryNode("1",null,null) ;
        BinaryNode left2 = new BinaryNode("2",null,null) ;
        BinaryNode left3 = new BinaryNode("3",null,null) ;
        BinaryNode left4 = new BinaryNode("4",null,null) ;
        BinaryNode left5 = new BinaryNode("5",null,null) ;
        BinaryNode left6 = new BinaryNode("6",null,null) ;
        node.setLeft(left2) ;
        left2.setLeft(left4);
        left2.setRight(left6);
        node.setRight(left3);
        left3.setRight(left5) ;
        return node ;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "obj=" + obj +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    /**
     * 遍历二叉树
     * @param binaryNode
     */
    public void levelIterator(BinaryNode binaryNode){
        LinkedList<BinaryNode> queue = new LinkedList();
        queue.add(binaryNode);
        BinaryNode current ;

        while (!queue.isEmpty()) {
            current = queue.poll();
            System.out.println(current.obj + "--->" );

            if (current.left != null) {
                queue.offer(current.left);
            }

            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }

    /**先序遍历
     * 使用递归
     * @param binaryNode
     */
    public void levelIterator2(BinaryNode binaryNode){
        if (binaryNode == null) return;
        System.out.println(binaryNode.obj + "--->");
        levelIterator2(binaryNode.left);
        levelIterator2(binaryNode.right);
    }
}
