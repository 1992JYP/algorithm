import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class test {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("input.txt"));
        Scanner sc = new Scanner(System.in);

        String L1 = sc.nextLine();
        
        char[] arr = L1.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();
        
        for (char c = 'A';c<='Z';c++){
            map.put(c, 0);
        }

        for (int i=0;i<arr.length;i++){
            if (arr[i] >= 'a')
                arr[i]=(char)(arr[i]-32);
            map.put(arr[i], map.get(arr[i])+1);
        }

        int maxCount = 0;
        for (int count : map.values()){
            maxCount = count > maxCount ? count : maxCount;
        }
        sc.close();        

        boolean returnFlag = false;
        char answer = '?';
        for (char c : map.keySet()){
            if(map.get(c).equals(maxCount)){
                if(returnFlag) {
                    answer = '?';
                    break;
                }
                answer = c;
                returnFlag=true;
            }
        }

        System.out.println(answer);

    }
}
