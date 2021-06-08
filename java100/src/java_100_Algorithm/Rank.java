package java_100_Algorithm;

import java.util.Arrays;
import java.util.Collections;

public class Rank {
    public static void main(String[] args) {
        // rank 알고리즘
        // 배열 선언 -> 성적과 랭킹배열 2개
        int[] scores= {88,50,38,100,90,100,99,65};
        int[] rank = new int[scores.length];

        // 반복문 돌며 랭킹처리
        for(int i=0; i<scores.length; i++){
            // 랭킹 초기값은 0이고 0등은 없기 때문에 전부 1등으로 초기화
            rank[i]=1;

            // 중첩
            for(int j=0; j< scores.length; j++){
                if(scores[i] < scores[j]){
                    rank[i]++;
                }
            }

            // 출력
            System.out.println(scores[i]+"->"+rank[i]+"등");
        }
    }
}
