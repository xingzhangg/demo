package com.example.demo.node;

import java.util.Stack;

/**
 * 反向打印单向链表
 */
public class ReverseNode {

    public static class Node<T>{
        public T value;
        public Node next;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    /**
     * 利用栈的后进先出的特性
     * @param node
     */
    public void reverseNode1(Node node){
        System.out.println("====翻转之前====");
        Stack<Node> stack = new Stack<>();
        while (node != null){
            System.out.println(node.value + "----->");
            stack.push(node);
            node = node.next;
        }
        System.out.println("====翻转之后====");
        while (!stack.empty()){
           Node node1 =  stack.pop();
            System.out.println(node1.value + "------>");
        }
    }

    /**
     * 头插入链表
     * @param head
     */
    public void reverseNode2(Node head) {
        Node newNode;

        Node pre = head;
        Node cur = head.next;
        Node next;
        while(cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        head.next = null;
        newNode = pre;
        System.out.println("====翻转之后====");
        while(newNode != null){
            System.out.println(newNode.value);
            newNode = newNode.next;
        }
    }

    /**
     * 递归
     * @param head
     */
    public void reverseNode3(Node head){
        if(head == null) return;

        if (head.next != null){
            reverseNode3(head.next);
        }
        System.out.println(head.value);
    }






}
