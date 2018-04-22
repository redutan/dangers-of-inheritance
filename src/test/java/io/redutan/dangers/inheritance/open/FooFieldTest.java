package io.redutan.dangers.inheritance.open;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


public class FooFieldTest {
    @Test
    public void fooField() {
        FooField fooField = new FooField();
        fooField.setNum(1);

        assertThat(fooField.getPublicNum(), is(1));
        assertThat(fooField.getProtectedNum(), is(1));
        assertThat(fooField.getPrivateNum(), is(1));

        fooField.publicNum = 2; // public field is evil!!

        assertThat(fooField.getPublicNum(), is(2));
    }

    @Test
    public void fooFieldExtend() {
        FooFieldExtend fooField = new FooFieldExtend();
        fooField.setNum(1);

        assertThat(fooField.getPublicNum(), is(11));
        assertThat(fooField.getProtectedNum(), is(21));
        assertThat(fooField.getPrivateNum(), is(0));

        fooField.publicNum = 2; // public field is evil!!

        assertThat(fooField.getPublicNum(), is(2));
    }
}