package com.bridgelabz.generics.test;
import com.bridgelabz.generics.service.MaximumValue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
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
        public void whenGivenNo_InFirstPosition_thenReturnSameNumber()
        {
                Assert.assertEquals(40,maximumValue.getMaxInt(40,20,10));
        }
        @Test
        public void whenGivenNo_InSecondPosition_thenReturnSameNumber()
        {
                Assert.assertEquals(40,maximumValue.getMaxInt(20,40,10));
        }
        @Test
        public void whenGivenNo_InThirdPosition_thenReturnSameNumber()
        {
                Assert.assertEquals(40,maximumValue.getMaxInt(10,20,40));
        }

        /**
         * checking for float number
         */

        @Test
        public void whenGivenDoubleNo_InFirstPosition_thenReturnSameNumber()
        {
                Assert.assertEquals(12.5f,maximumValue.getMaxFloat(12.5f,4.5f,0.1f), 0.0f);
        }
        @Test
        public void whenGivenDoubleNo_InSecondPosition_thenReturnSameNumber()
        {
                Assert.assertEquals(40.5f,maximumValue.getMaxFloat(20.2f,40.5f,10.2f),0.0f);
        }
        @Test
        public void whenGivenDoubleNo_InThirdPosition_thenReturnSameNumber()
        {
                Assert.assertEquals(40.5f,maximumValue.getMaxFloat(20.2f,10.5f,40.5f),0.0f);
        }


}
