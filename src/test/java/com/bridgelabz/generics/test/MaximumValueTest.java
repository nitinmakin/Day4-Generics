package com.bridgelabz.generics.test;
import com.bridgelabz.generics.service.MaximumValue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.StrictMath.E;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MaximumValueTest {
        MaximumValue maximumValue = null;

        @Before
        public void createObject()
        {
            maximumValue = new MaximumValue();
        }

        /**
         * for checking integer
         */

        @Test
        public void whenGivenNoInArray_InFirstPosition_thenReturnSameNumber()
        {
                Integer arr[] = {40,20,10};
                Assert.assertSame(40,maximumValue.getMax(arr));
        }
        @Test
        public void whenGivenNoInArray_InSecondPosition_thenReturnSameNumber()
        {
                Integer arr[] = {20,40,10};
                Assert.assertSame(40,maximumValue.getMax(arr));
        }
        @Test
        public void whenGivenNoInArray_InThirdPosition_thenReturnSameNumber()
        {
                Integer arr[] = {10,20,40};
                Assert.assertSame(40,maximumValue.getMax(arr));
        }

        /**
         * checking for float number
         */

        @Test
        public void whenGivenFloatNoInArray_InFirstPosition_thenReturnSameNumber()
        {
                Float arr[] = {12.5f,4.5f,0.1f};
                Assert.assertEquals(12.5f,maximumValue.getMax(arr),0.0);
        }
        @Test
        public void whenGivenFloatNoInArray_InSecondPosition_thenReturnSameNumber()
        {
                Float arr[] = {4.5f,12.5f,0.1f};
                Assert.assertEquals(12.5f,maximumValue.getMax(arr),0.0);
        }
        @Test
        public void whenGivenFloatNoInArray_InThirdPosition_thenReturnSameNumber()
        {

                Float arr[] = {0.5f,4.5f,12.5f};
                System.out.println(maximumValue.getMax(arr));
              Assert.assertEquals(12.5,maximumValue.getMax(arr),0.0);
        }

        /**
         * for checking max string
         */

        @Test
        public void whenGivenMaxStringInArray_InFirstPosition_thenReturnSameString()
        {
                String arr[] = {"watermelon" , "apple"  , "banana"};
                Assert.assertEquals("watermelon",maximumValue.getMax(arr));
        }
        @Test
        public void whenGivenMaxStringInArray_InSecondPosition_thenReturnSameString()
        {
                String arr[] = { "apple"  , "watermelon" , "banana"};
                Assert.assertEquals("watermelon",maximumValue.getMax(arr));
        }
        @Test
        public void whenGivenMaxString_InThirdPosition_thenReturnSameString()
        {
                String arr[] = { "apple"  , "banana" , "watermelon"};
                Assert.assertEquals("watermelon",maximumValue.getMax(arr));
        }


}
