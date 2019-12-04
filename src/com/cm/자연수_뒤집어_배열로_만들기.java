package com.cm;

/**
 * 문제 : 자연수 뒤집어 배열로 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12932
 *
 * 문제 설명
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 *
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 * 입출력 예
 * n	return
 * 12345	[5,4,3,2,1]
 */
public class 자연수_뒤집어_배열로_만들기 {

    public 자연수_뒤집어_배열로_만들기(){
        long n =12345;
        System.out.println(solution(n));
    }

    public int[] solution(long n) {
        String str = String.valueOf(n);

        String[] arr = str.split("");

        int[] answer = new int[arr.length];

        int j = 0;
        for(int i =arr.length-1 ; i>=0; i--){
            answer[j] = Integer.parseInt(arr[i]);
            j++;
        }

//        for(int i : answer)  System.out.println(i);

        return answer;
    }
}
