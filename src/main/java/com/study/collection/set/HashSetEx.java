package com.study.collection.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 이승환
 * @since 2020-11-17
 *
 * 요소의 저장 순서를 유지하지 않고,
 * 같은 요소의 중복 저장을 허용하지 않는다. 이는,
 * Set 컬랙션 클래스에 속하는 클래스에 속한다.
 */
public class HashSetEx {
    public static void main(String[] args) {
        // 생성
        HashSet<String> hs01 = new HashSet<String>();
        HashSet<String> hs02 = new HashSet<String>();

        // add() 메소드를 이용한 요소의 저장
        hs01.add("홍길동"); // 추가
        hs01.add("이순신");
        System.out.println(hs01.add("임꺽정")); // true
        System.out.println(hs01.add("임꺽정")); // false 중복된 요소저장의 테스트

        System.out.println(" ");

        // Enhanced for 문과 get() 메소드를 이용한 요소의 출력
        for (String value : hs01) {
            System.out.print(value + " ");
        }
        System.out.println(" ");

        // add() 메소드를 이용한 요소의 저장
        hs02.add("임꺽정"); // 추가
        hs02.add("홍길동");
        hs02.add("이순신");

        // iterator() 메소드를 이용한 요소의 출력
        Iterator<String> iter02 = hs02.iterator();
        while (iter02.hasNext()) {
            System.out.print(iter02.next() + " ");
        }
        System.out.println(" ");

        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("집합의 크기 : " + hs02.size());
    }
}
