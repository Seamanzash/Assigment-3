import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ScoreBoard sb=new ScoreBoard(5);
        Scanner in= new Scanner(System.in);
        int choice;
        while (true){
            System.out.println("1 add \t 2 remove \t 3 view");
            choice=in.nextInt();
            switch (choice){
                case  1:
                    System.out.println("add name ");
            }
        }
    }
}
