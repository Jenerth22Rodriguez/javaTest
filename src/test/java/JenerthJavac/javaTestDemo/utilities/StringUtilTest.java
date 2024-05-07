package JenerthJavac.javaTestDemo.utilities;
public class StringUtilTest {
    public static void main(String[] args) {

      String result =  StringUtil.repeat("Hello", 3);

      assertEquals(StringUtil.repeat("Hello", 3), "HelloHelloHello");

      assertEquals(result, "Hello");
    }

    private static void assertEquals(String result, String helloHelloHello) {

        if(!result.equals("HelloHelloHello")) {
            throw new RuntimeException("Error encounter");
        }
    }
}