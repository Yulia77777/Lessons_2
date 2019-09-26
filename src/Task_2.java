import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        int a = 0;
        while (a<101) {
            if (a==3){
               a++;
               continue;
            }
            System.out.println(a);
            a++;
        }
    }
}
