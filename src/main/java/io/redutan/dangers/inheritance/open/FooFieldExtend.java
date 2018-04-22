package io.redutan.dangers.inheritance.open;

public class FooFieldExtend extends FooField {
    public FooFieldExtend(int num) {
        super();
        // public 이나 protected 나 열려 있다.
        this.publicNum = num;
        this.protectedNum = num;
//        this.privateNum = num;    // Compile error
    }
}
