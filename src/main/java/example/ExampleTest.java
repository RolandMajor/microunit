package example;

import microunit.Assert;
import microunit.Test;

public class ExampleTest {

    @Test
    public void a() {
        Assert.assertTrue(1 + 1 == 2, "This should always be true.");
    }

    @Test
    public void b() {
        Assert.assertTrue(1 + 1 == 0, "This should always fail.");
    }

    @Test
    public void c() {
        Integer.parseInt("Hello world!");
    }

    public void d() {
        System.out.println("This is not a test!");
    }


}
