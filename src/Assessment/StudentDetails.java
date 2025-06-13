package Assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

public class StudentDetails{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        students.add(new Student("rahul lodhi singh",101,"cse"));
        students.add(new Student("prakhar singh",102,"it"));
        students.add(new Student("tushar",103,"ai"));

        while(true) {
            System.out.println("1. Enter New Student details");
            System.out.println("2. Search Student details");
            System.out.println("3. Delete Student details");
            System.out.println("4. View All Student details");
            System.out.println("5. Sort Student details");
            System.out.println("6. Exit");

            System.out.println("Enter your choice b/w 1-5");
            int choice = sc.nextInt();

            if(choice==1) {
                System.out.println("Enter new students details you want to add:");
                sc.nextLine();
                String name = sc.nextLine();
                int id = sc.nextInt(); sc.nextLine();
                String domain = sc.nextLine();
                students.add(new Student(name,id,domain));
            }
            else if(choice==2) {
                System.out.println("Enter id by you want to search a student:");
                int studentId = sc.nextInt();

                for(Student st: students) {
                    if(st.getId()==studentId) {
                        System.out.println(st);
                        break;
                    }
                }
            }
            else if(choice==3) {
                System.out.println("Enter id by you want to delete a student:");
                int stId = sc.nextInt();

                for(Student st: students) {
                    if(st.getId()==stId) {
                        students.remove(st);
                        System.out.println("Student details are deleted..");
                        break;
                    }
                }
            }
            else if(choice==4) {
                System.out.println("View all Student:");

                for(Student st: students) {
                    System.out.println(st);
                }
            }
            else if(choice==5) {
                System.out.println("Sort by what: ");
                System.out.println("a. First-name: ");
                System.out.println("b. Second-name: ");
                System.out.println("c. id: ");
                System.out.println("d. domain: ");

                char ch = sc.next().charAt(0);

                if(ch=='a') {
                    System.out.println("Sort by first-name");
//					Collections.sort(students, new SortByFirstName()); //1. Traditional way - implements Comparator

//                    Collections.sort(list<Object>); -> Object which implements Comparable interface

                    Collections.sort(students, new Comparator<Student>(){ //2. Anonymous-class
                        @Override
                        public int compare(Student s1, Student s2) {
                            String s1name = s1.getName();
                            String s2name = s2.getName();
                            StringTokenizer s1token = new StringTokenizer(s1name, " ");
                            StringTokenizer s2token = new StringTokenizer(s2name, " ");

                            String s1FirstName = s1token.nextToken();
                            String s2FirstName = s2token.nextToken();

                            return s1FirstName.compareTo(s2FirstName); //compareTo() belong to "String" class -> already define logic.
                            //instead of compareTo(), we can use if-else statements as well.
                        }
                    });

//					Collections.sort(students,(s1,s2)->{ //3. Lambda exp.
//						String s1name = s1.getName();
//						String s2name = s2.getName();
//						StringTokenizer s1token = new StringTokenizer(s1name, " ");
//						StringTokenizer s2token = new StringTokenizer(s2name, " ");
//
//						String s1FirstName = s1token.nextToken();
//						String s2FirstName = s2token.nextToken();
//
//						return s1FirstName.compareTo(s2FirstName);
//					});

                    System.out.println("View all Student after sorting:");

                    for(Student st: students) {
                        System.out.println(st);
                    }
                }
                else if(ch=='b') {
                    System.out.println("Sort by second-name");
//					Collections.sort(students, new SortBySecondName()); //1. Traditional way - implements Comparator

                    Collections.sort(students, new Comparator<Student>(){ //2. Anonymous-class
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
                    });


//					Collections.sort(students,(s1,s2)->{ //3. Lambda exp.
//						String s1name = s1.getName();
//						String s2name = s2.getName();
//						StringTokenizer s1token = new StringTokenizer(s1name, " ");
//						StringTokenizer s2token = new StringTokenizer(s2name, " ");
//
//						String s1SecName = "";
//						int cnt=0;
//						while(s1token.hasMoreTokens()) {
//							if(cnt==2) {
//								break;
//							}
//							s1SecName = s1token.nextToken();
//							cnt++;
//						}
//
//						String s2SecName = "";
//						cnt=0;
//						while(s2token.hasMoreTokens()) {
//							if(cnt==2) {
//								break;
//							}
//							s2SecName = s2token.nextToken();
//							cnt++;
//						}
//
//						return s1SecName.compareTo(s2SecName);
//					});

                    System.out.println("View all Student after sorting:");

                    for(Student st: students) {
                        System.out.println(st);
                    }
                }
                else if(ch=='c') {
                    System.out.println("Sort by id");

//					Collections.sort(students, new SortById()); //1. Traditional way - via implements Comparator

                    Collections.sort(students, new Comparator<Student>(){ //2. Anonymous-class
                        @Override
                        public int compare(Student s1, Student s2) {
                            return ((Integer)s1.getId()).compareTo((Integer)s2.getId());
                        }
                    });

//					Collections.sort(students,(s1,s2)->{ //3. Lambda exp.
//						return ((Integer)s1.getId()).compareTo((Integer)s2.getId());
//					});

                    System.out.println("View all Student after sorting:");

                    for(Student st: students) {
                        System.out.println(st);
                    }
                }
                else if(ch=='d') {
                    System.out.println("Sort by domain");
//					Collections.sort(students, new SortByDomain()); //1. Traditional way - via implements Comparator

                    Collections.sort(students, new Comparator<Student>(){ //2. Anonymous-class
                        @Override
                        public int compare(Student s1, Student s2) {
                            return s1.getDomain().compareTo(s2.getDomain());
                        }
                    });

//					Collections.sort(students,(s1,s2)->{ //3. Lambda exp.
//						return s1.getDomain().compareTo(s2.getDomain());
//					});


                    System.out.println("View all Student after sorting:");

                    for(Student st: students) {
                        System.out.println(st);
                    }
                }
            }
            else if(choice==6) {
                System.out.println("Exit..");
                break;
            }
        }

    }

}

