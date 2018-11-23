package org.andestech.learning.rfb18.g2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Utils {

   public static Object[][] getData(String fileName)  {

    List<String> lines = null;
    try {
        lines = Files.readAllLines(Paths.get(fileName));
    }
    catch (IOException ex){
        ex.printStackTrace();
        return null;
    }

    // все строки содержат тестовые данные
    int numberOfLine = lines.size();

    Object[][] datas = new Object[numberOfLine][3];

    int j =0;
    for(String line: lines)
    {
       int i =0;
       for(String number: line.split(","))
       { datas[j][i] = Double.parseDouble(number);
         i++;
       }

       j++;
    }



    return datas;
   }

}
