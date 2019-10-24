package ru.itvitality.sbrf.cu.l04.io.services.impl;

import ru.itvitality.sbrf.cu.l04.io.dto.User;
import ru.itvitality.sbrf.cu.l04.io.services.DataService;

import java.util.ArrayList;
import java.util.List;

public class DataServiceImpl implements DataService {
    private final DataFileServiceImpl dataFileService;

    public DataServiceImpl( DataFileServiceImpl dataFileService ) {
        this.dataFileService = dataFileService;
    }

    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        for ( String[] arr : dataFileService.readData() ) {
            User user = new User();
            user.setId( Integer.valueOf( arr[ 0 ] ) );
            user.setLogin( arr[ 1 ] );
            user.setName( arr[ 2 ] );
            users.add( user );
        }
        return users;
    }

    @Override
    public void addUser( User user ) {
        //TODO надо сделать
    }
}
