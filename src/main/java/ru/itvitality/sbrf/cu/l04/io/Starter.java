package ru.itvitality.sbrf.cu.l04.io;

import ru.itvitality.sbrf.cu.l04.io.dto.User;
import ru.itvitality.sbrf.cu.l04.io.services.DataService;
import ru.itvitality.sbrf.cu.l04.io.services.impl.DataFileServiceImpl;
import ru.itvitality.sbrf.cu.l04.io.services.impl.DataServiceImpl;

import java.util.List;

public class Starter {

    public static final void main( String args[] ) {
        DataFileServiceImpl dataFileService = new DataFileServiceImpl( "users.csv" );
        DataService dataService = new DataServiceImpl( dataFileService );

        List<User> users = dataService.getUsers();

        users.stream().forEach( u -> System.out.println( u ) );

        //TODO надо бы добавить нового пользователя. И проверить как оно будет в итоге

    }
}
