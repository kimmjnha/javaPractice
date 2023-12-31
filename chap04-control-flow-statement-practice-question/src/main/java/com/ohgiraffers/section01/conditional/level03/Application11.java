package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application11 {

    public static void main(String[] args) {

        /*
            10 이하의 임의의 난수를 발생시키고 사용자에게 정수 한 개를 입력 받아
            난수가 입력한 정수보다 작으면 “입력하신 정수보다 작습니다.” 출력,
            난수가 입력한 정수보다 크면 “입력하신 정수보다 큽니다.”를 출력하세요.

            단, 정답을 맞출 때까지 정수를 계속 입력 받아 프로그램이 반복 되도록 하고
            정답인 경우 “정답입니다, n회 만에 정답을 맞추셨습니다.”처럼 몇 번째에 정답을 맞췄는지 출력하세요.
       */


        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("10 이하 임의의 난수를 발생시킵니다. 임의의 난수와 같은 수를 입력 해보세요!");
            int random = (int) (Math.random() * 10 + 1);    //   0에 10을 곱하면 0 ~ 99까지의 정수가 나옴 +1을 해주면 0 ~ 100까지의 숫자 얻기 가능

            System.out.print("정수 한 개를 입력하세요. : ");
            int user = sc.nextInt();

            System.out.println("10 이하 임의의 난수 : " + random);
            if (user != random) {
                if (user > random) {
                    System.out.println("입력하신 정수보다 난수가 작습니다.");
                } else {
                    System.out.println("입력하신 정수보다 난수가 큽니다.");
                }
                count++;
            } else {
                count++;
                System.out.println("Correct! " + count + "회만에 정답을 맞추셨습니다.");
                break;
            }
        }
    }
}


