package com.study.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author 이승환
 * @since 2020-11-17
 */
public class TreeSetEx {
    public static void main(String[] args) {
        // 생성
        TreeSet<Integer> ts = new TreeSet<Integer>();

        // add() 메소드를 이용한 요소의 저장
        ts.add(30);
        ts.add(40);
        ts.add(20);
        ts.add(10);

        // Enhanced for 문과 get() 메소드를 이용한 요소의 출력
        for (int value : ts) {
            System.out.print(value + " ");
        }
        System.out.println(" ");

        // remove() 메소드를 이용한 요소의 제거
        ts.remove(40);

        // iterator() 메소드를 이용한 요소의 출력
        Iterator<Integer> iter = ts.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println(" ");

        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("이진 검색 트리의 크기 : " + ts.size());

        // subSet() 메소드를 이용한 부분 집합출력
        System.out.println(ts.subSet(10, 20));
        System.out.println(ts.subSet(10, true, 20, true));
    }
}
