package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
         * 검색할 문자를 하나 입력 받아
         * 입력 받은 검색할 문자가 문자열에 몇개 있는지를 출력하세요
         *
         * -- 입력 예시 --
         * 문자열을 하나 입력하세요 : helloworld
         *
         * -- 출력 예시 --
         * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
         * */

        /* 문자열 클래스에서 제공하는 length(), charAt() */








        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요. : ");
        String user1 = sc.nextLine();

        char[] carr1 = new char[user1.length()];


        System.out.print("검색할 문자를 하나 입력하세요. : ");
        char user2 = sc.next().charAt(0);

        char[] carr2 = user1.toCharArray();

        int count = 0;

        for(int i = 0; i < carr2.length; i++) {
            if(carr2[i] == user2) {
                count++;
            }
        }

        System.out.println("입력하신 문자열 " + user1 + "에서 찾으시는 문자 " + user2 + "는(은)" + count + "개 입니다.");
    }
}

//  'carr1' 안에 있는 값을 확인 하려면
//  for(int i = 0; i < carr1.length; i++) {
//  System.out.println(carr1[i]);} 을 입력하여 확인 가능
/* carr1과 carr2 동일 */


/* 문제풀이
*
* 1. char[] carr1 = new char[user1.length()];
*           : carr2라는 문자배열을 선언 후, 입력한 문자열(user1) 만큼의 배열을 생성.
*           여기에는 user1의 길이만큼 문자를 저장할 수 있다.
*           !!!문자열을 문자로 형변환 하는 것이 아니라 단순히 빈 문자 배열만 생성!!!
*
* 2. char[] carr2 = user1.toCharArray();
*           : carr2라는 문자배열을 선언 후, 문자열을 문자로 형변환 하고 새로운 문자 배열에 저장
*
* 3. for(int i = 0; i < carr2.length; i++)
*       if(carr2[i] == user2)
*           : 0이 carr2보다 작으면  if로 내려가서 carr2 인덱스의 i번의 문자가 user2(입력한 문자)와 같은지 비교
*           ===> 같으면 count++
*
* 4. for(int i = 0; i < carr2.length; i++)
*           : 다시 for문으로 올라가서 i++( i++ 된  i는 1이 됨)
*
* 5. for(int i = 0; i < carr2.length; i++)
*           : 1이 된 i가 carr2.length보다 작으면 if문으로
*
* 6. if(carr2[i] == user2)
*           : carr2의 2번째 배열에 user2(입력한 문자)와 같은지 비교
*           ===> 같으면 count++
*
* 7. <<< 반복 >>>
*
* 8. hello를 입력 했다면 i가 5가 되어서 carr2.length의 길이인 5와 같아질 때 !!!종료!!!
* */

