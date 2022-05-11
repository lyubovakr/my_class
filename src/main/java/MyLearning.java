import java.util.Scanner;
public class MyLearning {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()){
            int t = scn.nextInt();
            System.out.println(t);
        }
        else {
            System.out.println("no");

        }
    }

}