//class SortByFirstName implements Comparator<Student>{
//	@Override
//	public int compare(Student s1, Student s2) {
//		String s1name = s1.getName();
//		String s2name = s2.getName();
//		StringTokenizer s1token = new StringTokenizer(s1name, " ");
//		StringTokenizer s2token = new StringTokenizer(s2name, " ");
//
//		String s1FirstName = s1token.nextToken();
//		String s2FirstName = s2token.nextToken();
//
//		return s1FirstName.compareTo(s2FirstName);
//	}
//}
//

//class SortBySecondName implements Comparator<Student>{
//	@Override
//	public int compare(Student s1, Student s2) {
//		String s1name = s1.getName();
//		String s2name = s2.getName();
//		StringTokenizer s1token = new StringTokenizer(s1name, " ");
//		StringTokenizer s2token = new StringTokenizer(s2name, " ");
//
//		String s1SecName = "";
//		int cnt=0;
//		while(s1token.hasMoreTokens()) {
//			if(cnt==2) {
//				break;
//			}
//			s1SecName = s1token.nextToken();
//			cnt++;
//		}
//
//		String s2SecName = "";
//		cnt=0;
//		while(s2token.hasMoreTokens()) {
//			if(cnt==2) {
//				break;
//			}
//			s2SecName = s2token.nextToken();
//			cnt++;
//		}
//
//		return s1SecName.compareTo(s2SecName);
//	}
//}
//

//class SortById implements Comparator<Student>{
//	@Override
//	public int compare(Student s1, Student s2){
//		return ((Integer)s1.getId()).compareTo((Integer)s2.getId());
//	}
//}
//

//class SortByDomain implements Comparator<Student>{
//	@Override
//	public int compare(Student s1, Student s2) {
//		return s1.getDomain().compareTo(s2.getDomain());
//	}
//}

@Data
@AllArgsConstructor
@ToString
class Student{
    private String name;
    private int id;
    private String domain;


//	public Student(String name, int id, String domain) {
//		super();
//		this.name = name;
//		this.id = id;
//		this.domain = domain;
//	}


//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public int getId() {
//		return id;
//	}
//
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//
//	public String getDomain() {
//		return domain;
//	}
//
//
//	public void setDomain(String domain) {
//		this.domain = domain;
//	}

//	public String toString(){
//		return getName() + " " + getId() + " " + getDomain();
//	}
}

