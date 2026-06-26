package Day_4;

public class SelectionSort {

    public static void main(String[] args) {

        int a[] = {2, 44, 3, 44, 56, 63, 23};

        for (int i = 0; i < a.length - 1; i++) {

            int s = i;

            for (int j = i + 1; j < a.length; j++) {

                if (a[j] < a[s]) {
                    s = j;
                }
            }

            int temp = a[i];
            a[i] = a[s];
            a[s] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}