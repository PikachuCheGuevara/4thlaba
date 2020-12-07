package homework;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            List<Human> humanList = new CsvReaderHuman().readCsvFile();
            for(Human human : humanList){
                System.out.println(human.toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка. Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
