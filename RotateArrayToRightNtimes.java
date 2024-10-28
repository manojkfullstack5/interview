
public class RotateArrayToRightNtimes {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int ntimes = 2;
        System.out.println("Original Array:");
        printArray(array);
        shiftRight(array, ntimes);
        System.out.println("Array after shifting::");
        printArray(array);
    }

    public static void shiftRight(int[] array, int ntimes) {
        int length = array.length;
        ntimes = ntimes % length;
        if (ntimes == 0) return;
        reverse(array, 0, length - 1);
        reverse(array, 0, ntimes - 1);
        reverse(array, ntimes, length - 1);
    }

    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
