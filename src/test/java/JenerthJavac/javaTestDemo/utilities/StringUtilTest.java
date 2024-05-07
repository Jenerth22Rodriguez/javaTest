package JenerthJavac.javaTestDemo.utilities;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
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

}