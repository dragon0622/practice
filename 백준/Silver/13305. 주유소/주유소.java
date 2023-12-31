import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int numOfCity = sc.nextInt();
        long []dis = new long[numOfCity - 1];
        long []fuel = new long[numOfCity];

        for (int i = 0; i < numOfCity-1; i++) {
            dis[i] = sc.nextInt();
        }

        for (int i = 0; i < numOfCity; i++) {
            fuel[i] = sc.nextInt();
        }

        long charger = fuel[0];
        long cost = 0;
        
        for (int i = 0; i < numOfCity-1; i++) {
            if (fuel[i]>fuel[i+1]) {      
                charger = fuel[i+1];
            } 
            cost += charger * dis[i];       
        }

        System.out.println(cost);
        sc.close();
    }
}
