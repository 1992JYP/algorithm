import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Part1.Q13223;


public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        System.setIn(new FileInputStream("input.txt"));
        Scanner sc = new Scanner(System.in);

        
/*
 * 1543 
 String T1 = sc.nextLine();
 String T2 = sc.nextLine();
 
 int answer = Q1543.solution(T1, T2);
 System.out.println(answer);
 */


        /*
         * 13223
         */
        String p1 = sc.nextLine();
        String p2 = sc.nextLine();

        String answer = Q13223.solution(p1, p2);

        System.out.println(answer);


        sc.close();
    }
}
