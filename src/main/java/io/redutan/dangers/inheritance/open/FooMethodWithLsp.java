package io.redutan.dangers.inheritance.open;

public class FooMethodWithLsp extends FooMethod {
    private int twice;

    @Override
    public void process() {
        super.process();    // super를 호출하는 것만으로도 LSP를 지킬 가능성이 커진다
        twice = super.getNum() * 2;
    }

    public int getTwice() {
        return this.twice;
    }
}
