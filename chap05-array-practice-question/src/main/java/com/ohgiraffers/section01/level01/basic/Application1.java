package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    public static void main(String[] args) {

        /* 길이가 10인 정수형 배열을 선언 및 할당한 뒤
         * 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요
         * */


//        int[] arr = new int[10];
//
//        for(int i = 0; i < 10; i++) {
//            arr[i] = (i)+1;
//            System.out.println(arr[i]);

         int[] arr = new int[10];

         for(int i = 1; i <= 10; i++) {
             arr[i-1] = (i-1)+1;        //  0번째 배열 = 1
             System.out.println(arr[i-1]);
         }
    }
}

/*
* 문제풀이
*
* 1. int i = 0;
*       배열 0번째부터 시작, 정수 0 선언 => 배열, 정수 같이 씀
* 2. i <= 10
*       0은 10과 같거나 작다
* 3. arr[i] = (i)+1;
*       배열[0번째] = (정수 0) + 1;
* 4. System.out.println(arr[0]);
*       배열 0번째의 결과값 정수 1 출력
* 5. i++
*       배열 0번째 +1 => 1번째 됨
* 6. 1 <= 10
*       ++된 결과값 1이 10번째 이하인지 확인
* 7. arr[1] = (1)+1;
*       배열 1번째 = (1+1;)
* 8. System.out.println(arr[1]);
*       배열 1번째의 결과값 정수 2 출력
* 9. <<< 반복 >>>
*
* */