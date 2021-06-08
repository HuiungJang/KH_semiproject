package java_100_Algorithm;

import java.util.Arrays;
import java.util.Collections;

public class AscSort {
    public static void main(String[] args) {
        // 정렬함수 사용해서 정렬하기
        // 정렬 알고리즘을 사용하지 않고 내장 메소드를 사용해서 정렬하자

        // 1. 오름차순
        int[] originArr= {88,50,38,100,90,100,99,65};
        System.out.print("정렬 전 : ");
        for(int a : originArr){
            System.out.print(a+" ");
        }
        Arrays.sort(originArr);

        System.out.println();
        System.out.print("정렬 후 : ");
        for(int a : originArr){
            System.out.print(a+" ");
        }

        // 2. 내림차순
        // 1) 내가 한 방식. 배열을 오름차순으로 정렬하고 역순으로 출력하기
        System.out.println();
        System.out.print("내림차순 : ");
        for(int i= originArr.length-1; i>=0; i--){
            System.out.print(originArr[i] + " ");
        }

        // 2) Collections 의  reverseOrder 메소드
        // Arrays.sort(배열명, Collections.reverseOrder());
        // 기본형 배열에는 적용되지 않는다. cf) String 은 기본형이 아니다.
        // Arrays.sort(originArr,Collections.reverseOrder()); -> 불가능
        // originArr -> int형 기본데이터 타입을 가진 배열이기 때문

        Integer[] notPrimitiveIntArr = {88,50,38,100,90,100,99,65};

        Arrays.sort(notPrimitiveIntArr,Collections.reverseOrder());
        System.out.println();
        System.out.print("Collection을 사용한 내림차순 재정렬 : ");
        for(Integer a : notPrimitiveIntArr){
            System.out.print(a+" ");
        }



    }
}
