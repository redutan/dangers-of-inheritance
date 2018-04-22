package io.redutan.dangers.inheritance.template;

public class GoodContentHolder extends AbstractSafePrefixContentHolder {
    public GoodContentHolder(String content) {
        super(content);
    }

    @Override
    protected String getPrefix() {
        return "PREFIX";
    }
}
