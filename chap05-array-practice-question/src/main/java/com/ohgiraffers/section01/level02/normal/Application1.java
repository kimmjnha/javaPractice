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
        String user1 = sc.nextLine();    //  sc.next(); => hello / sc.nextLine(); =>  Hello world (띄어쓰기까지)


        /* String의 길이 확인 */
        char[] carr1 = new char[user1.length()]; //  length(); => String(문자열) 길이 / length => array(배열)의 길이
                //  'carr1' 안에 있는 값을 확인 하려면
                //  for(int i = 0; i < carr1.length; i++) {
                //  System.out.println(carr1[i]);} 을 입력하여 확인 가능

        System.out.print("검색할 문자를 하나 입력하세요. : ");
        char user2 = sc.next().charAt(0);

        char[] carr2 = user1.toCharArray(); //  String 'user1'(ex) hello)을 Char로 형변환(h/e/l/l/o) 해서 배열에 대입한다.
                //  'carr2' 안에 있는 값을 확인 하려면
                //  for(int i = 0; i < carr2.length; i++) {
                //  System.out.println(carr2[i]);} 을 입력하여 확인 가능

        int count = 0;  //  문자 몇 개인지 세는 변수 선언

        for(int i = 0; i < carr2.length; i++) { //  index 0에서 시작; carr2의 길이가 0보다 길면 if문으로
            if(carr2[i] == user2) { //  if(carr2[i번째] == user2) => carr2의 0번째는 user2(내가 입력한 문자)와 같니?
                count++;

                /* 0에서 시작 -> carr2(Char)의 길이가 0보다 길면 if로 이동 - carr2의 0번째는 user2(입력값)와 같나? -
                * 맞으면 count++(1씩 세기), 아니면 안 셈 - i++(i + 1) - for문 처음으로 돌아가서 다시 계산 */
            }
        }


        System.out.println("입력하신 문자열 " + user1 + "에서 찾으시는 문자 " + user2 + "는(은)" + count + "개 입니다.");

    }
}
