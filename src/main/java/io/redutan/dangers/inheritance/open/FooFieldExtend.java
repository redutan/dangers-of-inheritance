package io.redutan.dangers.inheritance.open;

public class FooFieldExtend extends FooField {

    public void setNum(int num) {
        this.publicNum = num + 10;       // public field is evil!!
        this.protectedNum = num + 20;    // protected field is evil too!!
//        this.privateNum = num;    // Compile error
    }
}
