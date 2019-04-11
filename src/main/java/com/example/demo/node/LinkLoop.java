package com.example.demo.node;

/**
 * 判断链表有环
 */
public class LinkLoop {

    public static class Node{

        private Object data;

        public Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    /**
     * 判断是否有环
     * @param node
     * @return
     */
    public boolean isLoop(Node node){
        Node slow = node;
        Node fast = node.next;
        while (slow.next != null) {
            Object dataSlow = slow.data;
            Object dataFast = fast.data;

            if (dataSlow == dataFast) {
                return true;
            }

            if (fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next; //重点, 如果是fast.next死循环

            if (fast == null) {
                return false;
            }

        }
        return false;
    }
}
