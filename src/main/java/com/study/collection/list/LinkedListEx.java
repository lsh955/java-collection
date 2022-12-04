package com.study.collection.list;

import java.util.LinkedList;

/**
 * @author 이승환
 * @since 2020-11-17
 * <p>
 * List 인터페이스를 구현한 모든 List 컬렉션 클래스는
 * - 요소의 저장순서가 유지되고
 * - 같은 요소의 중복저장을 허용한다.
 */
public class LinkedListEx {
    public static void main(String[] args) {
        // 리스트 생성
        LinkedList<String> linkedList1 = new LinkedList<String>();

        // add() 메소드를 이용한 요소의 저장
        linkedList1.add("넷");
        linkedList1.add("둘");
        linkedList1.add("셋");
        linkedList1.add("하나");

        // for 문과 get() 메소드를 이용한 요소의 출력
        for (int i = 0; i < linkedList1.size(); i++) {
            System.out.println(linkedList1.get(i));
        }
        System.out.println(" ");

        // remove() 메소드를 이용한 요소의 제거
        linkedList1.remove(1);

        // Enhanced for 문과 get() 메소드를 이용한 요소의 출력
        for (String value : linkedList1) {
            System.out.println(value);
        }
        System.out.println(" ");

        // set() 메소드를 이용한 요소의 변경
        linkedList1.set(2, "추가했음");

        // Enhanced for 문과 get() 메소드를 이용한 요소의 출력
        for (String value : linkedList1) {
            System.out.println(value);
        }
        System.out.println(" ");

        System.out.println("리스트의 총 크기 : " + linkedList1.size());
    }
}
