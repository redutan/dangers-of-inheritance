package io.redutan.dangers.inheritance.open;

public class FooMethod {
    protected int num;

    protected void processProtected() {
        num += 1;
    }

    public void process() {
        num += 2;
    }
}
