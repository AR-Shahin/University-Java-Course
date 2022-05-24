package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    private int arr[] = new int[5];

    public void setDataInFile(String data){

        File file = new File("output.txt");

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else{
            try {
                FileWriter fileWriter = new FileWriter("output.txt",true);
                fileWriter.write(data);
                fileWriter.close();

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }


    public void getDataFromFile(){
        File file = new File("input.txt");

        if(file.exists()){
            try {
                Scanner sc = new Scanner(file);
                int index = 0;
                while (sc.hasNextLine()){
                    String data = sc.nextLine();
                    this.arr[index++] = Integer.parseInt(data);
                }

                this.getMaxValue();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println("File Doesn't exists!");
        }
    }

    private void getMaxValue(){
        int max = this.arr[0];

        for (int i = 0;i<5;i++){
            if(max < this.arr[i]){
                max = this.arr[i];
            }
        }

        String data = "Max : " + max;

        this.setDataInFile(data);
    }

}
