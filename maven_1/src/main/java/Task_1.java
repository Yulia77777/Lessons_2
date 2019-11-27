public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Cycle #1");
        for (int i = 10; i < 21; i++) {
            System.out.println(i);
        }

        System.out.println("Cycle #2");
        int a = 10;
        while (a < 21) {
            System.out.println(a);
            a++;
        }

        System.out.println("Cycle #3");
        int b = 10;
        do {
            System.out.println(b);
            b++;
        } while (b < 21);

        System.out.println("Cycle #4");
        int[] um = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int w : um) {
            System.out.println(w);
        }
    }
}
