package java_100_Algorithm;

public class MaxMin {
    // 정수배열 내에서 최대 최소를 구하시오
    public static void main(String[] args) {
        int[] arg ={4,13,150,17,-2};

        // 내가 한 방법 반복문사용
        int[] tmp = new int[1];

        for(int i = 0; i<arg.length; i++){
           for(int j=0; j<arg.length-1; j++){
               if(arg[j] < arg[j+1]){
                   tmp[0] = arg[j];
                   arg[j] = arg[j+1];
                   arg[j+1] = tmp[0];
               }
           }
        }

        System.out.println("최대값 : "+arg[0]);
        System.out.println("최소값 : "+arg[4]);

        // 배열내 첫번째 원소의 값이 제일 크다고 가정하고 초기화.
        // 음수가 있다고 가정하면 Integer.MIN_VALUE 없다고 가정하면 0
//        int max = Integer.MIN_VALUE;

        // 반복문 돌면서 비교하며 출력, 이때 비교는 2번째부터 비교
        int max= arg[0];
        for(int i = 1; i<arg.length; i++){
            if(max<arg[i]){
                max= arg[i];
            }
        }

//        int min = Integer.MAX_VALUE;
        int min = arg[0];
        for(int i = 1; i<arg.length; i++){
            if(min>arg[i]){
                min= arg[i];
            }
        }

        System.out.println("현재 배열에서 가장 큰 값은 : "+max);
        System.out.println("현재 배열에서 가장 작은 값은 : "+min);

    }
}
