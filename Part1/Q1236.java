/*
 * 성지키기
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;

        /*
        * 1236
        
                int x = sc.nextInt();
                int y = sc.nextInt();
                sc.nextLine();
        
                ArrayList<String> map = new ArrayList<>();
                for(int i=0;i<x;i++)
                    map.add(sc.nextLine());
        
                int answer = Q1236.solution(x, y, map);
        
                System.out.println(answer);
        */

public class Q1236 {
    public static int solution(int x, int y, ArrayList<String> map){

        HashMap<Integer,Integer> xMap = new HashMap<>();
        HashMap<Integer,Integer> yMap = new HashMap<>();

        for(int i=0;i<x;i++)
            xMap.put(i,0);
        for(int i=0;i<y;i++)
            yMap.put(i,0);


        for(int i=0;i<x;i++){
            String floor = map.get(i);
            int floorindex = floor.indexOf("X");
            while (floorindex!=-1){
                xMap.put(i,1);
                yMap.put(floorindex,1);

                floorindex = floor.indexOf("X",floorindex+1);
            }

        }

        int xCount = 0;
        int yCount = 0;

        for (int value : xMap.values()) {
            if (value == 0) {
                xCount++;
            }
        }

        
        for (int value : yMap.values()) {
            if (value == 0) {
                yCount++;
            }
        }
        
        return xCount>yCount ? xCount : yCount;
    }
}
