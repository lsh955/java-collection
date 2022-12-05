package com.study.collection.queue;

import java.util.LinkedList;

/**
 * @author 이승환
 * @since 2020-11-17
 *
 * 선입선출의 시멘틱을 따르는 자료구조,
 * 가장 먼저 저장된(push) 데이터가 가장 먼저 인출(pop) 되는 구조.
 */
public class QueueEx {
    public static void main(String[] args) {
        // 큐 생성
        LinkedList<String> queue = new LinkedList<String>();

        // add() 메소드를 이용한 요소의 반환
        queue.add("넷");
        queue.add("둘");
        queue.add("셋");
        queue.add("하나");

        // peek() 메소드를 이용한 제일먼저 저장된 요소의 반한
        System.out.println(queue.peek());
        System.out.println(queue);

        // poll() 메소드를 이용한 제일먼저 저장된 요소의 반환 및 제거
        System.out.println(queue.poll());
        System.out.println(queue);

        // remove() 메소드를 이용한 요소의 제거
        queue.remove("하나");
        System.out.println(queue);
    }
}
