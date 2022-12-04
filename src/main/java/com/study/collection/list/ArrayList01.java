package com.study.collection.list;

import java.util.ArrayList;

/**
 * @author 이승환
 * @since 2020-11-17
 */
public class ArrayList01 {
    public static void main(String[] args) {
        // 리스트 생성
        ArrayList<String> arrayList = new ArrayList<String>();

        // 리스트에 요소의 저장
        arrayList.add("넷");
        arrayList.add("둘");
        arrayList.add("셋");
        arrayList.add("하나");

        // 리스트 요소의 출력
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
