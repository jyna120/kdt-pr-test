package org.example;

public class First {

    public static void main(String[] args) {
        // 정인겸
        int i = Integer.MAX_VALUE;
        int j = i++;
        int l = --i;
        System.out.println(j == l);     // true or false?

        int a = 95;
        int b = 80;
        int c = 100;
        int d = (a + b + c) / 3;
        double e = (a + b + c) / 3;
        System.out.println(d == e);     // true or false?

        // 박수빈
        //문제 1
        // 2030년의 J의 나이를 출력하세요.
        // J는 32살 입니다.
        int future = 2030;

        // 문제 2
        // a가 윤년이면 '윤년O', 아니면 '윤년X'로 출력하세요.
        // 윤년 계산법
        // 1. 연도/4가 나누어 떨어지고 연도/100이 나누어 떨어지지 않는다.
        // 2. 연도/400이 나누어 떨어진다.
        // 3. 둘 중 하나만 해당되도 윤년이다.
        int a = 2024;
    }
}
