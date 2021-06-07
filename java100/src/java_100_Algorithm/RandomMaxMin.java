package java_100_Algorithm;

public class RandomMaxMin {
    public static void main(String[] args) {
        // 랜덤으로 정수 10개의 값을 가지는 배열을 만들어 최대, 최소값을 출력해라
        int[] arg = new int[10];

        for(int i = 0; i<arg.length; i++){
            arg[i] = (int)(Math.random()*Integer.MAX_VALUE);
        }

        int max = arg[0];
        int min = arg[0];

        for(int i = 1; i<arg.length; i++){
            if(max < arg[i]){
                max = arg[i];
            }
        }

        for(int i = 0; i<arg.length; i++){
            if(min > arg[i]){
                min = arg[i];
            }
        }
        System.out.println("최대값 : "+ max);
        System.out.println("최소값 : "+ min);
    }
}
