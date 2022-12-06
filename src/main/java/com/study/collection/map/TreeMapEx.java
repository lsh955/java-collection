package com.study.collection.map;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * @author 이승환
 * @since 2020-11-17
 */
public class TreeMapEx {
    public static void main(String[] args) {
        // 생성
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        // put() 메소드를 이용한 요소의 저장
        tm.put(30, "삼십");
        tm.put(10, "십");
        tm.put(40, "사십");
        tm.put(20, "이십");

        // Enhanced for 문과 get() 메소드를 이용한 요소의 출력
        System.out.println("맵에 저장된 키들의 집합 : " + tm.keySet());
        for (Integer key : tm.keySet()) {
            System.out.println(String.format("키 %s, 값 : %s", key, tm.keySet()));
        }
        System.out.println(" ");

        // remove() 메소드를 이용한 요소의 제거
        tm.remove(40);

        // iterator() 메소드와 get() 메소드를 이용한 요소의 출력
        Iterator<Integer> keys = tm.keySet().iterator();
        while (keys.hasNext()) {
            Integer key = keys.next();
            System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));
        }
        System.out.println(" ");

        // replace() 메소드를 이용한 요소의 수정
        tm.replace(20, "lsh");

        // Enhanced for 문과 get() 메소드를 이용한 요소의 출력
        for (Integer key : tm.keySet()) {
            System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));
        }

        System.out.println("맵의 크기 : " + tm.size());
    }
}
