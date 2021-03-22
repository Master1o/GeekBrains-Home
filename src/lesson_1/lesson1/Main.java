package lesson_1.lesson1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        byte b = 3;
        short s = 5;
//       int x = 3;
        long l = 2147483648L;

        float f = 24.5f;
        double d = 23.5;

        char c = 'A';

        // camelCase
        boolean boolT = true;
        boolean boolF = false;

        int x = 10;
        int y = 10;

//example 3
        float a1 = 5;
        float b1 = 10;
        float c1 = 15;
        float d1 = 20;
        calcValue(a1, b1, c1, d1);

//example 4

        int a3 = 10;
        int b3 = 25;
        camelCase(a3, b3);

//example 5
        int value = 0;
        checkNumber(value);

//example 6
        int value1 = 10;
        checkNumberBooll(value1);
//example 7
        String name1 = "Vitaly";
        name(name1);
//example 8
        leapYear (2000);

    }
//example 3
    public static float calcValue(float a, float b, float c, float d){
        float sum = a * (b + (c / d));
        System.out.println(sum);
        return sum;
    }
//example 4
    public static boolean camelCase(int a3, int b3){
       int sum = a3 + b3;
       if ((10 < sum) & (sum < 20)){
           System.out.println("Истинна");
       return true;

        } else{
           System.out.println("Ложь");
           return false;
       }

    }
//example 5
    public static void checkNumber(int value){
        if (value >= 0){
            System.out.println("Положительное");
        } else{
            System.out.println("Отрицательное");
        }


    }
//example 6
    public static boolean checkNumberBooll(int value1){
        if (value1 > 0){
            System.out.println("Отрицательное");
            return false;
        } else{
            System.out.println("Положительное");
            return true;
        }

    }
//example 7
    public static void name(String name){
        System.out.println("Привет " + name);
    }
//example 8
    public static void leapYear(int number){
        if ((number % 4 == 0) || (number % 100 == 0) || (number % 400 == 0)) {
            System.out.println("Остаток 0");
        } else{
            System.out.println("Остаток 1");
        }
    }

}


