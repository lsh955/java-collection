package com.study.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author 이승환
 * @since 2020-11-17
 */
public class ArrayListEx {
    public static void main(String[] args) {
        // 리스트 생성
        ArrayList<String> arrayList1 = new ArrayList<String>();

        // 리스트에 요소의 저장
        arrayList1.add("넷");
        arrayList1.add("둘");
        arrayList1.add("셋");
        arrayList1.add("하나");

        // 리스트 요소의 출력
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }
        System.out.println("");

        // 리스트 생성
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        // add() 메소드를 이용한 요소의 저장
        arrayList2.add(40);
        arrayList2.add(20);
        arrayList2.add(30);
        arrayList2.add(10);

        // for 문과 get() 메소드를 이용한 요소의 출력
        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.println(arrayList2.get(i));
        }
        System.out.println("");

        // remove() 메소드를 이용한 요소의 제거
        arrayList2.remove(1);

        // Enhanced for 문과 get() 메소드를 이용한 요소의 출력
        for (int value : arrayList2) {
            System.out.println(value + " ");
        }
        System.out.println("");

        // Collections.sort() 메소르를 이용한 요소의 출력
        Collections.sort(arrayList2);

        // iterator() 메소드와 get() 메소드를 이용한 요소의 출력
        Iterator<Integer> iter = arrayList2.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next() + " ");
        }
        System.out.println("");

        // set() 메소드를 이용한 요소의 변경
        arrayList2.set(0, 20); // 0번에 해당하는 인덱스를 20으로 변경

        for (int value : arrayList2) {
            System.out.println(value + " ");
        }
        System.out.println("");

        System.out.println("리스트의 최종 크기 : " + arrayList2.size());
    }
}
