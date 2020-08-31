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
}
