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
                Integer expected = 40;
                Assert.assertEquals(expected,MaximumValue.getMax(40,20,10));
        }
        @Test
        public void whenGivenNo_InSecondPosition_thenReturnSameNumber()
        {
                Integer expected = 40;
                Assert.assertSame(expected,MaximumValue.getMax(30,40,10));
        }
        @Test
        public void whenGivenNo_InThirdPosition_thenReturnSameNumber()
        {
                Integer expected = 40;
                Assert.assertEquals(expected,MaximumValue.getMax(20,10,40));
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
                String expected = "watermelon";
                Assert.assertEquals(expected,MaximumValue.getMax("watermelon", "apple",
                        "banana"));
        }
        @Test
        public void whenGivenMaxString_InSecondPosition_thenReturnSameString()
        {
                String expected = "watermelon";
                Assert.assertEquals(expected,MaximumValue.getMax("apple", "watermelon",
                        "banana"));
        }
        @Test
        public void whenGivenMaxString_InThirdPosition_thenReturnSameString()
        {
                String expected = "watermelon";
                Assert.assertEquals(expected,MaximumValue.getMax("apple" , "banana" ,
                        "watermelon"));
        }
        /**
         * for checking more then 3 inputs in Integer
         */
        @Test
        public void whenGivenMoreThen3Inputs_InInteger_ThenReturnAndPrintMaxInteger()
        {
                Integer expected = 55;
                Assert.assertEquals(expected,MaximumValue.getMax(10,20,30,
                        50,55,22,44));
        }

        /**
         * for checking more then 3 inputs in float
         */
        @Test
        public void whenGivenMoreThen3Inputs_InFloat_ThenReturnAndPrintMaxFloat()
        {
                Float expected = 55.5f;
                Assert.assertEquals(expected,MaximumValue.getMax(10.5f,55.5f,20.5f,30.5f,
                        50.3f,22.3f,44.2f));
        }
        /**
         * for checking more then 3 inputs in String
         */
        @Test
        public void whenGivenMoreThen3Inputs_InString_ThenReturnAndPrintMaxString()
        {
                String expected = "watermelon";
                Assert.assertEquals(expected,MaximumValue.getMax("apple","orange","watermelon",
                        "papaya","banana"));
        }

}
