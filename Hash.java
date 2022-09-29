import java.util.HashMap;
import java.util.Iterator;

/**
 * 프로그래머스 코딩 테스트 문제 : 위장
 * 정보원 옷을 몃가지나 갈아입을수 있는지 계산
 * HashMap 이용
 */
public class Hash {
    public int solution(String[][] clothes){
        // 1. 옷을 종류별로 구분한다.
        HashMap<String,Integer> map = new HashMap<>();
        for(String [] clothe : clothes){
            String type = clothe[1];
            map.put(type,map.getOrDefault(type,0) +1);
        }
        // 2. 입지 않는 옷을 추가해서 모든 조합을 계산한다.
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;
        while(it.hasNext())
            answer *= it.next().intValue() +1;
        // 3. 아무종류의 옷도 입지 않는 경우 제외한다.
        return answer -1;
    }
    public static void main(String[] args) {
        Hash sol = new Hash();
        String[][] clothes = { {"yellowhat","headgear"},
                               {"bluesunglasses","eyewear"},
                               {"green_turban","headgear"} };
        System.out.println(sol.solution(clothes));
    }
}
