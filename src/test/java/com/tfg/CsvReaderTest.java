package com.tfg;

import com.tfg.models.Csv;
import com.tfg.utils.CsvReader;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class CsvReaderTest {

    File file = new File("./src/test/java/resources/test/hurricanes.csv");

    CsvReader reader = new CsvReader(file);

    public CsvReaderTest() throws FileNotFoundException {
    }

    @Test
    public void convertFileToCsv() {
        Csv csv = reader.convertFileToCsv();
        assertEquals(13, csv.headers.length);
        assertEquals(8, csv.lines.length);
    }
}