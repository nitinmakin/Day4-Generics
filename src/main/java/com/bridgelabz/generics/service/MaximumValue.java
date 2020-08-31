package com.bridgelabz.generics.service;

public class MaximumValue <E extends Comparable >
{
    E firstVariable;
    E secondVariable;
    E thirdVariable;

    public MaximumValue(E firstVariable, E secondVariable, E thirdVariable)
    {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
        this.thirdVariable = thirdVariable;
    }

    public static <E extends Comparable > E getMax(E firstVariable , E secondVariable , E thirdVariable, E... inputs)
   {
       if (firstVariable.compareTo(secondVariable) > 0 && firstVariable.compareTo(thirdVariable) > 0)
           return  firstVariable;
       else if(secondVariable.compareTo(thirdVariable) > 0)
           return secondVariable;
       else
           return thirdVariable;
   }



}
