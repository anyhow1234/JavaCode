package com.javacode;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Description:
 * @Author hans
 * @Date 2019/2/21 19:32
 * @Version 1.0
 */
public class CalendarTest {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();

        c.setTime(new Date());
        c.add(Calendar.DATE,4);
        int todayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(sdf.format(c.getTime()));
        System.out.println(todayOfWeek);
    }

}
