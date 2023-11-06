package Part1;

/*
 * 시간빼기
 */
public class Q13223 {
    /**
     * 이 메서드는 어떤 기능을 수행하는지 설명하는 주석입니다.
     * 
     * @param p1 첫 번째 매개변수에 대한 설명
     * @param p2 두 번째 매개변수에 대한 설명
     * @return 메서드가 반환하는 값에 대한 설명
     */
    public static String solution(String p1, String p2){

        String[] arr1 = p1.split(":");
        String[] arr2 = p2.split(":");

        // 각 부분을 정수로 파싱
        int hours1 = Integer.parseInt(arr1[0]);
        int minutes1 = Integer.parseInt(arr1[1]);
        int seconds1 = Integer.parseInt(arr1[2]);

        int hours2 = Integer.parseInt(arr2[0]);
        int minutes2 = Integer.parseInt(arr2[1]);
        int seconds2 = Integer.parseInt(arr2[2]);

        // 시간 계산
        int totalHours = hours2 - hours1;
        int totalMinutes = minutes2 - minutes1;
        int totalSeconds = seconds2 - seconds1;

        // 초와 분의 처리
        if (totalSeconds < 0) {
            totalMinutes -= 1;
            totalSeconds += 60;
        }
        if (totalMinutes < 0) {
            totalHours -= 1;
            totalMinutes += 60;
        }
        if (totalHours <0) {
            totalHours+=24;
        }
        if (totalHours==0 && totalMinutes==0 && totalSeconds==0 ) totalHours = 24;
        
        return String.format("%02d:%02d:%02d", totalHours,totalMinutes,totalSeconds);
    }
}
/*
20:00:00
04:00:00

08:00:00
 */