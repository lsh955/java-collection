package com.study.collection.queue;

import java.util.Stack;

/**
 * @author 이승환
 * @since 2020-11-17
 */
public class StackEx {
    public static void main(String[] args) {
        // 스택 생성
        Stack<Integer> stack = new Stack<Integer>();

        // push() 메소드를 이용한 요소의 저장
        stack.push(4);
        stack.push(2);
        stack.push(3);
        stack.push(1);

        // peek() 메소드를 이용한 마지막으로 저장된 요소반환
        System.out.println(stack.peek());
        System.out.println(stack); // 스택에 들어있는 모든요소 출력

        System.out.println(" ");

        // pop() 메소드를 이용한 마지막으로 저장된 요소반환 과 스택에서 제거
        System.out.println(stack.pop());
        System.out.println(stack); // 스택에 들어있는 모든요소 출력

        // search() 메소드를 이용한 마지막으로 저장된 요소의 위치검색
        // 요소의 위치는 0 부터 아닌 1 부터 시작함.
        System.out.println(stack.search(4));
        System.out.println(stack.search(3));
    }
}
