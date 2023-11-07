import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        System.setIn(new FileInputStream("input.txt"));
        Scanner sc = new Scanner(System.in);

        /*
        * 1236
        */

        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();

        ArrayList<String> map = new ArrayList<>();
        for(int i=0;i<x;i++)
            map.add(sc.nextLine());

        int answer = Q1236.solution(x, y, map);

        System.out.println(answer);

        sc.close();
    }
}
