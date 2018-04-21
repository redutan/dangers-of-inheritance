package io.redutan.dangers.inheritance.open;

public class FooMethodWithoutLsp extends FooMethod {

    @Override
    protected void processProtected() {
        super.processProtected();
        super.num = -1;
    }

    @Override
    public void process() {
        super.num = -2;
    }
}
