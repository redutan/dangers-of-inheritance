package io.redutan.dangers.inheritance.open;

public class FooMethodWithLsp extends FooMethod {
    private int newNum;

    @Override
    protected void processProtected() {
        super.processProtected();
        newNum += 1;
    }

    @Override
    public void process() {
        super.process();
        newNum += 2;
    }
}
