package AdvancedConcepts;

import java.util.Date;

public class DateClass {
    
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d); //^ returns current date and time
        System.out.println(d.getTime()); //^ returns time in milliseconds since 1 Jan 1970

        Date d1 = new Date(2024,3,26);
        Date d2 = new Date(2024,3,27);
        System.out.println(d1.after(d2)); //^ returns true if d1 is after d2
        System.out.println(d1.before(d2)); //^ returns true if d1 is before d2
        System.out.println(d1.equals(d2)); //^ returns true if d1 and d2 are equal
        System.out.println(d1.compareTo(d2)); //^ returns -1 if d1 is before d2, 1 if d1 is after d2, 0 if equal
    }
}