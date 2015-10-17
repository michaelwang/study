package com.test.exercise_3_1;

import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

/**
 *  计算流中所有数之和
 *
 * Created: Thu Oct  8 21:53:41 2015
 *
 * @author wangzhenhua
 * @version 1.0
 */
public class exercise_3_9_1
{

    public Integer add(Stream<Integer> numbers)
    {
       return numbers.reduce( 0, (acc,elem) -> acc + elem );
    }


    public static void main(String[] args)
    {


        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);

        exercise_3_9_1 e = new exercise_3_9_1();
        assert 11 == e.add(list.stream());
        System.out.println( e.add(list.stream()) );
    }



}
