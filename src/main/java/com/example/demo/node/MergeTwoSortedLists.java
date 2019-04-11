package com.example.demo.node;

/**
 *  * Function: 合并两个排好序的链表
 *  *
 *  * 每次比较两个链表的头结点，将较小结点放到新的链表，最后将新链表指向剩余的链表
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode newNodeLists = new ListNode(0);
        ListNode lastNode = newNodeLists;
        while (l1 != null && l2 != null) {
            if (l1.currentVal < l2.currentVal) {
                lastNode.next = l1;
                l1 = l1.next;
            }else{
                lastNode.next = l2;
                l2 = l2.next;
            }
            lastNode = lastNode.next ;
        }

        if (l1 == null) {
            lastNode.next = l2;
        }

        if (l2 == null){
            lastNode.next = l1;
        }

        return newNodeLists.next;
    }

    public static class ListNode{
        /**
         * 当前值
         */
        int currentVal;
        /**
         * 下一个节点
         */
        ListNode next;

        public ListNode(int currentVal) {
            this.currentVal = currentVal;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "currentVal=" + currentVal +
                    ", next=" + next +
                    '}';
        }
    }


}
