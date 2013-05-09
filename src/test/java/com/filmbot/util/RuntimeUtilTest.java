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
public class RuntimeUtilTest {

    @Test
    public void testInvalidInput() {

        Assert.assertEquals(false, RuntimeUtil.isValidRuntime("10_10am"));
        Assert.assertEquals(false, RuntimeUtil.isValidRuntime("AdamIsNotARunTime"));
        Assert.assertEquals(false, RuntimeUtil.isValidRuntime("10:56:00am"));
        Assert.assertEquals(false, RuntimeUtil.isValidRuntime("10:56:00pm"));
        Assert.assertEquals(false, RuntimeUtil.isValidRuntime("1:56:00pm"));
        Assert.assertEquals(false, RuntimeUtil.isValidRuntime("13:56xm"));
        Assert.assertEquals(false, RuntimeUtil.isValidRuntime("23:00am")); //still valid but prob wrong

    }

    @Test
    public void testTimeNoAMPM() {
        Assert.assertEquals(false, RuntimeUtil.isValidRuntime("10:56:00"));
        Assert.assertEquals(true, RuntimeUtil.isValidRuntime("10:56"));
    }

    @Test
    public void testTimeWithSurroundingWhitespace() {
        Assert.assertEquals(true, RuntimeUtil.isValidRuntime("   \n\n\n\t\t\t10:56"));
        Assert.assertEquals(true, RuntimeUtil.isValidRuntime("   \n\n\n\t\t\t10:56\t\t\r\n\n"));
        Assert.assertEquals(true, RuntimeUtil.isValidRuntime("10:56\t\t\r\n\n"));
    }

    @Test
    public void testGobblyGook() {
        Assert.assertEquals(false, RuntimeUtil.isValidRuntime("asfasfaf23098asfdoijasfda"));
        Assert.assertEquals(false, RuntimeUtil.isValidRuntime("asfa12123waf21efasvs"));
        Assert.assertEquals(false, RuntimeUtil.isValidRuntime("2e13212312312312312asdfasfd"));
        Assert.assertEquals(false, RuntimeUtil.isValidRuntime("gobblydygook"));
    }

}
