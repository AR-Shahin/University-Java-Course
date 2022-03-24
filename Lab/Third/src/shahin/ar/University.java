package shahin.ar;

import helper.Helper;

import java.util.ArrayList;


public class University extends Helper {

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


    public ArrayList<Teacher> findTeacherByRank(String rank){
        ArrayList<Teacher> temp = new ArrayList<>();
        for (Teacher teacher : this.teachers){
            if(teacher.getRank() == rank){
                temp.add(teacher);
            }
        }
        return temp;
    }

    public Teacher findTeacherByRank(String rank,String flag){
        ArrayList<Teacher> temp = new ArrayList<>();
        temp = this.findTeacherByRank(rank);
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
    // Task baki ache second max salary
//    public Teacher findSecondTeacherSalaryByRank(String rank,String flag){
//
//        Teacher tempTeacher, secondTeacher;
//
//        tempTeacher = this.findTeacherByRank(rank);
//        secondTeacher = tempTeacher;
//        double max = tempTeacher.getSalary();
//        for (Teacher teacher : this.teachers){
//            if(teacher.getSalary() > max && teacher != tempTeacher){
//                max = teacher.getSalary();
//                secondTeacher = teacher;
//            }
//        }
//
//        return secondTeacher;
//    }

}
