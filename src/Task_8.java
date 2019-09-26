public class Task_8 {
    public static void main(String[] args) {
        for  (int i=0;i<=16;i=i+4) {
            for (int j=0;j<i;j++) {
                if(j>3){
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
