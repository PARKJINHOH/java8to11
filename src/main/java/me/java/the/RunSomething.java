package me.java.the;

@FunctionalInterface
public interface RunSomething {

    // 추상메소드가 하나만 있으면 함수형 인터페이스이다.
    abstract int doIt(int number);

}
