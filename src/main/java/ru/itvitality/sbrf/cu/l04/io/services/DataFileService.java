package ru.itvitality.sbrf.cu.l04.io.services;

import java.io.IOException;
import java.util.List;

public interface DataFileService {
    List<String[]> readData() ;
    void addDataItem(String[] data);
}
