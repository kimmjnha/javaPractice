package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* 홀수인 양의 정수를 입력 받아 입력 받은 크기 만큼의 정수형 배열을 할당하고
         * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
         * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값 넣어 출력하세요
         *
         * 단, 홀수인 양의 정수를 입력하지 않은 경우에는 "양수 혹은 홀수만 입력해야 합니다."를 출력하세요
         *
         * -- 입력 예시 --
         * 홀수인 양의 정수를 입력하세요 : 7
         *
         * -- 출력 예시 --
         * 1 2 3 4 3 2 1
         *
         * -- 입력 예시 --
         * 홀수인 양의 정수를 입력하세요 : 8
         *
         * -- 출력 예시 --
         * 양수 혹은 홀수만 입력해야 합니다.
         */
        // 3을 입력 받으면 1 2 1        -> 2
        // 5을 입력 받으면 1 2 3 2 1     -> 3
        // 7을 입력 받으면 1 2 3 4 3 2 1   -> 4
        // 9을 입력 받으면 1 2 3 4 5 4 3 2 1  -> 5

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("홀수인 양의 정수를 입력하세요. : ");
            int user = sc.nextInt();
            int cnt = 0;    //  cnt = count

            if (user % 2 == 1) {        // user값을 2로 나누었을 때 나머지가 1이면
                int iarr[] = new int[user]; //  int값을 가진 user(입력값)를 배열
                int mid = (int) (user / 2 + 1); //  user를 2로 나누고 +1
                                                //  ex) 5를 입력하면 2로 나눈 값은 2.5인데 int 값이어서 실수 제외한 정수만 남김
                                                //      그래서 나눈값은 2가 나오고, +1 해서 결과값은 3 => mid = 3;

                for(int i = 0; i < user; i++) {
                    iarr[i] = ++cnt;    //  정수배열 0번째 = +1 => '++'이 앞에 붙으면 +1 선행, cnt++;이면
                }
            } else {
                System.out.println("홀수인 양의 정수만 입력해야 합니다. 다시 입력하세요.");
                continue;
            }
        }







    }
}
