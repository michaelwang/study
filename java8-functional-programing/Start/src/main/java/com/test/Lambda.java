package com.test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wangzhenhua on 15/4/3.
 */
public class Lambda
{
    public static void main(String args[]) {


        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer", "Roger Federer",
                "Andy Murray", "Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players = Arrays.asList(atp);

        players.forEach((player) -> System.out.print(player + "; "));
       // players.forEach((player) -> System.out::println);
    }
}
