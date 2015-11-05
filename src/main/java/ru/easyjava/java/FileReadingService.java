package ru.easyjava.java;

import lombok.SneakyThrows;
import lombok.Synchronized;
import lombok.extern.java.Log;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

@Log
public class FileReadingService {

    @Synchronized
    @SneakyThrows
    public long readFile() {
        log.info("Going to count line in non-existent file in a thread-safe way.");
        return new BufferedReader(new InputStreamReader(new FileInputStream("/nonexistent")))
                .lines().count();
    }
}
