package io.redutan.dangers.inheritance.open;

public class FooField {
    public int publicNum;
    protected int protectedNum;
    private int privateNum;

    public FooField() {
    }

    public int getProtectedNum() {
        return protectedNum;
    }

    public int getPrivateNum() {
        return privateNum;
    }

    public int getPublicNum() {
        return publicNum;
    }
}
