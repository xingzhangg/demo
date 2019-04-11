package com.example.demo.node;

import org.junit.Test;

public class ReverseNodeTest {

    @Test
    public void reverseNode1() throws Exception {
        ReverseNode.Node<String> node4 = new ReverseNode.Node<>("4",null) ;
        ReverseNode.Node<String> node3 = new  ReverseNode.Node<>("3",node4);
        ReverseNode.Node<String> node2 = new  ReverseNode.Node<>("2",node3);
        ReverseNode.Node<String> node1 = new  ReverseNode.Node("1",node2) ;

        ReverseNode reverseNode = new ReverseNode() ;
        reverseNode.reverseNode1(node1);
    }

    /**
     * 头插法
     * @throws Exception
     */
    @Test
    public void reverseHead2() throws Exception {
        ReverseNode.Node<String> node4 = new ReverseNode.Node<>("4",null) ;
        ReverseNode.Node<String> node3 = new ReverseNode.Node<>("3",node4);
        ReverseNode.Node<String> node2 = new ReverseNode.Node<>("2",node3);
        ReverseNode.Node<String> node1 = new ReverseNode.Node("1",node2) ;

        ReverseNode reverseNode = new ReverseNode() ;
        reverseNode.reverseNode2(node1);

    }


    @Test
    public void recNodeTest31(){
        ReverseNode.Node<String> node4 = new ReverseNode.Node<>("4",null) ;
        ReverseNode.Node<String> node3 = new ReverseNode.Node<>("3",node4);
        ReverseNode.Node<String> node2 = new ReverseNode.Node<>("2",node3);
        ReverseNode.Node<String> node1 = new ReverseNode.Node("1",node2) ;

        ReverseNode reverseNode = new ReverseNode() ;
        reverseNode.reverseNode3(node1);
    }


}
