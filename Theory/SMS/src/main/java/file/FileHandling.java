package file;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {
    protected ArrayList<Integer> intDatabase = new ArrayList<>();
    protected ArrayList<String> stringDatabase = new ArrayList<>();
    protected int index = -1;
    public void setDataIntoFile(String data){
        File file = new File("sms.txt");

        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else {
            try{
                FileWriter fileWriter = new FileWriter("sms.txt",true);
                fileWriter.write(data);
                System.out.println(data);
                fileWriter.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public void getDataFromFile(){
        File file = new File("sms.txt");

        if(file.exists()){
            try{
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()){
                    String data = sc.nextLine();
                    this.storeDataInArrayFromFile(data);
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("File Not Found!");
        }
    }

    public void storeDataInArrayFromFile(int data){
        this.intDatabase.add(data);
    }
    public void storeDataInArrayFromFile(String data){
        this.stringDatabase.add(data);
    }
    public void splitFileData(String data, Character separator){
        String temp[] = null;
        for (int i = 0;i< data.length();i++){
            temp = data.split(String.valueOf(separator));
        }

        for (int i = 0;i<temp.length;i++){
//            System.out.println(temp[i]);
            this.storeDataInArrayFromFile((String)temp[i]);
        }

    }
    public void test(){
//        System.out.println(this.stringDatabase.get(0));
        System.out.println(this.stringDatabase.size());
    }





    public String searchStudentByID(String id){
        String data = "";
        this.getDataFromFile();

        for(String student : this.stringDatabase){
            String sid = student.split(";")[1];
            int x = Integer.parseInt(id);
            int y = Integer.parseInt(sid);
            if(x == y){
                data = student;
            }
        }
        return data != "" ? data : "Invalid ID!";
    }

    private void print(Object obj){
        System.out.println(obj);
    }
}
