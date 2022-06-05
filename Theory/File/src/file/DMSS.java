package file;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DMSS {

    private int sum = 0;
    private double mean_sum = 0;
    private double mean_square_sum = 0;
    private double mean = 0;
    private int item = 0;

    protected ArrayList<String> stringDatabase = new ArrayList<>();
    public void getDataFromFileMeanSumMod(){
        File file = new File("input.txt");

        if(file.exists()){
            try{
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()){
                    String data = sc.nextLine();
                    double x = Double.parseDouble(data);
                    this.mean_sum += x;
                    this.mean_square_sum += (x*x);
                    this.item ++;
//                    int sum = this.getSum(data,';'); // for sum
                }
                this.mean = mean_sum/item;
                double variant = (mean_square_sum/item) - (mean*mean);
                System.out.println(mean);
                System.out.println(variant);
                System.out.println(Math.sqrt(variant));

//                this.setDataIntoFile(String.valueOf(sum)); // for sum
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("File Not Found!");
        }
    }

    public int getSum(String data, Character ch){
        String  temp[] = null;
        for (int i = 0;i< data.length();i++){
            temp = data.split(String.valueOf(ch));
        }
        for (int i = 0;i<temp.length;i++){
            int num = Integer.parseInt(temp[i]);
            if(num % 2 != 0){
                this.sum += num;
            }
        }
        return sum;
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

    public void getDataFromFileForDate(){
        File file = new File("input.txt");

        if(file.exists()){
            try{
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()){
                    String data = sc.nextLine();
                    this.splitFileDataForDate(data,' ');
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("File Not Found!");
        }
    }

    public void splitFileDataForDate(String data, Character separator){
        String temp[] = null;
        for (int i = 0;i< data.length();i++){
            temp = data.split(String.valueOf(separator));
        }

        String format = "";
        for (int i = 0;i<temp.length;i++){
            if(temp[i].contains("/") && (temp[i].length() == 8 ||temp[i].length() == 10)){
//                System.out.println(temp[i]);
                format += temp[i] + "\n";
            }
        }

        setDataIntoFile(format);


    }
}
