package com.example.odayk.mensaapp;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OpenMensaUnitTest {

    public boolean test(){
        return false;
    }

    @Test
    public void test_junit(){
        System.out.print("Ich mach nen Test hier!");
        assertThat(test(),is(false));
    }

}
