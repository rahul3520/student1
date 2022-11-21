import java.util.ArrayList;
import java.util.Scanner;

public class student {

    String name;
    int adminNo;
    String collegeName;
    int rollNo;

    public student(String name, int adminNo, String collegeName, int rollNo) {
        this.name = name;
        this.adminNo = adminNo;
        this.collegeName = collegeName;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(int adminNo) {
        this.adminNo = adminNo;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {

        ArrayList<student> studnt=new ArrayList<student>();


        int exit =0;
        while(exit!=1)
        {
            System.out.println("1:add student\n2:list student\n3:search student\n4:delete student\n5:exit");
            System.out.println("Enter your choice:");

            Scanner sc=new Scanner(System.in);
            int ch= sc.nextInt();


            switch (ch)
            {
                case 1:
                    System.out.println("add student");

                    System.out.println("Enter student name:");
                    String str=new String();
                    Scanner sc1=new Scanner(System.in);

                    str= sc1.nextLine();

                    System.out.println("Enter student admission no:");
                    Scanner sc2=new Scanner(System.in);

                    int num= sc2.nextInt();


                    System.out.println("Enter college name:");
                    String str1=new String();
                    Scanner sc3=new Scanner(System.in);

                    str1= sc3.nextLine();

                    System.out.println("Enter student roll no:");
                    Scanner sc4=new Scanner(System.in);

                    int num1= sc4.nextInt();


                    student s1=new student(str,num,str1,num1);
                    studnt.add(s1);

                    break;

                case 2:
                    System.out.println("list students");

                    for(student st1:studnt)
                    {
                        System.out.println(st1.name);
                        System.out.println(st1.adminNo);
                        System.out.println(st1.collegeName);
                        System.out.println(st1.rollNo);
                        System.out.println("\n");

                        //student st2=new student();
                        //studnt.st2.name
                        //st2.get(i)
                    }

                    break;

                case 3:
                    System.out.println("search student with admission no");

                    System.out.println("Enter admission no:");
                    Scanner sc5=new Scanner(System.in);
                    int admin=sc5.nextInt();

                    int flag=0;
                    for (student s2: studnt)
                    {
                        if(admin==s2.adminNo)
                        {
                            flag=1;
                            System.out.println("Student found\n");
                        }
                    }
                    if(flag==0)
                    {
                        System.out.println("Student not found\n");
                    }

                    break;


                case 4:
                    System.out.println("delete student with admission no:");

                    System.out.println("Enter admission no:");
                    Scanner sc6=new Scanner(System.in);
                    int admin1=sc6.nextInt();

                    int flag1=0;
                    for (student s3: studnt)
                    {
                        if(admin1==s3.adminNo)
                        {
                            flag1=1;
                            System.out.println("Student "+s3.name+" deleted\n");

                            studnt.remove(s3);
                        }
                    }
                    if(flag1==0)
                    {
                        System.out.println("Student not found\n");
                    }
                    break;

                case 5:
                    exit=1;
                    break;

                default:
                    System.out.println("wrong choice\n");

            }

            System.out.println("Enter 1 to exit\n0 to continue\n");
            exit=sc.nextInt();
        }

    }
}
