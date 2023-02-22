import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        boolean bI;
        int num = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt()%42;
        }

        for(int i=0; i<arr.length; i++){
            bI=false;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    bI=true;
                    break;
                }
            }
            if(bI==false){
                num++;
            }
        }
        System.out.println(num);

    }
}

