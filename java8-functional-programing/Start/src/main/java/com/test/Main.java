package com.test;

import java.time.*;

/**
 * Created by wangzhenhua on 15/3/26.
 */
public class Main {
     public static void main(String args[]){

         System.out.println("hello intellij idea");

         //Test JDK8 Feature
         Instant instant = Instant.now();
         System.out.println(instant);
         LocalDate localDate = LocalDate.now();
         System.out.println(localDate);

         System.out.printf("Year: %d Month: %d day: %d \t %n", localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());

         LocalDate dateOfBirth = LocalDate.of(1861,1,19);
         System.out.println(dateOfBirth);

         dateOfBirth = LocalDate.of(2010, 01, 14);
         MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
         MonthDay currentMonthDay = MonthDay.from(LocalDate.now());
         if(currentMonthDay.equals(birthday)){
             System.out.println("Many Many happy returns of the day !!");
         }else{
             System.out.println("Sorry, today is not your birthday");
         }

         LocalDate today = LocalDate.now();
         LocalDate previousYear = today.minusYears(1);
         System.out.printf("Today: %s ,previous year : %s \n", today, previousYear);

         ZoneId asiaShanghai = ZoneId.of("Asia/Shanghai");
         LocalDateTime localDateTime = LocalDateTime.now(asiaShanghai);
         System.out.printf("Asia Shanghai date time %s", localDateTime);
     }


}
