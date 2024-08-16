package JenerthJavac.javaTestDemo.utilities;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilTest {
/*
    @Test

    public void Repeat_string_once(){
        Assert.assertEquals(StringUtil.repeat("Hello", 1), "Hello");
    }

    @Test
    public void Repeat_string_many(){
        Assert.assertEquals(StringUtil.repeat("Hello", 3), "HelloHelloHello");
    }

    @Test
    public void Repeat_string_zeroTime(){
        Assert.assertEquals(StringUtil.repeat("Hello", 0), "");
    }
*/

    @Test
    public void string_is_not_empty() {
        assertFalse(StringUtil.isEmpty("helloWorld"));
    }

    @Test
    public void string_is_empty() {
        assertTrue(StringUtil.isEmpty(""));
    }
    @Test
    public void string_space_is_empty_string() {
        assertTrue(StringUtil.isEmpty(" "));
    }

}