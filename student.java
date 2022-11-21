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
            System.out.println("1:add student\n2:list student\n3:search student\n4:delete student\n");
            System.out.println("Enter your choice:");

            Scanner sc=new Scanner(System.in);
            int ch= sc.nextInt();


            switch (ch)
            {
                case 1:
                    System.out.println("add student");

                    break;

                case 2:
                    System.out.println("list student");

                    break;

                case 3:
                    System.out.println("search student");

                    break;


                case 4:
                    System.out.println("delete student");

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
