package io.redutan.dangers.inheritance.open;

public class FooMethodWithLsp extends FooMethod {
    private int newNum;

    @Override
    public void process() {
        super.process();
        newNum += 2;
    }
}
