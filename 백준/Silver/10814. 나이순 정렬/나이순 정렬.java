
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][]arr = new String[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.next();  //age
            arr[i][1] = sc.next();  //name
        }

        //age를 기준으로 정렬

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }

        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }






    }

}
