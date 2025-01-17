package microunit;

public class Assert {

    public static void fail(String message) {
        if (message == null) {
            throw new AssertionError();
        }
        throw new AssertionError(message);
    }

    public static void fail() {
        fail(null);
    }

    public static void assertTrue(boolean condition, String message) {
        if (! condition) {
            fail(message);
        }
    }

    public static void assertTrue(boolean condition) {
        assertTrue(condition, null);
    }

}
