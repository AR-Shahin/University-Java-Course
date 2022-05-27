package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {

    private int line = 0;
    private int word = 0;
    private int vowel = 0;
    public void readDataFromFile(String path){
        File file = new File(path);

        if(file.exists()){
            try {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()){
                    String data = sc.nextLine();
                    this.countWordAndVowelNumber(data);
                    this.line ++;
                }
//                System.out.println("word = " + this.word);
//                System.out.println("line = " + this.line);
//                System.out.println("Vowel = " + this.vowel);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("File not found!");
        }
    }

    public void writeDataInFile(String path) throws IOException {
        File file = new File(path);

        if(!file.exists()){
            file.createNewFile();
        }else{
            String format = "Line = " + this.line + "\n"
                    + "Word = " + this.word + "\n"
                    + "Vowel = " + this.vowel + "\n";
            FileWriter fileWriter = new FileWriter(path,true);
            fileWriter.write(format);
            fileWriter.close();
        }
    }
    public void countWordAndVowelNumber(String line){
        String temp[] = null;

        for(int i = 0;i<line.length();i++){
            temp = line.split(" ");
        }

        for(int i = 0 ;i<temp.length;i++){
            Character ch = temp[i].charAt(0);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                this.vowel ++;
            }
            this.word ++;
        }

    }
}
