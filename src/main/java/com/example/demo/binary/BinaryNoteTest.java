package com.example.demo.binary;

public class BinaryNoteTest {
    public static void main(String[] args) {
        BinaryNode binaryNode = new BinaryNode();
        binaryNode =  binaryNode.createBinaryNode();
        binaryNode.levelIterator(binaryNode);
        System.out.println("=======================");
        binaryNode.levelIterator2(binaryNode);

    }
}
