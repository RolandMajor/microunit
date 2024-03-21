package microunit;

import java.lang.reflect.Method;

public abstract class TestRunner {

    protected Class<?> testClass;

    public TestRunner(Class<?> testClass) {
        this.testClass = testClass;
    }

    protected abstract void invokeTestMethod(Method method, Object instance, TestResultAccumulator accumulator)
        throws IllegalAccessException;
}
