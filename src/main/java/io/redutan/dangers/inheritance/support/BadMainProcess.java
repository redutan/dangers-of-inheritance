package io.redutan.dangers.inheritance.support;

public class BadMainProcess extends ProcessSupport {
    public String process(String input) {
        String process = "process " + input;
        return afterProcess(process);
    }
}
