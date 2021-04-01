package lesson_1.lesson4;

public class Main {

    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOT_TO_WIN = 3;

    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_Y = 'Y';


    public static void main(String[] args) {
        initMap();
        printMap();
    }
    
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = DOT_EMPTY;

            }
            
        }
    }

    public static void printMap() {
        for (int i = 0; i < map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map [i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
