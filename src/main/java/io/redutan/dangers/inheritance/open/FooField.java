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

    public void setNum(int num) {
        this.publicNum = num;
        this.protectedNum = num;
        this.privateNum = num;
    }
}
