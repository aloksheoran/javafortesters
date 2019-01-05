package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Assert;
import org.junit.Test;

public class IntegerExamplesTest {

    @Test
   public void integerExploration () {

        Integer four = new Integer(4);
        Assert.assertEquals("int value returns int 4",4,four.intValue());

    }



}
