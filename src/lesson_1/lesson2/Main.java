package lesson_1.lesson2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        fillDiagonal(5);

    }

//example 1
    static void changeArray() {

        int[] arr1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }

        }
    }

//example 2
    static int[] emptyArray(){
        int[] array = new int[8];
        for (int i = 0, j = 0; i < array.length; i++, j+=3)
            array[i] = j;
        return array;

    }

//example 3
    static int[] multiArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
        return array;
    }

//example 4
static void fillDiagonal(int size) {
    int[][] matrix = new int[size][size];
    for (int i = 0; i < size; i++) {
        matrix[i][i] = 1;
        matrix[i][size - i - 1] = 1;
    }
    System.out.println(Arrays.deepToString(matrix));
    for (int i = 0; i < size; i++)
        System.out.println(Arrays.toString(matrix[i]));
}




//        int[] array = {1, 2, 3, 4, 5};
//      array[]


//        for(int i = 0; i < array.length; i++) {
//            array[i] += 10;
//            System.out.println(array[i]);
//        }
//
//        int[][] matrix = { {1, 2, 3}, {1, 2}, {1} };
//
//        for (int i = 0; i < matrix.length; i++) {
//            int[] innerArray = matrix [i];
//
//            if (innerArray.length < 5) {
//                continue;
//            }
//
//            for (int j = 0; j < innerArray.length; j++) {
////                System.out.println(innerArray[i][j]);
//                System.out.println(innerArray[j]);
//            }
//
//            System.out.println();
//
//        }

//        while (true) {
//            System.out.println("");
//        }



//        int x1 = 1;
//        int x2 = 12;
//        int x3 = 13;
//        int x4 = 14;
//        int x5 = 15;
//        int x6 = 16;
//        int x7 = 17;
//        int x8 = 18;
//        int x9 = 19;
//        int x10 = 10;
//
//        int[] coordinates = new int[10];
//        coordinates[0] = 1;
//        coordinates[1] = 113;
//
//        int[] arr1 = new int[] {1,2,3,4,5};
//        int[] arr2 = {1, 2, 3, 4, 5};
//        System.out.println(coordinates.length);
//        System.out.println(coordinates[9]);
//
//        foo(coordinates);
//
//
//        int[][] matrix = new int[5][5];
//
//        int[][] matrix1 = new int[3][];
//        matrix1[0] = new int[3];
//        matrix1[1] = new int[4];
//        matrix1[2] = new int[10];
//
//        matrix1[0][2] = 1;
//
//        int[][] m2 = { { 1, 2, 3 }, { 1 }, { 5,3 } };
//
//    }
//
//    private static void foo(int[] array){
//
//    }
//
//    }

//    public String getWordByLetter(char symbol) {
//        if (symbol == 'A') {
//            return "Animal";
//
//        } else if (symbol == 'B') {
//            return "Bob";
//
//        } else if (symbol == 'X' || symbol == 'Y' symbol == "Z") {
//            return "XYZ"
//        }

//        String resultWord;
//        switch (symbol) {
//
//            case 'A':
//                resultWord = "Animal";
//                break;
//
//            case 'B':
//                resultWord = "Bob";
//                break;
//
//            case 'C':
//                resultWord = "Cat";
//                break;
//
//            case 'X':
//            case 'Y':
//            case 'Z':
//                resultWord = "XYZ";
//                break;
//
//            default:
//                resultWord = "Not found!";
//
//
//        }
//        return resultWord;
//
//    }


}
