package shahin.ar;

import helper.Helper;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class University extends Helper implements AdministratorTaskInterface{

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(Student students[]) {
        for(int i = 0;i<students.length;i++){
            this.students.add(students[i]);
        }
    }


    public void setTeachers(Teacher teachers[]) {
        for(int i = 0;i<teachers.length;i++){
            this.teachers.add(teachers[i]);
        }
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void displaySingleStudent(Student student){
        println(student.name  + " " + student.getBatch() + " " + student.getDepartment() + " " + student.getCgpa());
    }
    public void displayAllStudents(){
        for(Student student : this.students){
            println(student.name  + " " + student.getBatch() + " " + student.getDepartment());
        }
    }
    public void displayAllStudents(Student students[]){
        for(Student student : students){
            println(student.name  + " " + student.getBatch() + " " + student.getDepartment());
        }
    }

    public void displayAllStudents(ArrayList<Student> students){
        for(Student student : students){
            println(student.name  + " " + student.getBatch() + " " + student.getDepartment());
        }
    }
    public ArrayList<Student> findStudents(int batch){
        ArrayList<Student> temp = new ArrayList<>();
        for (Student student : this.students){
            if(student.getBatch() == batch){
                temp.add(student);
            }
        }
        return temp;
    }
    public ArrayList<Student> findStudents(String dept){
        ArrayList<Student> temp = new ArrayList<>();
        for (Student student : this.students){
//            println(student.getDepartment().toLowerCase() == dept.toLowerCase() ? "d" : "D");
//            println(student.getDepartment().toLowerCase());
            if(student.getDepartment() == dept){
                temp.add(student);
            }
        }
        return temp;
    }
    public ArrayList<Student> findStudents(int batch ,String city){
        ArrayList<Student> temp = new ArrayList<>();
        for (Student student : this.students){
            if(student.getBatch() == batch && city == student.getCity()){
                temp.add(student);
            }
        }
        return temp;
    }
    public ArrayList<Student> findStudentsByNationality(String nationality){
        ArrayList<Student> temp = new ArrayList<>();
        for (Student student : this.students){
            if(student.hasNationality() && nationality == student.getNationality()){
                temp.add(student);
            }
        }
        return temp;
    }
    public ArrayList<Student> findStudentsByGender(String gender){
        ArrayList<Student> temp = new ArrayList<>();
        for (Student student : this.students){
            if(gender == student.getGender()){
                temp.add(student);
            }
        }
        return temp;
    }
    public ArrayList<Student> findSingleStudent(int id){
        ArrayList<Student> temp = new ArrayList<>();
        for (Student student : this.students){
            if(student.getId() == id){
                temp.add(student);
            }
        }
        return temp;
    }
    public ArrayList<Student> findSingleStudent(String email){
        ArrayList<Student> temp = new ArrayList<>();
        for (Student student : this.students){
            if(student.getEmail() == email){
                temp.add(student);
            }
        }
        return temp;
    }

    public ArrayList<Student> findStudentBySubString(String sub){
        ArrayList<Student> temp = new ArrayList<>();
        for (Student student : this.students){
            if(student.getName().contains(sub)){
                temp.add(student);
            }
        }
        return temp;
    }
    public Student findMaxMinCgpaStudentByBatch(int batch,String flag){
        ArrayList<Student> temp = new ArrayList<>();
        Student singleMaxStudent;
        Student singleMinStudent;

        temp = this.findStudents(batch);

        double max = temp.get(0).getCgpa();
        double min = temp.get(0).getCgpa();
        singleMaxStudent = temp.get(0);
        singleMinStudent = temp.get(0);
        for (Student student : temp){
            if(max < student.getCgpa()){
                max = student.getCgpa();
                singleMaxStudent = student;
            }
            if(min > student.getCgpa()){
                min = student.getCgpa();
                singleMinStudent = student;
            }
        }
        if(flag == "MAX"){
            return singleMaxStudent;
        }else{
            return singleMinStudent;
        }
    }
    public void displayAllTeachers(){
        for(Teacher teacher : this.teachers){
            println(teacher.getName()  + " " + teacher.getRank() + " " + teacher.getEmail() + " " + teacher.getId());
        }
    }
    public void displayAllTeachers(Teacher teachers[]){
        for(Teacher teacher : teachers){
            println(teacher.getName()  + " " + teacher.getEmail() + " " + teacher.getRank());
        }
    }
    public void displayAllTeachers(ArrayList<Teacher> teachers){
        for(Teacher teacher : teachers){
            println(teacher.getName()  + " " + teacher.getEmail() + " " + teacher.getRank());
        }
    }
    public void displaySingleTeacher(Teacher teacher){
        println(teacher.getName()  + " " + teacher.getEmail() + " " + teacher.getRank());
    }


    public ArrayList<Teacher> findTeachersByRank(String rank){
        ArrayList<Teacher> temp = new ArrayList<>();
        for (Teacher teacher : this.teachers){
            if(teacher.getRank() == rank){
                temp.add(teacher);
            }
        }
        return temp;
    }

    public Teacher findTeacher(int id){
        Teacher temp = null;
        for (Teacher teacher : this.teachers){
            if(teacher.getId() == id){
                temp = teacher;
            }
        }
        return temp;
    }
    public Teacher findTeacher(String email){
        Teacher temp = null;
        for (Teacher teacher : this.teachers){
            if(teacher.getEmail() == email){
                temp = teacher;
            }
        }
        return temp;
    }
    public Teacher findTeacherMaxMinSalaryByRank(String rank,String flag){
        ArrayList<Teacher> temp = new ArrayList<>();
        temp = this.findTeachersByRank(rank);
        Teacher singleMaxTeacher;
        Teacher singleMinTeacher;
        singleMaxTeacher = temp.get(0);
        singleMinTeacher = temp.get(0);
        double max = temp.get(0).getSalary();
        double min = temp.get(0).getSalary();

        for (Teacher teacher : temp){
            if(max < teacher.getSalary()){
                max = teacher.getSalary();
                singleMaxTeacher = teacher;
            }
            if(min > teacher.getSalary()){
                min = teacher.getSalary();
                singleMinTeacher = teacher;
            }
        }

        if(flag == "MAX"){
            return singleMaxTeacher;
        }else{
            return singleMinTeacher;
        }
    }

    private ArrayList<Teacher> getAllTeachersExceptOne(Teacher teach,String rank){
        ArrayList<Teacher> tempTeachers = new ArrayList<>();

        for (Teacher teacher : this.teachers){

            if(teach != teacher && rank == teacher.getRank()){
                tempTeachers.add(teacher);
            }
        }
        return tempTeachers;
    }

    // Task baki ache second max salary
    public void findSecondMaxMinTeacherSalaryByRank(String rank,String flag){

        ArrayList<Teacher> tempTeachers;

        Teacher firstMaxMinTeacher;


        firstMaxMinTeacher = this.findTeacherMaxMinSalaryByRank(rank,flag);
        Teacher secondMaxTeacher = null;
        Teacher secondMinTeacher;
        tempTeachers = this.getAllTeachersExceptOne(firstMaxMinTeacher,rank);

        double max = tempTeachers.get(0).getSalary();
        double min = tempTeachers.get(0).getSalary();

        for (Teacher teacher : tempTeachers){
            if(max < teacher.getSalary()){
                max = teacher.getSalary();
                secondMaxTeacher = teacher;
            println(teacher.getName());
            }
            if(min > teacher.getSalary()){
                min = teacher.getSalary();
                secondMinTeacher = teacher;
            }
        }


        if(flag == "MAX"){
            println(secondMaxTeacher.getName());
        }else{
            println(secondMaxTeacher.getName());
        }
    }


    public void sortTeacherAccordingToJoiningDate(String flag){
        ArrayList<Teacher> tempList = new ArrayList<>();

        tempList = this.teachers;

        flag = flag.toLowerCase();

        if(flag == "senior"){
            tempList.sort(Comparator.comparing(Teacher::getJoiningDate));
        }else {
            // Sort in reversed order
           tempList.sort(Comparator.comparing(Teacher::getJoiningDate).reversed());
        }

        this.displaySingleTeacher(tempList.get(0));
    }

    public void getStudentInfoFile(){

    }
    public void setTeacherInfoFile(){}

    public void setStudentInfoFile(){
        File file = new File("students.csv");

        try{
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String student = sc.nextLine();
                this.setStudentIntoListFromFile(student);
            }
        }catch (Exception e){
            println(e.getMessage());
        }

    }

    protected void setStudentIntoListFromFile(String student){

        String name = student.split(",")[0];
        String gender = student.split(",")[1];
        int age = Integer.parseInt(student.split(",")[2]);
        String phone = student.split(",")[3];
        String address = student.split(",")[4];
        int id = Integer.parseInt(student.split(",")[5]);
        String email = student.split(",")[6];
        String department = student.split(",")[7];
        int batch = Integer.parseInt(student.split(",")[8]);
        double cgpa = Double.parseDouble(student.split(",")[9]);

        Student newStudent = new Student(name,gender,age,phone,address,id,email,department,batch,cgpa);

        this.students.add(newStudent);
    }
    public void getTeacherInfoFile(){}
}
