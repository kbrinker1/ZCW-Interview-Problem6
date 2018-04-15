package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;



public class Problem6Test {


    @Test
    public void testOneThirtyPM(){
        //given
        String timeToConvert = "1:30pm";

        //when
        String actual = "Thirteen Hundred and Thirty Hours";
        String expected = Problem6.writeInMilitaryTime(timeToConvert);
        //then
        Assert.assertEquals(actual, expected);
    }



    @Test
    public void testOneThirtyAM(){
        //given
        String timeToConvert = "1:30am";

        //when
        String actual = "Zero One Hundred and Thirty Hours";
        String expected = Problem6.writeInMilitaryTime(timeToConvert);
        //then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testTwoTwentyTwoPM(){
        //given
        String timeToConvert = "2:22pm";

        //when
        String actual = "Fourteen Hundred and Twenty Two Hours";
        String expected = Problem6.writeInMilitaryTime(timeToConvert);
        //then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testTwoElevenAM(){
        //given
        String timeToConvert = "2:11am";

        //when
        String actual = "Zero Two Hundred and Eleven Hours";
        String expected = Problem6.writeInMilitaryTime(timeToConvert);
        //then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testTenZeroTwoAM(){
        //given
        String timeToConvert = "10:02am";

        //when
        String actual = "Ten Hundred Zero Two Hours";
        String expected = Problem6.writeInMilitaryTime(timeToConvert);
        //then
        Assert.assertEquals(actual, expected);
    }
}
