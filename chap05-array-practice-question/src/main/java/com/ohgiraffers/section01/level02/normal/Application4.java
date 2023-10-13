package com.ohgiraffers.section01.level02.normal;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */
        while (true) {
            int random1 = (int) (Math.random() * 45 + 1);
            int random2 = (int) (Math.random() * 45 + 1);
            int random3 = (int) (Math.random() * 45 + 1);
            int random4 = (int) (Math.random() * 45 + 1);
            int random5 = (int) (Math.random() * 45 + 1);
            int random6 = (int) (Math.random() * 45 + 1);

            System.out.println("로또 번호 6 개는" + "\n" + random1 + "\n" + random2 + "\n" + random3 + "\n" + random4 +
                    "\n" + random5 + "\n" + random6 + "\n" + "입니다.");
            break;
        }


        System.out.println("==========================================================");


        int lotto[] = new int[6];   //  lotto라는 배열 칸 생성 -> 정수 값을 6개 배열하겠다는 선언
        for (int i = 0; i < lotto.length; i++) { //  lotto 길이(= 6)까지
            lotto[i] = (int) (Math.random() * 45 + 1); //  lotto 배열 6칸에 랜덤 숫자 44 + 1개를 배열하겠다
            for (int j = 0; j < i; j++) {   //  정수  j = 0; j부터  i 까지;
                if (lotto[j] == lotto[i]) {
                    i--;
                    break;  //   break; -> 가장 근접한 반복문을 빠져나감

                }
            }
        }

        int temp = 0;
        for(int i = 1; i < lotto.length; i++) { //  순차정렬 나 자신과 비교할 필요가 없어서 0부터 안 해도 된다
            for(int j = 0; j <  lotto.length; i++) {
                if(lotto[i] < lotto[j]);
                temp = lotto[i];
                lotto[i] = lotto[j];
                lotto[j] = temp;
            }
        }
    }
}

/* 문제풀이
 *
 * 1. int random = (int)(Math.random() * 45 + 1) ;
 *           : 45를  * 하면, 0 ~ 44까지의 정수가 출력, +1하면, 0 ~ 45까지의 정수 출력 가능
 * */