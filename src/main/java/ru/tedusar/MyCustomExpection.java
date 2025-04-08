package ru.tedusar;

public class MyCustomExpection extends RuntimeException {
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
