package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* 임의의 숫자를 입력받아 해당 계절을 출력해주세요
         * 단, 1~12사이의 숫자가 아닌 값이 들어는것은 "잘못입력하셨습니다"를 출력
         * 계절 구분
         * 봄 : 3월,4월,5월
         * 여름: 6월,7월,8월
         * 가을: 9월,10월,11월
         * 겨울: 12월,1월,2일
         *
         * -----  출력 -----
         * 숫자를 입력하세요 : 1
         * 겨울
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("임의의 숫자를 입력하세요. : ");
        int num = sc.nextInt();
        String result = "";

//        if (num >= 1 && num <= 12) {
            if (num == 1 || num == 2 || num == 12) {
                result = "겨울";
                System.out.println("숫자에 해당하는 계절은 " + result + "입니다.");
            }
            else if (num >= 3 && num <= 5 ) {
                result = "봄";
                System.out.println("숫자에 해당하는 계절은 " + result + "입니다.");
            }
            else if (num >= 6 && num <= 8) {
                result = "여름";
                System.out.println("숫자에 해당하는 계절은 " + result + "입니다.");
            }
            else if (num >= 9 && num <= 11) {
                result = "가을";
                System.out.println("숫자에 해당하는 계절은 " + result + "입니다.");
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }


