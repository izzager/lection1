package ru.tedusar;

// Создаю мой кастомный эксепшн, где могу изменить некоторое поведение
public class MyCustomException extends RuntimeException { // наследуюсь от RuntimeException, чтобы унаследовать стандатное поведение эксепшена
    @Override
    public String getMessage() {
        return "hello world!!!"; //переопределяю текст исключения
    }
}
