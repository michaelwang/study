package com.test.exercise_3_9;

import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Optional;



/**
 * 找出字符数组中包含小写字符最多的数组
 *
 *
 * Created: Tue Sep 29 22:40:34 2015
 *
 * @author wangzhenhua
 * @version 1.0
 */
public class exercise_3_9_6
{

    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("ABCDEfghigklmn");
        list.add("aBCDEfghigklmn");
        list.add("AbCDEfghigklmn");
        list.add("ABcDEfghigklmn");
        list.add("abcDEfghigklmn");

        Optional<String> item = list.stream()
                          .max( Comparator.comparing( t -> t.chars().filter( c -> Character.isLowerCase(c) ).count() ) );

        System.out.println( item.get() );

    }


}
