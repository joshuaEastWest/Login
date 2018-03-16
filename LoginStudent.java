package david;

public class Student 
{

    private String name;
    private int age;
    private int year;
    private String studentNum;



    public Student(String name, int age, int year, String studentNum) 
    {

        this.name = name;
        this.age = age;
        this.year = year;
        this.studentNum = studentNum;
    }

    // Setters and getters (Name, Age, Year and Student Number)

    public String getName() // name
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getAge() // age
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getYear() // year
    {
        return year;
    }

    public void setYear(int year) 
    {
        this.year = year;
    }

    public String getstudentNum() // studentNum
    {
    return studentNum;
    }

    public void setstudentNum(String studentNum) 
    {
        this.studentNum = studentNum;
    }

}

package student;

// My Student - G00263842.
// Student information program.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TestStudents 
{

    public static void main(String[] args) throws IOException 
    {

    System.out.println("============" + "=================");
    System.out.println("Students " + "Personal Details");
    System.out.println("============" + "=================");

    String name;
    int age;
    int year;
    String studentNum;

    List<Student> studentsList = new ArrayList<Student>(); 

    for (int i = 0; i < 2; i++) 
    {

    int studentNumber = (i + 1);

    System.out.println("");
    System.out.println("Please enter " + "data for student " + studentNumber);

    InputStreamReader converter = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(converter);

    System.out.println("Enter Student "+ studentNumber + " Name:"); 
    name = in.readLine();

    System.out.println("Enter Student " + studentNumber + " Age (Integer):");
    age = Integer.valueOf(in.readLine());

    System.out.println("Enter Student " + studentNumber + " Year (Integer):");
    year = Integer.valueOf(in.readLine());

    System.out.println("Enter Student " + studentNumber + " Student Number:"); 
    studentNum = in.readLine();

    Student student = new Student(name, age, year, studentNum);

    studentsList.add(student); // add student
    }

    for (int j = 0; j < studentsList.size(); j++)
    {

        Student st = studentsList.get(j);

        System.out.println("Student : " + (j + 1));
        System.out.println("Name: " + st.getName() + " - Age: " + st.getAge() + " - Year: " + st.getYear() + " - Student Number: " + st.getstudentNum());
    }

    }
}
