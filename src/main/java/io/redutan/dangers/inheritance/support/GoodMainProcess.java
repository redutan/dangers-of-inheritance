package io.redutan.dangers.inheritance.support;

/**
 * 상속 보다는 합성(구성-위임)이 낫다.
 * 상속의 기회는 한 번 뿐이다. 해당 클래스의 중심이 되는 도메인 성격이 상속의 기회를 가지는 것이 좋다.
 */
public class GoodMainProcess {
    private final ProcessHelper processHelper = new ProcessHelper();

    public String process(String input) {
        String process = "process " + input;
        return processHelper.afterProcess(process); // 재정의가 아니라 중복 제거가 목표라면 합성을 사용하라.
    }
}
