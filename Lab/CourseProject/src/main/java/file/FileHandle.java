package file;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandle {
    protected ArrayList<Integer> intDatabase = new ArrayList<>();
    protected ArrayList<String> stringDatabase = new ArrayList<>();
    protected int index = -1;

    private final int max_size = 7;
    protected int arr[] = new int[max_size];

    public void setDataIntoFile(String data){
        File file = new File("database.txt");


        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else {
            try{
                FileWriter fileWriter = new FileWriter("database.txt",true);
                fileWriter.write(data);
                fileWriter.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }


    public String getDataFromFile(String id){
        File file = new File("database.txt");

        boolean flag = true;
        if(file.exists()){
            try{
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()){
                    String data = sc.nextLine();
                    String dbID = data.split(";")[1];
                    int oldId = Integer.parseInt(id);
                    int intDBID = Integer.parseInt(dbID);
                    if(oldId == intDBID){
                        flag = true;
                        return data;
                    }
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("File Not Found!");
        }

        flag = false;

        if(!flag){
            return "NOT_EXITS";
        }else{
        return "";
        }

    }


}
