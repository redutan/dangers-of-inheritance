package io.redutan.dangers.inheritance.template;

public abstract class AbstractPrefixContentHolder implements ContentHolder {
    // 상태가 실질적으로 열려 있어서 누구나 변경할 수 있다.
    protected String content;

    public AbstractPrefixContentHolder(String content) {
        this.content = content;
    }

    // 재정의가 가능해서 LSP 원칙이 깨질 수 있다.
    @Override
    public String getContent() {
        return getPrefix() + content;
    }

    abstract protected String getPrefix();
}
