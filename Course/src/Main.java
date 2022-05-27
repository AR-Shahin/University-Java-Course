import dhaka.DCircle;
import file.FileHandling;
import file.FileOperation;
import opp.Animal;
import opp.AnotherMath;
import opp.Dog;
import opp.Math;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException {

        FileOperation file = new FileOperation();
        file.readDataFromFile("input.txt");
        file.writeDataInFile("output.txt");
//        file.countWordNumber("I am shahin bahi");

    }
}

