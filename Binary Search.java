import java.util.Arrays;
import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {
        int[] array = {6, 19, 3, 14, 7, 20, 5, 9, 11, 8};

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me number: ");
        int number = scanner.nextInt();

        int index = binarySearch(array, 0, array.length - 1, number);
        if (index == -1) {
            System.out.println("This array hav't this number... sorry");
        } else {
            System.out.println(number + " to be in the index " + index);
        }

    }

    static int binarySearch(int[] array, int leftIndex, int rightIndex, int number) {
        if (rightIndex >= leftIndex) {
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;

            if (number == array[middleIndex]) {
                return middleIndex;
            }
            if (number < array[middleIndex]) {
                return binarySearch(array, leftIndex, middleIndex - 1, number);
            }
            return binarySearch(array, middleIndex + 1, rightIndex, number);
        }
        return -1;
    }
}