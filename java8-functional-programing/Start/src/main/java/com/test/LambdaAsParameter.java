package com.test;

import java.util.function.Predicate;

/**
 * Created by wangzhenhua on 15/9/28.
 */
public class LambdaAsParameter
{
    public void overloadMehtod(Predicate predicate)
    {
        System.out.println("in predicate");
    }

    public static void main(String[] args)
    {
        LambdaAsParameter lambdaAsParamter = new LambdaAsParameter();
        lambdaAsParamter.overloadMehtod((x) -> true);
    }
}
