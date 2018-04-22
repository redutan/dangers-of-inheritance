package io.redutan.dangers.inheritance.open;

public class FooMethodWithoutLsp extends FooMethod {
    /**
     * 메서드를 재정의하는 것 자체가 LSP 원칙을 깨트릴 수 있다.
     * 1. 재정의할 시 졔약조건을 인지하고 재정의한다. - 결국 javadoc 문서화 요망
     * 2. 재정의를 못하게 막는다.
     */
    @Override
    public void process() {
        super.num = -1;
    }
}
