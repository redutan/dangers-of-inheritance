package io.redutan.dangers.inheritance.template;

/**
 * 템플릿 패턴은 변하는 부분과 변하지 않는 부분의 관심사 분리가 중요하다.
 * 변하는 부분은 다형성으로 열어두고 변하지 않는 부분은 불변 템플릿(final)으로 만든다.
 */
public abstract class AbstractSafePrefixContentHolder implements ContentHolder {
    // 가능한 필드는 닫고 불변화 시킨다. 접근이 필요할 때만 점진적으로 연다.
    private final String content;

    public AbstractSafePrefixContentHolder(String content) {
        this.content = content;
    }

    // 템플릿 : 재정의 불가능하게 final
    @Override
    public final String getContent() {
        return getPrefix() + content;
    }

    // 다형석으로써 추상 메서드만 오픈시킨다.
    abstract protected String getPrefix();
}
