package dev.scorpio;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*System.out.println( "Hello World!" );
        List<Object> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        printList(list);*/
        Month month = Month.APRIL;
        var result = switch(month)
        {
            case JANUARY, JUNE, JULY ->3;
            case FEBRUARY, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER -> 1;
            case MARCH, MAY, APRIL, AUGUST -> 2;
            default -> 10;
        };
        System.out.println(result);
        int i = swtichReturn();
        System.out.println(i);

    }

    public static void printList(List<Object> list)
    {
        list.stream().forEach(s-> System.out.println(s));
    }

    public static int swtichReturn()
    {
        Month month = Month.OCTOBER;
        switch(month)
        {
            case JANUARY, JUNE, JULY ->{ return 3;}
            case FEBRUARY, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER -> {return 1;}
            case MARCH, MAY, APRIL, AUGUST -> {return 2;}
            default -> {return 10;}
        }
    }
}
