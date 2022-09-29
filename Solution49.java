/**
 *  문제 49 번 체육복
 */

import java.util.Arrays;

class Solution49 {
    public int solution49(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n - (lost.length);
        Arrays.sort(reserve);
        Arrays.sort(lost);		/*  배열 원소값 크기 순으로 정렬  */
        /* 도난(+) 여벌(+) : 빌려줄 수 없음. 본인이 입어야 함. */
        for (int i=0; i<reserve.length; i++) {
            for (int j=0; j<lost.length; j++) {
                if ( reserve[i] == lost[j] ) {
                    answer += 1;
                    reserve[i] = -1;
                    lost[j] = -1;
                }
            }
        }
        for (int i=0; i<reserve.length; i++) {
            for (int j=0; j<lost.length; j++) {
                if ( (reserve[i] != -1 && lost[j] != -1) )  {
                    // 빌려줄 수 없는 애들 제외
                    if ( reserve[i] - lost[j] == 1 || reserve[i] - lost[j] == -1 ) {
                        // 앞 번호이거나 뒷 번호이다 (== 번호 차이가 1이다) => 빌려줄 수 있다
                        reserve[i] = -1;
                        lost[j] = -1;
                        answer += 1;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution49 solution49 = new Solution49();
        int n = 5;
        int []lost = {2,4};
        int []reverse  = {1,3,5};
        System.out.println(solution49.solution49(n , lost, reverse));
    }
}



