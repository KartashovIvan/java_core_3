package org.example.homework.four.ex4.exeption;

public class NoUserException extends Exception {
    public NoUserException(String message) {
        super(message + ": нет такого пользователя в базе данных");
    }
}
