package homework;

import com.opencsv.CSVReader;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CsvReaderHuman {

    public List<Human> readCsvFile() throws IOException {
        Reader in = new FileReader("C:/Users/provo//IdeaProjects/csv/fn.csv");
        CSVReader reader =  new CSVReader(in, ';');
        List<Human> humanList = new LinkedList<>();
        String[] nextLine;
        reader.readNext();
        while ((nextLine = reader.readNext()) != null){
            humanList.add(new Human(
                    Integer.parseInt(nextLine[0]),
                    nextLine[1],
                    nextLine[2],
                    nextLine[3],
                    Division.createDivision(nextLine[4]),
                    Integer.parseInt(nextLine[5])
            ));
        }
        return humanList;
    }
}
