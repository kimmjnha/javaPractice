package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1******
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("'-'을 포함한 주민등록번호를 입력하세요. : ");
        String str = sc.next();

        String[] sarr = new String[str.length()];   //  String array 문자열 배열의 길이 확인
        char[] carr = str.toCharArray();    //  str(문자열 배열)을 CharArray(문자 배열)에 대입

        for (int i = 0; i < carr.length; i++) {
            if (i >= 8) {
                carr[i] = '*';
            }   /* 1. int i = 0;
            ==> index 번호 0번부터 확인
    2. i < carr.length;
            ==> 주민등록번호(carr, 000000-00000)가 0보다 길면(carr.length(주민등록번호의 문자 갯수) = 총 13개)
                if문으로 이동
    3. if(i >= 8)
            ==> index 번호가 8 이상이면
    4. carr[i] = '*';
            ==> carr의 index에 대입 되어있는 값을 '*'로 초기화

            else

    5. if(i >= 8)
            ==> index 번호가 8 이하이면 i++(index 값에 1 더하기) 후 다시 for문 초기식으로 반환
 */

            System.out.print(carr[i]);
            /* Char array의 8번째 숫자부터 '*'로 초기화 된
            index 값(0/0/0/0/0/0/-/0/+/+/+/+/+) 출력 */
        }
    }
}