package ru.itvitality.sbrf.cu.l04.io.services;

import ru.itvitality.sbrf.cu.l04.io.dto.User;

import java.util.List;

public interface DataService {
    List<User> getUsers();
    void addUser(User user);
}
