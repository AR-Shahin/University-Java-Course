package classes;

import classes.Hepler.Helper;

public class StringOperation extends Helper {
    private String str;

    public void setString(String str) {
        this.str = str;
    }

    public String reverseString() {
        String revStr = "";
        char ch;
        for (int i = 0; i < this.str.length(); i++) {
            ch = str.charAt(i);
            revStr = ch + revStr;
        }
        return revStr;
    }

    public void checkPalindromeOrNot() {

        String str1 = this.str.toLowerCase();
        String str2 = this.reverseString().toLowerCase();

        System.out.println(str1.equals(str2) ? "Palindrome!" : "Not Palindrome!");
    }

    public void checkSubStringOrNot(String substr) {

        System.out.println(this.str.toLowerCase().contains(substr.toLowerCase()) ? "Yes!" : "No!");

    }

    public void checkSubStringOrNot(String data[], String substr) {

        // System.out.println(data[0]);
        String temp[] = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i].toLowerCase().contains(substr.toLowerCase())) {
                temp[i] = data[i];
                print(temp[i]);
            }

            // System.out.println(data[i].toLowerCase().contains(substr.toLowerCase()) ?
            // "Yes!" : "No!");

            // System.out.println(data[i].contains("s"));
        }
        // System.out.println("\n--------------");
        // for (int i = 0; i < temp.length; i++) {
        // System.out.print(temp[i] + " ");
        // }

    }

    public void concatenate(String str[]) {
        String sentence = "";

        for (int i = 0; i < str.length; i++) {
            sentence += (str[i] + " ");
        }

        print(sentence);
    }

}
