package ru.itvitality.sbrf.cu.l04.io.services.impl;

import ru.itvitality.sbrf.cu.l04.io.exception.ExampleException;
import ru.itvitality.sbrf.cu.l04.io.services.DataFileService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class DataFileServiceImpl implements DataFileService {
    private String fileName;

    public DataFileServiceImpl( String fileName ) {
        this.fileName = fileName;
    }

    @Override
    public List<String[]> readData() {
        //TODO переписать на схему >= java7
        InputStream resourceAsStream = null;
        try {
            try {
                resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream( fileName );
                BufferedReader reader = new BufferedReader( new InputStreamReader( resourceAsStream ) );
                List<String[]> data = new ArrayList<>();
                String line = null;
                while ( ( line = reader.readLine() ) != null ) {
                    data.add( line.split( ";" ) );
                }
                return data;
            } finally {
                if ( resourceAsStream != null ) resourceAsStream.close();
            }
        } catch ( IOException e ) {
            throw new ExampleException( "Can't read file" );
        }
    }

    @Override
    public void addDataItem( String[] data ) {
        // TODO реализовать
    }
}
