package io.redutan.dangers.inheritance.support;

public abstract class ProcessSupport {
    // 만약 final을 붙인다면 ?!
    protected String afterProcess(String input) {
        return input + "suffix";
    }
}
