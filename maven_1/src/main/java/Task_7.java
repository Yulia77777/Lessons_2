public class Task_7 {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(10,7));

    }
    public static int getGreatestCommonDivisor (int name1, int name2 ){
        int divisor = (name1 + name2) / 2;
        if(name1 < 10 || name2 < 10){
        return -1;} else {
            return divisor;
        }
    }
}
