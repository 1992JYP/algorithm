public class Q10158 {
    public static String solution(int x, int y, int nx, int ny, int p3){

        int t = p3;

        int fx = (t+nx)%(2*x);
        int fy = (t+ny)%(2*y);

        int ax = fx;
        int ay = fy;
        if(fx > x){
            ax = (2*x)-fx;
        }
        if (fy > y ){
            ay = (2*y)-fy;
        }

        return String.format("%d %d", ax, ay);
    }
}
         /*
          * 10158
          
          int x = sc.nextInt();
          int y = sc.nextInt();
          int nx = sc.nextInt();
          int ny = sc.nextInt();
          int p3 = sc.nextInt();
  
          String answer = Q10158.solution(x,y,nx,ny,p2,p3);
  
          System.out.println(answer);
          */