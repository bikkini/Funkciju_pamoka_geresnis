public class Main {
    public static void main(String[] args) {
        System.out.println("===pirma==");
        kvieciu(40, 16);
        kvieciu(40, 18);

        System.out.println("===antra uzduotis===");

        System.out.println(PISq());
        System.out.println("==trecia3===");
        System.out.println(priima(7, 5));
        System.out.println("=====ketvirta4====");
        int[] nums = {5, 8, 3};
        int[] nums2 = {5, 5, 7, 5};
        kintamieji(nums);

        System.out.println("=====ketvirta4====");


        kintamieji(nums2);
        System.out.println("=====penkta5====");
        System.out.println(printRndNumInt(2, 3));


        System.out.println("====sesta6====");
        int[] crazy = rndIntArr(1, 10, 8);
        for (int i = 0; i < crazy.length; i++) {
            System.out.println(crazy[i]);
        }

        System.out.println("====septinta7=====");
        int result = sumArr(crazy);
        System.out.println(result);

        System.out.println("====8uzduotis");
        System.out.println(avgArr(crazy));

        System.out.println("===9uzduotis====");
        printRectangle(50, 3);
    }


    public static void kvieciu(int a, int b) {
        int suma = a + b;
        System.out.println("suma " + suma);
    }

    public static double PISq() {
        return 9.8596;
    }

    public static int priima(int a, int b) {
        return (int) a * b;
    }

    public static void kintamieji(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static int printRndNumInt(int min, int max) {
        return (min + (int) Math.round(Math.random() * (max - min)));
    }

    public static int[] rndIntArr(int min, int max, int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = printRndNumInt(min, max);
        }
        return arr;

    }

    public static int sumArr(int[] masyvasX) {
        int sum = 0;//4,18,24
        for (int i = 0; i < masyvasX.length; i++) {//4,14,6
            sum = sum + masyvasX[i];
        }
        return sum;
    }

    public static double avgArrBeter(int[] arr) {
        return (double) sumArr(arr) / arr.length;
    }

    public static double avgArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return (double) sum / arr.length;
    }

    public static void printRectangle(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }


}
