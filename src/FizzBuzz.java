import java.util.Scanner;

public class FizzBuzz {
    public static int i = 1;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nilai = input.nextInt();

        fizzBuzzRecursive(nilai);
    }

    static void fizzBuzz(int total){
        for (int i = 1; i <=total ; i++) {
            if (i % 3 == 0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0) {
                System.out.println("fizz");
            }else if (i % 5 == 0){
                System.out.println("buzz");
            }else {
                System.out.println(i);
            }
        }
    }

    static void fizzBuzzRecursive(int total){
        if (total == 0) {
            return;
        }else {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
        i++;
        fizzBuzzRecursive(total - 1);
    }
}
