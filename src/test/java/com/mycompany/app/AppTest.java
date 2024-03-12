package com.mycompany.app;

import static org.junit.Assert.*;

import java.util.ArrayList;
//import java.util.Arrays;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testNullArrayList(){
        int shift_value=8;
        int[] arr ={3,4,1,2};
        String sender ="sqdaf";
        assertThrows(IllegalArgumentException.class,  () -> {App.MyFunc(null,arr,shift_value ,sender ); }); //parametre doldur
    }

    public void testNullArray(){
        int shift_value=8;
        ArrayList<Integer[]> list = new ArrayList<>();
        Integer[] first = {1 ,11};
        Integer[] second = {23,6,21,10,17,8,12,23,22};
        Integer[] third = {12,26,1,11};
        Integer[] fourth = {11,23,6,12,23,6,21,23};
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        String sender="sqdaf";
        assertThrows(IllegalArgumentException.class,  () -> {App.MyFunc(list ,null ,shift_value ,sender ); }); //parametre doldur
    }

    public void testNullString(){
        int shift_value=8;
        int[] arr = {3,4,1,2};
        ArrayList<Integer[]> list = new ArrayList<>();
        Integer[] first = {1 ,11};
        Integer[] second = {23,6,21,10,17,8,12,23,22};
        Integer[] third = {12,26,1,11};
        Integer[] fourth = {11,23,6,12,23,6,21,23};
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        assertThrows(IllegalArgumentException.class,  () -> {App.MyFunc(list, arr ,shift_value , null ); }); //parametre doldur
    }

    public void testValidIntValue(){
        int shift_value=-10;
        int[] arr = {3,4,1,2};
        ArrayList<Integer[]> list = new ArrayList<>();
        Integer[] first = {1 ,11};
        Integer[] second = {23,6,21,10,17,8,12,23,22};
        Integer[] third = {12,26,1,11};
        Integer[] fourth = {11,23,6,12,23,6,21,23};
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        String sender="sqdaf";
        assertThrows(IllegalArgumentException.class,  () -> {App.MyFunc(list, arr, shift_value, sender ); }); //parametre doldur
    }

    public void testIsArrayandArrayListSizeSame(){
        int shift_value=8;
        int[] arr = {3,4,1,2,7};
        ArrayList<Integer[]> list = new ArrayList<>();
        Integer[] first = {1 ,11};
        Integer[] second = {23,6,21,10,17,8,12,23,22};
        Integer[] third = {12,26,1,11};
        Integer[] fourth = {11,23,6,12,23,6,21,23};
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        String sender="sqdaf";
        assertThrows(IllegalArgumentException.class,  () -> {App.MyFunc(list, arr, shift_value, sender ); }); //parametre doldur
    }

    public void A(){
        int shift_value=8;
        int[] arr = {3,4,1,2};
        ArrayList<Integer[]> list = new ArrayList<>();
        Integer[] first = {1 ,11};
        Integer[] second = {23,6,21,10,17,8,12,23,22};
        Integer[] third = {12,26,1,11};
        Integer[] fourth = {11,23,6,12,23,6,21,23};
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        String sender="sqdaf";
        assertEquals("this sentence is encrypted -aylin", App.MyFunc(list, arr, shift_value, sender));
    }
}
