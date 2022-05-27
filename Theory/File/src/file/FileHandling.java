package file;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {
    protected ArrayList<Integer> intDatabase = new ArrayList<>();
    protected ArrayList<String> stringDatabase = new ArrayList<>();
    protected int index = -1;

    private final int max_size = 7;
    protected int arr[] = new int[max_size];

    public void setDataIntoFile(String data){
        File file = new File("output.txt");


        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else {
            try{
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
            try{
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()){
                    String data = sc.nextLine();
                    this.getSum(data,';');
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("File Not Found!");
        }
    }

    public void getSum(String data, Character ch){
        int sum = 0;
        String  temp[] = null;
        for (int i = 0;i< data.length();i++){
            temp = data.split(String.valueOf(ch));
        }
        for (int i = 0;i<temp.length;i++){
            sum += Integer.parseInt(temp[i]);
        }
       System.out.println(sum);
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
            this.storeDataInArrayFromFile(temp[i]);
        }

    }
    public void test(){

        System.out.println(this.stringDatabase.size());
    }

    public int checkHowManyVowels() {
        int vowel = 0;
        for (String word : this.stringDatabase) {
            Character ch = word.charAt(0);
            if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u'){
                vowel ++;
            }
        }

        return vowel;
    }


}
