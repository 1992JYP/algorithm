import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class test{
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("input.txt"));
        Scanner sc = new Scanner(System.in);

        String T = sc.nextLine();

        char[] Tarr = T.toCharArray();
        
        for (int i = 0 ;i<Tarr.length ; i++) {
            if (Tarr[i]>='a' && Tarr[i]<='z')
                Tarr[i]-=32;
            else
                Tarr[i]+=32;
            System.out.print( Tarr[i]) ;
        }

        sc.close();
    }
}
/*
 * IN
 * WrongAnswer
 * 
 * OUT
 * wRONGaNSWER
 */