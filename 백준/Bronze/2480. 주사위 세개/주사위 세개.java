import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int answer = 0;

        if(a==b&&b==c&&c==a){
           answer = 10000+(a*1000);
        }
        else if(a==b||b==c||c==a){
            if(a==b){
                answer = a*100 + 1000;
            }
            else if(b==c){
                answer = b*100 + 1000;
            }
            else{
                answer = c*100 + 1000;
            }
        }
        else{
            if(a>b&&a>c){
                answer = a*100;
            }
            else if(b>a&&b>c){
                answer = b*100;
            }
            else{
                answer = c*100;
            }
        }
        System.out.println(answer);
    }
}