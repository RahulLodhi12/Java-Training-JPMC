package Assessment_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDetails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        students.add(new Student("rahul lodhi singh",101,"cse"));
        students.add(new Student("prakhar singh",102,"it"));
        students.add(new Student("tushar",103,"ai"));

        while(true){
            System.out.println("1. Enter New Student details");
            System.out.println("2. Search Student details by id");
            System.out.println("3. Delete Student details by id");
            System.out.println("4. View All Student details");
            System.out.println("5. Sort Student details");
            System.out.println("6. Exit");
            System.out.println("Pick a number b/w 1-6:");
            int choice = sc.nextInt(); sc.nextLine();
            if(choice==1){
                System.out.println("Enter New student details you want to add:");

                String name = sc.nextLine();
                int id = sc.nextInt(); sc.nextLine();
                String domain = sc.nextLine();
                students.add(new Student(name,id,domain));
            }
            else if(choice==2){
                System.out.println("Enter id by you want to search a student:");
                int studentId = sc.nextInt();

                for(Student st: students) {
                    if(st.getId()==studentId) {
                        System.out.println(st);
                        break;
                    }
                }
            }
            else if(choice==3){
                System.out.println("Enter id by you want to delete a student:");
                int stId = sc.nextInt();

                for(int i=0;i<students.size();i++) {
                    if(students.get(i).getId()==stId) {
                        students.remove(i);
                        System.out.println("Student details are deleted..");
                        break;
                    }
                }
            }
            else if(choice==4){
                System.out.println("View all Student:");

                for(Student st: students) {
                    System.out.println(st);
                }
            }
            else if(choice==5){
                System.out.println("Sort by What ?");
                System.out.println("a. First Name");
                System.out.println("b. Second Name");
                System.out.println("c. id");
                System.out.println("d. domain");

                char ch = sc.next().charAt(0);
                if(ch=='a'){
                    System.out.println("Sort by first-name");
                    Collections.sort(students, new SortByFirstName());

                    System.out.println("View all Student after sorting:");
                    for(Student st: students) {
                        System.out.println(st);
                    }
                }
                else if(ch=='b'){
                    System.out.println("Sort by second-name");
                    Collections.sort(students, new SortBySecondName());

                    System.out.println("View all Student after sorting:");

                    for(Student st: students) {
                        System.out.println(st);
                    }
                }
                else if(ch=='c'){
                    System.out.println("Sort by id");
                    Collections.sort(students, new SortById());

                    System.out.println("View all Student after sorting:");

                    for(Student st: students) {
                        System.out.println(st);
                    }
                }
                else if(ch=='d'){
                    System.out.println("Sort by domain");
                    Collections.sort(students, new SortByDomain());

                    System.out.println("View all Student after sorting:");

                    for(Student st: students) {
                        System.out.println(st);
                    }
                }
            }
            else if(choice==6){
                System.out.println("Exit..");
                break;
            }
        }

    }

}

class SortByFirstName implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        String s1name = s1.getName();
        String s2name = s2.getName();
        StringTokenizer s1token = new StringTokenizer(s1name, " ");
        StringTokenizer s2token = new StringTokenizer(s2name, " ");

        String s1FirstName = s1token.nextToken();
        String s2FirstName = s2token.nextToken();

        return s1FirstName.compareTo(s2FirstName);
    }
}

class SortBySecondName implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        String s1name = s1.getName();
        String s2name = s2.getName();
        StringTokenizer s1token = new StringTokenizer(s1name, " ");
        StringTokenizer s2token = new StringTokenizer(s2name, " ");

        String s1SecName = "";
        int cnt=0;
        while(s1token.hasMoreTokens()) {
            if(cnt==2) {
                break;
            }
            s1SecName = s1token.nextToken();
            cnt++;
        }

        String s2SecName = "";
        cnt=0;
        while(s2token.hasMoreTokens()) {
            if(cnt==2) {
                break;
            }
            s2SecName = s2token.nextToken();
            cnt++;
        }

        return s1SecName.compareTo(s2SecName);
    }
}

class SortById implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        return ((Integer)s1.getId()).compareTo((Integer)s2.getId());
    }
}

class SortByDomain implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getDomain().compareTo(s2.getDomain());
    }
}

class Student{
    private String name;
    private int id;
    private String domain;


    public Student(String name, int id, String domain) {
        super();
        this.name = name;
        this.id = id;
        this.domain = domain;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getDomain() {
        return domain;
    }


    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String toString(){
        return getName() + " " + getId() + " " + getDomain();
    }
}

