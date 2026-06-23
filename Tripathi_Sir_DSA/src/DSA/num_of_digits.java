package DSA;

public class num_of_digits {

    public static void main(String[] args) {

        int a = 200;
        int c = 0;

        while (a != 0) {
            a = a / 10;
            c++;
        }

        System.out.println(c);
    }
}