package ru.easyjava.java;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FileReadingServiceTest {

    @Test(expected = IOException.class)
    public void testFileReader() {
        FileReadingService testedObject = new FileReadingService();

        testedObject.readFile();
    }
}