package Helper;

public class Utility extends Logger{

    public String modifyDataToDisplay(String data){
        String temp = "";

        temp = "Name : " + data.split(";")[0] + "\n"
                + "Email : " + data.split(";")[1] + "\n"
                + "Age : " + data.split(";")[2] + "\n"
                + "Phone : " + data.split(";")[3] + "\n"
                + "Blood Group : " + data.split(";")[4] + "\n"
                + "Status : " + data.split(";")[5] + "\n"
                + "Role : " + data.split(";")[6] + "\n";

        return temp;
    }
}
