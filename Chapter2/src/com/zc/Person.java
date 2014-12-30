package com.zc;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 12/29/14  2:18 PM
 * Created by JustinZhang.
 */
public class Person {

    private final Date birthDate;

    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1,0,0,0);
        BOOM_START = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0,0);
        BOOM_END = gmtCal.getTime();
    }

    public Person(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isBabyBoomer(){
        return birthDate.compareTo(BOOM_START) >= 0 && birthDate.compareTo(BOOM_END)<0;
    }

    public static void main(String[] args) {
        long beforeSum= System.currentTimeMillis();
        long sum = 0L;
        for(long i = 0 ; i < Integer.MAX_VALUE; i++){
            sum += i;
        }
        long afterSum = System.currentTimeMillis();
        System.out.println(afterSum - beforeSum +"");
    }

}
