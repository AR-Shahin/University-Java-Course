import file.FileHandling;

public class Main {
    public static void main(String[] args) {
        FileHandling file = new FileHandling();

//        String data = "10,20,8,40,50";
//        file.setDataIntoFile(data);
//        file.getDataFromFile();
//        file.checkHowManyVowels();

        file.fileRead();
        file.findMinMaxAvg();

    }
}