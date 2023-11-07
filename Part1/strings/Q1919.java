package strings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


/*
 * 애너그램
 */
class Q1919{
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("input.txt"));
        Scanner sc = new Scanner(System.in);

        String L1 = sc.nextLine();
        String L2 = sc.nextLine();

        HashMap<Character,Integer> M1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> M2 = new HashMap<Character,Integer>();
        
        for (char c = 'a' ; c<='z';c++){
            M1.put(c,0);
            M2.put(c,0);
        }

        char[] arr1 = L1.toCharArray();
        char[] arr2 = L2.toCharArray();
        
        for(int i = 0; i<arr1.length ;i++){
            M1.put(arr1[i], M1.get(arr1[i])+1);
        }
        for(int i = 0; i<arr2.length ;i++){
            M2.put(arr2[i], M2.get(arr2[i])+1);
        }
        int answer = 0;
        for (char c = 'a' ; c<='z';c++){
            int tmp;
            
            tmp = M1.get(c) - M2.get(c);
            tmp = tmp >0 ? tmp : tmp*-1;

            answer += tmp;
        }

        System.out.println();
        System.err.println(answer);

        sc.close();
    }
}

/*
IN 
aabbcc
xxyybb

OUT
8

 */