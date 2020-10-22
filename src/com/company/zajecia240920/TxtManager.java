package com.company.zajecia240920;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface TxtManager {
    void addTextLine(String text) throws IOException;
    void viewFile() throws FileNotFoundException;
    void openTextFile();
}
