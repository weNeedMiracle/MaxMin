import java.util.LinkedList;import java.util.List;public class Spacer {
    public static void makeSpace(int a){
        int num = a;
        int t = 0;
        int m = 10;
        if (num<0) num=-num;
        while (num>0) {
            int x = num % 10;
            num=num/10;
            if(num>0) {
                if (t < x) {
                    t = x;
                }
                if (m > x) {
                    m = x;
                }
            }
        }
        System.out.println("Наибольшее число: " + t + ", наименьшее число: " + m);
    }
}
