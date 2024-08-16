package JenerthJavac.javaTestDemo.utilities;

import junit.framework.TestCase;
import org.junit.Test;
import static JenerthJavac.javaTestDemo.utilities.PasswordUtil.SecurityLevel.*;

//import static JenerthJavac.javaTestDemo.utilities.PasswordUtil.SecurityLevel.WEAK;
//import static JenerthJavac.javaTestDemo.utilities.PasswordUtil.SecurityLevel.MEDIUM;
//import static JenerthJavac.javaTestDemo.utilities.PasswordUtil.SecurityLevel.STRONG;

import static org.junit.Assert.assertEquals;

public class PasswordUtilTest {
    @Test
    public void weak_when_has_less_than_8_letters(){
    assertEquals(WEAK, PasswordUtil.assessPassword("123!@#"));

    }
    @Test
    public void weak_when_has_only_letters(){
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdesdfjbkjsdkjksd"));
    }
    @Test
    public void medium_when_has_letters_and_numbers(){
        assertEquals(MEDIUM, PasswordUtil.assessPassword("a1we2rewr3"));
    }
    @Test
    public void strong_when_has_letters_and_numbers_and_symbols(){
        assertEquals(STRONG, PasswordUtil.assessPassword("a1we2rewr3!#@"));
    }

}