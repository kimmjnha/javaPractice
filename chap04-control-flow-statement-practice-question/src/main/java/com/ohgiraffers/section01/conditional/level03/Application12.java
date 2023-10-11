package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application12 {

    public static void main(String[] args) {

        /*
            정수 입력 : 4
            ****
            ***
            **
            *
            정수 하나를 입력받아서 위와 같은 모양의 삼각형을 출력하세요
       */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. : ");
        int user = sc.nextInt();

        for(int i = 1; i <= user; i++) {   // user가 입력한 값보다 i가 커지면 for문 종료

            /*
            * user가 '5'를 입력
            * i++ => 2
            * 다음 for문
            * */
            for(int u = user; u >= i; u--) { // i보다 user가 작아지면 for문 종료
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
