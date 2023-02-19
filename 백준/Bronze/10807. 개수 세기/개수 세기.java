import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        int answer = 0;


        for(int i=0; i<num; i++) {
            arr[i] = scanner.nextInt();
        }
            int v = scanner.nextInt();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == v) {
                    answer++;
                }
            }
        
        System.out.println(answer);


    }
}