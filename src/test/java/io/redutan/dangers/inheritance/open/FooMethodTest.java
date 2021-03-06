package io.redutan.dangers.inheritance.open;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FooMethodTest {
    @Test
    public void fooMethodWithLsp() {
        FooMethod fooMethod = new FooMethod();
        FooMethodWithLsp fooMethodWithLsp = new FooMethodWithLsp();

        fooMethod.process();
        fooMethodWithLsp.process();

        assertThat(fooMethod.getNum(), is(fooMethodWithLsp.getNum()));
    }

    @Test(expected = AssertionError.class)
    public void fooMethodWithoutLsp() {
        FooMethod fooMethod = new FooMethod();
        FooMethodWithoutLsp fooMethodWithoutLsp = new FooMethodWithoutLsp();

        fooMethod.process();
        fooMethodWithoutLsp.process();

        assertThat(fooMethod.getNum(), is(fooMethodWithoutLsp.getNum()));
    }
}
