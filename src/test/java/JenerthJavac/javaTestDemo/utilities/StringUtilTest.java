package JenerthJavac.javaTestDemo.utilities;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
        @Test
        public void testRepeat(){

      Assert.assertEquals(StringUtil.repeat("Hello", 3), "HelloHelloHello");
      Assert.assertEquals(StringUtil.repeat("Hello", 1), "Hello");
    }
}