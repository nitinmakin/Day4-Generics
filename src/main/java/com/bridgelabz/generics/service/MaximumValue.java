package com.bridgelabz.generics.service;

public class MaximumValue
{
    public int getMaxInt(Integer a, Integer b, Integer c)
    {
        if(a.compareTo(b) > 0  && b.compareTo(c) > 0)
            return a;
        else if(b.compareTo(c) > 0)
            return b;
        else
            return c;
    }

    public float getMaxFloat(Float a, Float b, Float c)
    {
        if(a.compareTo(b) > 0 && b.compareTo(c) > 0)
            return a;
        else if (b.compareTo(c) > 0)
            return b;
        else
            return c;
    }
}
