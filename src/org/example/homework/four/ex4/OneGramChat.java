package org.example.homework.four.ex4;

import java.util.Arrays;
import java.util.Scanner;
import org.example.homework.four.ex4.domain.Message;
import org.example.homework.four.ex4.domain.User;
import org.example.homework.four.ex4.exeption.AuthorizationException;
import org.example.homework.four.ex4.exeption.IncorrectPasswordException;
import org.example.homework.four.ex4.exeption.NoUserException;

public class OneGramChat {
    private User currentUser;
    private User[] users = new User[0];

    private void createUser(String name, String password) {
        User user = new User(name, password, 100);
        users = Arrays.copyOf(users, users.length + 1);
        users[users.length - 1] = user;
    }

    private void login(String name, String password) throws NoUserException, IncorrectPasswordException {
        int id = checkExistUsers(name);
        if (id > -1) {
            checkUserPassword(id, password);
        }
    }

    private int checkExistUsers(String name) throws NoUserException {
        if (users.length == 0) {
            throw new NoUserException(name);
        }
        for (int i = 0; i < users.length; i++) {
            if (users[i].getName().equals(name)) {
                return i;
            }
        }
        throw new NoUserException(name);
    }

    private void checkUserPassword(int id, String password) throws IncorrectPasswordException {
        if (users[id].getPassword().equals(password)) {
            currentUser = users[id];
        } else {
            throw new IncorrectPasswordException("Не верный пароль");
        }
    }

    private void logout() {
        currentUser = null;
    }

    private void sendLetter(String text, String sendUser) throws NoUserException, AuthorizationException {
        if (currentUser == null) {
            throw new AuthorizationException("Вы не авторизованы");
        }
        int id = checkExistUsers(sendUser);
        Message message = new Message(text, currentUser, users[id]);
        currentUser.addMessageOutgoing(message);
        users[id].addMessageIncoming(message);
    }

    private void readMessage() throws AuthorizationException {
        if (currentUser == null) {
            throw new AuthorizationException("Вы не авторизованы");
        }
        for (Message message : currentUser.getMessages()) {
            if (message == null) {
                break;
            } else if (message.isIncoming()) {
                System.out.println("Письмо от " + message.getForm().getName() + ": " + message.getText());
            } else {
                System.out.println("Письмо к " + message.getTo().getName() + ": " + message.getText());
            }
        }
    }

    public void startOneGramChat() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите одну из команд: войти | новый | выйти | написать | прочитать | exit");
            String command = scanner.nextLine().toLowerCase();

            String name;
            String password;
            String message;
            switch (command) {
                case "войти":
                    System.out.println("Введите имя");
                    name = scanner.nextLine().toLowerCase();
                    System.out.println("Введите пароль");
                    password = scanner.nextLine().toLowerCase();
                    try {
                        login(name, password);
                    } catch (NoUserException | IncorrectPasswordException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "новый":
                    System.out.println("Введите имя");
                    name = scanner.nextLine().toLowerCase();
                    System.out.println("Введите пароль");
                    password = scanner.nextLine().toLowerCase();
                    createUser(name, password);
                    break;
                case "выйти":
                    logout();
                    break;
                case "написать":
                    System.out.println("Введите сообщение");
                    message = scanner.nextLine();
                    System.out.println("Введите кому");
                    name = scanner.nextLine().toLowerCase();
                    try {
                        sendLetter(message, name);
                    } catch (NoUserException | AuthorizationException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "прочитать":
                    try {
                        readMessage();
                    } catch (AuthorizationException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Не верная команда");
                    break;
            }
        }
    }
}
