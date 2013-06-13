package com.filmbot.util;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: adamparrish
 * Date: 5/6/13
 * Time: 6:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class TimeUtilTest {

    @Test
    public void testInvalidInput() {

        Assert.assertEquals(false, TimeUtil.isValidTimeString("10_10am"));
        Assert.assertEquals(false, TimeUtil.isValidTimeString("AdamIsNotARunTime"));
        Assert.assertEquals(false, TimeUtil.isValidTimeString("10:56:00am"));
        Assert.assertEquals(false, TimeUtil.isValidTimeString("10:56:00pm"));
        Assert.assertEquals(false, TimeUtil.isValidTimeString("1:56:00pm"));
        Assert.assertEquals(false, TimeUtil.isValidTimeString("13:56xm"));
        Assert.assertEquals(false, TimeUtil.isValidTimeString("23:00am")); //still valid but prob wrong

    }

    @Test
    public void testTimeNoAMPM() {
        Assert.assertEquals(false, TimeUtil.isValidTimeString("10:56:00"));
        Assert.assertEquals(true, TimeUtil.isValidTimeString("10:56"));
    }

    @Test
    public void testTimeWithSurroundingWhitespace() {
        Assert.assertEquals(true, TimeUtil.isValidTimeString("   \n\n\n\t\t\t10:56"));
        Assert.assertEquals(true, TimeUtil.isValidTimeString("   \n\n\n\t\t\t10:56\t\t\r\n\n"));
        Assert.assertEquals(true, TimeUtil.isValidTimeString("10:56\t\t\r\n\n"));
    }

    @Test
    public void testGobblyGook() {
        Assert.assertEquals(false, TimeUtil.isValidTimeString("asfasfaf23098asfdoijasfda"));
        Assert.assertEquals(false, TimeUtil.isValidTimeString("asfa12123waf21efasvs"));
        Assert.assertEquals(false, TimeUtil.isValidTimeString("2e13212312312312312asdfasfd"));
        Assert.assertEquals(false, TimeUtil.isValidTimeString("gobblydygook"));
    }

}
