package com.directi.training.dip.exercise_refactored;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class MyFileWriter implements IWriter{
      private String _fileName;

    public MyFileWriter(String fileName)
    {
        _fileName = fileName;
    }

    @Override
    public void write(String data) throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter(_fileName));
        writer.write(data);
        writer.close();
    }
}
