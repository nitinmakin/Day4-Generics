package com.bridgelabz.generics.service;

import java.nio.file.LinkPermission;

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
       E maxValue =firstVariable;

       if(inputs.length != 0)
       {
           if (firstVariable.compareTo(secondVariable) > 0 && firstVariable.compareTo(thirdVariable) > 0)
               maxValue = firstVariable;
           else if (secondVariable.compareTo(thirdVariable) > 0)
               maxValue = secondVariable;
           else
               maxValue = thirdVariable;
       }
       else
           {
               maxValue = getMaxValue(maxValue , inputs);

           }
       /**
        * calling print method
        */
       printMaxValue(maxValue);

       return maxValue;

   }

   public static <E extends Comparable> E getMaxValue(E maxValue ,E inputs[])
   {
       E max = inputs[0];


      for (int i=0 ; i < inputs.length ; i++)
      {
          if (max.compareTo(inputs[i]) < 0)
              max = inputs[i];
      }
      return max;
   }
    private static <G extends Comparable> void printMaxValue(G maxvalue)
    {
        System.out.println("Maximum value is: " + maxvalue);
    }
}
