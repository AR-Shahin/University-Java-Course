package shahin.ar;


import helper.Helper;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main extends Helper {

    public University uni = new University();

    // 6 , 10

    public static void main(String[] args) {

        Main self = new Main();
        self.uni.setStudentInfoFile();
//        self.registerNewStudents();
//        self.registerNewTeachers();
//
//        self.println("------Find Students by batch-----------");
        self.uni.displayAllStudents(self.uni.findStudents(50));
//
//        self.println("-------Find Students by department----------");
//        self.uni.displayAllStudents(self.uni.findStudents("CSE"));
//
//        self.println("--------Find Students by batch and city---------");
//        self.uni.displayAllStudents(self.uni.findStudents(50,"Dhaka"));
//
//        self.println("--------Find Students by Nationality---------");
//        self.uni.displayAllStudents(self.uni.findStudentsByNationality("BD"));
//
//        self.println("--------Find Students by Gender---------");
//        self.uni.displayAllStudents(self.uni.findStudentsByGender("F"));
//
//        self.println("--------Find Single Student by ID---------");
//        self.uni.displayAllStudents(self.uni.findSingleStudent(101));
//
//        self.println("--------Find Single Student by Email---------");
//        self.uni.displayAllStudents(self.uni.findSingleStudent("s@mail.com"));
//
//        self.println("--------Find Maximum Student's CGPA by Batch---------");
//        self.uni.displaySingleStudent(self.uni.findMaxMinCgpaStudentByBatch(50,"MAX"));
//
//        self.println("-------Find Teachers by rank----------");
//        self.uni.displayAllTeachers(self.uni.findTeachersByRank("Java"));
//
//        self.println("-------Find Teacher Max Salary by Rank----------");
//        self.uni.displaySingleTeacher(self.uni.findTeacherMaxMinSalaryByRank("Java","MAX"));
//
//        self.println("-------sortTeacherAccordingToJoiningDate----------");
//        self.uni.sortTeacherAccordingToJoiningDate("junior");

    }

    public void registerNewStudents(){
        Student shahin = new Student("Shahin","M",21,"01754100439","Dhaka",101,"s@mail.com","CSE",50,3.88);
        Student asik = new Student("Asik","M",22,"123","Pabna",102,"a@mail.com","CSE",50,3.95);
        Student tanzim = new Student("Tanzim","M",21,"321","Dhaka",103,"t@mail.com","CSE",52,3.15);
        Student omi = new Student("Omi","M",22,"1236","Chandpur",1001,"o@mail.com","CSE",55,3.66);
        Student bristy = new Student("Bristy","F",20,"12356","Cumills",105,"b@mail.com","CSE",55,3.00);
        Student shuvo = new Student("Shuvo","M",27,"123689","Chandpur",10001,"su@mail.com","BBA",42,3.00);
        Student nahid = new Student("Nahid","M",24,"123699","Gazipur",102,"na@mail.com","BBA",49,3.68);

        shahin.setNationality("BD");
        tanzim.setNationality("BD");
        asik.setNationality("USA");
        Student students[] = {shahin,asik,tanzim,omi,bristy,shuvo,nahid};
        uni.setStudents(students);
    }
    public void registerNewTeachers(){

        Teacher alamin = new Teacher("Alamin","M",28,"12","Dhaka",101,"Data Structure","a@mail.com","2020","CSE",10000);

        Teacher ashfaq = new Teacher("Ashfaq","M",29,"123","Dhaka",102,"Java","as@mail.com","2022","CSE",15000);

        Teacher rajon = new Teacher("Rajon Bardhan","M",30,"123","Cumilla",103,"Algorithm","rb@mail.com","2016","CSE",160000);
        Teacher shahin = new Teacher("AR Shahin","M",30,"1233","Dhaka",1033,"Java","ar@mail.com","2021","CSE",8000);
        Teacher tanzim = new Teacher("Tanzim","M",20,"12333","Dhaka",10323,"Java","tn@mail.com","2023","CSE",5000);
        Teacher teachers[] = {alamin,ashfaq,rajon,shahin,tanzim};
        uni.setTeachers(teachers);
    }


}


