import java.util.Random;
public class R_3_1 {
    // (a ∗ cur + b) % n;
    // a = 12, b = 5, and n = 100, and 92 as the seed for cu
    //(12 * 92 + 5)%100




    public static void main(String[] args) {
            int a = 12;
            int b = 5;
            int n = 100;
            int cur = 92;

            Random random = new Random(cur);

            for (int i = 0; i < 5; i++) {
                int t = (a * cur + b) % n;
                System.out.println(t);
                cur = t;
            }
        }
}

//Out Put
//29
//49
//33
//49
//33


