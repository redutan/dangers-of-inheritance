package io.redutan.dangers.inheritance.template;

public class BadContentHolder extends AbstractPrefixContentHolder {
    public BadContentHolder(String content) {
        super(content);
    }

    // 재정의가 가능하며, 실제 사용하지 않음.
    @Override
    protected String getPrefix() {
        return "PREFIX";
    }

    // 템플릿 메서드 자체를 재정의함. 이럴거라면 차라리 ContentHolder 를 구현하는 것이 나음
    @Override
    public String getContent() {
        // super.content 이 열려 있음. 이로 인해서 많은 부수효과가 발생할 수 있음
        return "PREFIX" + super.content;
    }
}
