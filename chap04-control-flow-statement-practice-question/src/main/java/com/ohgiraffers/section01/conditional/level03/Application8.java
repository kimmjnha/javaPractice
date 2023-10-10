package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application8 {

    public static void main(String[] args) {

        /*
            1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.

            ex.
            정수를 하나 입력하세요 : 8
            1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
	    */
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("숫자를 입력하세요 : ");
            int user = sc.nextInt();
            if(user >= 1) {
                for(int i = 1; i <= user; i++) {    // 1부터 시작한다; 입력값은 1보다 크거나 같아야한다; 1씩 증가한다;
                    sum += i;   // 1씩 + 연산
                    if(i != user) { // 입력값이 1과 다르면
                        System.out.print(i + " + ");    // 1 + 2 + 3 + 4 + 출력
                    } else {
                        System.out.println(i + " = " + sum);    // 1 = 1 출력
                    }
                }
                break;
            }

        }
    }
}
