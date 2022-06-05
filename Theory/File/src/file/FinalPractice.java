package file;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FinalPractice {

    private int sum = 0;
    private int item = 0;
    private double square_sum = 0;
    private int odd = 0;
    public void getDataFromFileTodoFirst(){
        File file = new File("input.txt");

        if(file.exists()){
            try{
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()){
                    String data = sc.nextLine();
                    double val = Double.parseDouble(data);
                    this.sum += val;
                    this.item ++;
                    this.square_sum += (val*val);
                }

                double mean = this.sum / item;
                double variation = (this.square_sum/item) - (mean*mean);
                double sdb = Math.sqrt(mean);

                String format = "Mean : " + mean
                        + "\nVariation : " + variation
                        +"\nsdb " + sdb;
                setDataIntoFile(format);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("File Not Found!");
        }
    }
    public void getDataFromFileTodoSecond(){
        File file = new File("input.txt");

        if(file.exists()){
            try{
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()){
                    String data = sc.nextLine();
                    getSum(data);
                }
                setDataIntoFile(String.valueOf(this.odd));

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("File Not Found!");
        }
    }

    private void getSum(String data){
        String  temp[] = null;
        for (int i = 0;i< data.length();i++){
            temp = data.split(";");
        }
        for (int i = 0;i<temp.length;i++){;
            int num = Integer.parseInt(temp[i]);
            if(num % 2 != 0){
                this.odd += num;
            }
        }
    }
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

    public void getDataFromFileTodoThird(){
        File file = new File("input.txt");

        if(file.exists()){
            try{
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()){
                    String data = sc.nextLine();
                    getDate(data);
                }
                setDataIntoFile(String.valueOf(this.odd));

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("File Not Found!");
        }
    }
    public void getDate(String line){
        String temp[] = null;
        for (int i = 0;i<line.length();i++){
            temp = line.split(" ");
        }
        String format = "";
        for (int i = 0;i<temp.length;i++){
            if(temp[i].contains("/") || temp[i].contains("-")){
                format+= temp[i] + "\n";
            }
        }

        System.out.println(format);
    }
}
