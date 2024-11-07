package com.max.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //PRIMITIVE
        int number = 5;
        double decimalNumber = 102.5;
        boolean trueFalse = false;
        char letter = 'A';

        //NON-PRIMITIVE
        String sentance = "This is a test";
        Integer number2  = 5;
        Double double2 = 5.5;
        Boolean boolean1 = false;
        Character character2  =  'E';

        var intReturn =  printMessage("Or is it?\n");
        System.out.println(intReturn);

        if (number2 > 5) {
            number2 = 2;;
        } else {
            System.out.println("Hello world");
        }

        SecondClass secondClass = new SecondClass();
        secondClass.blahblahblah();

        String[] array = new String[]{"Test", "Test2", "Test3"};
        System.out.println(array[0]);

        List<String> list = new ArrayList<>();

        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "value");
        System.out.println(map.get(3));

        for (int i = 0; i < array.length; i++) {
            System.out.println(i);
            System.out.println(array[i]);
        }

        for( String string : array) {
            System.out.println(string);
        }


        CoffeeSize ordred =  CoffeeSize.SMALL;
        System.out.println("Customer  just ordered " + ordred);

        String words = "Banana";

        switch (words) {
            case "banana":
                //
                return;
            case "pear":
                //
                break;
            default:
                System.out.println("default case");
        }
        System.out.printf("hello\n");

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, -1);

        System.out.print(cal.get(Calendar.DAY_OF_MONTH));

    }

    private static int printMessage(String message) {
        System.out.printf("This method worked " + message);
        return 12;
    }

}
