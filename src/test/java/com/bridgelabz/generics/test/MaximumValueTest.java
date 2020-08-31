package com.bridgelabz.generics.test;
import com.bridgelabz.generics.service.MaximumValue;
import org.junit.Assert;
import org.junit.Test;

import static java.lang.StrictMath.E;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MaximumValueTest {

        /**
         * for checking integer
         */

        @Test
        public void whenGivenNo_InFirstPosition_thenReturnSameNumber()
        {

                Assert.assertSame(40,MaximumValue.getMax(40,20,10));
        }
        @Test
        public void whenGivenNo_InSecondPosition_thenReturnSameNumber()
        {
                Assert.assertSame(40,MaximumValue.getMax(30,40,10));
        }
        @Test
        public void whenGivenNo_InThirdPosition_thenReturnSameNumber()
        {
                Assert.assertSame(40,MaximumValue.getMax(20,10,40));
        }

        /**
         * checking for float number
         */

        @Test
        public void whenGivenFloatNo_InFirstPosition_thenReturnSameNumber()
        {
                Float expectedFirst=12.5f;
                Assert.assertEquals(expectedFirst,MaximumValue.getMax(12.5f,2.4f,3.8f));

        }
        @Test
        public void whenGivenFloatNo_InSecondPosition_thenReturnSameNumber()
        {
                Float expectedSecond=12.5f;
                Assert.assertEquals(expectedSecond, MaximumValue.getMax(1.2f , 12.5f , 2.7f));
        }
        @Test
        public void whenGivenFloatNo_InThirdPosition_thenReturnSameNumber()
        {
                Float expectedThird=12.5f;
                Assert.assertEquals(expectedThird, MaximumValue.getMax(1.2f , 2.5f , 12.5f));

        }

        /**
         * for checking max string
         */

        @Test
        public void whenGivenMaxString_InFirstPosition_thenReturnSameString()
        {

                Assert.assertEquals("watermelon",MaximumValue.getMax("watermelon",
                        "apple", "banana"));
        }
        @Test
        public void whenGivenMaxString_InSecondPosition_thenReturnSameString()
        {
                Assert.assertEquals("watermelon",MaximumValue.getMax("apple",
                        "watermelon", "banana"));
        }
        @Test
        public void whenGivenMaxString_InThirdPosition_thenReturnSameString()
        {
                Assert.assertEquals("watermelon",MaximumValue.getMax("apple" ,
                        "banana" , "watermelon"));
        }

}
