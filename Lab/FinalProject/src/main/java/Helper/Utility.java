package Helper;

public class Utility extends Logger{

    public String modifyDataToDisplay(String data){
        String temp = "";

        temp = "Name : " + data.split(";")[1] + "\n"
                + "Email : " + data.split(";")[2] + "\n"
                + "Age : " + data.split(";")[3] + "\n"
                + "Phone : " + data.split(";")[4] + "\n"
                + "Blood Group : " + data.split(";")[5] + "\n"
                + "Status : " + data.split(";")[6] + "\n"
                + "Role : " + data.split(";")[7] + "\n"
                + "ID : " + data.split(";")[0] + "\n";
        return temp;
    }
}
