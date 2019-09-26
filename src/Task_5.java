import java.util.Arrays;

public class Task_5 {

    public static void main(String[] args) {
        System.out.println(min(10, 5, 7, 8));

    }

        public static int min ( int a, int b, int c, int d){
            if (min(a,b)>c && d>c){
                return c;
            }
            if (min(a,b)>d && c<d){
                return d;
            } else {
                return min(a,b);
            }
        }

        public static int min ( int a, int b) {
            if (a < b) {
                return a;
            } else {
                return b;
            }
    }
}

