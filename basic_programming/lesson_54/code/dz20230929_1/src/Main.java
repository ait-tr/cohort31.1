/*
    Задача 1
    Дан файл с текстом вида:

    jack:2000
    john:2900
    greta:3100
    john:1300
    nick:1200
    greta:500
    ...

    т.е. имя и сумма оплаты. Ваша задача прочитать файл, и сформировать два файла: part1 cо списком тех, кому
    перечисленно в сумме менее 2000 и part2 cо списком тех, кому перечисленно в сумме более 2000.
    Обратите внимание, если в исходном файле john фигурирует дважды (как в нашем примере), это означает что один
    и тот же человек и ему выплачивали дважды. Таким образом, в итоговом файле для john-а должна быть запись
    john:4200 и эта строка должна быть в файле part2.

 // read

 // handler
 Map<String, Integer>

 // write


    */


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
   // absolute path  !!!!
    public static final String DATA_FILE = "D:/ait-tr/gits/cohort31.1/basic_programming/lesson_54/code/dz20230929_1/data.txt";
    public static final String PART1_FILE = "D:/ait-tr/gits/cohort31.1/basic_programming/lesson_54/code/dz20230929_1/part1.txt";
    public static final String PART2_FILE = "D:/ait-tr/gits/cohort31.1/basic_programming/lesson_54/code/dz20230929_1/part2.txt";

    public static void main(String[] args) {
        List<String> list = readFile();
        System.out.println(list);
        System.out.println("------------- to Map -------------");
        Map<String, Integer> map = listToMapByName(list);
        System.out.println(map);
        writeFiles(map,2000);
    }

    public static List<String> readFile(){
        List<String> result= new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(DATA_FILE))) {
            String dataString="";
            while ((dataString=br.readLine())!=null) {
                result.add(dataString);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public static Map<String, Integer> listToMapByName(List<String> list){
        Map<String,Integer> result=new HashMap<>();
        if(list==null || list.isEmpty()) return result;
        for(String record: list){
            try {
                PersonAmount person = parseOneString(record);
                int value =result.getOrDefault(person.getName(),0) + person.getAmount();
                result.put(person.getName(),value);
            } catch (Exception e){
                System.out.println("Error with  " + record);
            }
        }
        return result;
    }
    private static  PersonAmount parseOneString(String str){
        String[] split = str.split(":");
        return new PersonAmount(split[0],Integer.parseInt(split[1]));
    }

    public static void writeFiles(Map<String,Integer> map, int amountLimit){
        try (
                BufferedWriter file1 = new BufferedWriter(new FileWriter(PART1_FILE));
                BufferedWriter file2 = new BufferedWriter(new FileWriter(PART2_FILE));
        ) {
            for(Map.Entry<String,Integer> e:map.entrySet()){
                BufferedWriter br = (e.getValue()>amountLimit?file2:file1);
                String record = e.getKey()+":"+e.getValue();
                br.write(record);
                br.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

