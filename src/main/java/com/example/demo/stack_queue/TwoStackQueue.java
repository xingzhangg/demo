package com.example.demo.stack_queue;

import java.util.Stack;

/**
 * 利用两个栈来实现，第一个栈存放写队列的数据。
 *  第二个栈存放移除队列的数据，移除之前先判断第二个栈里是否有数据。
 *  如果没有就要将第一个栈里的数据依次弹出压入第二个栈，这样写入之后的顺序再弹出其实就是一个先进先出的结构了。
 *  * 这样出队列只需要移除第二个栈的头元素即可。
 * @param <T>
 */
public class TwoStackQueue<T> {
    /**
     * 写入的栈
     */
    private Stack<T> input = new Stack<>();

    /**
     * 移除队列的栈
     */
    private Stack<T> output = new Stack<>();

    /**
     * 写入队列
     */
    public void appendTail(T t){
        input.push(t);
    }

    /**
     * 删除队列头结点，并返回删除数据（出列）
     * @return
     */
    public T deleteHead(){
        if (output.isEmpty()) {
            while (!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.pop();
    }

    public int getSize(){
        return input.size() + output.size() ;
    }
}
