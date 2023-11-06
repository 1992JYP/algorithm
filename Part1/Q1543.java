package Part1;


/*
 * 단어찾기
 */
public class Q1543 {
    /**
     * 이 메서드는 어떤 기능을 수행하는지 설명하는 주석입니다.
     * 
     * @param p1 첫 번째 매개변수에 대한 설명
     * @param p2 두 번째 매개변수에 대한 설명
     * @return 메서드가 반환하는 값에 대한 설명
     */
    public static int solution(String p1, String p2){

        int answer = 0;

        for (int i=0 ;i< p1.length()-p2.length()+1 ; i++){
            
            if(p1.substring(i, i+p2.length()).equals(p2)){
                answer+=1;
                i+=(p2.length()-1);
            }
        }

        return answer;
    }
}
/*
 *  aabbcc
    ab
 */