package com.bridgelabz.generics.service;

public class MaximumValue
{
   public  <E extends Comparable >E getMax(E arr1[])
   {
       E max = arr1[0];
       for (int i =0 ; i< arr1.length ; i++)
       {
           if( max.compareTo(arr1[i]) < 0)
               max = arr1[i];
       }
       return max;
   }

}
