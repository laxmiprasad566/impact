//wac code to find max key in an array
public class MaxIndexInArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 2, 30};

        int max = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println("Maximum value: " + max + ", at index: " + index);
    }
}
