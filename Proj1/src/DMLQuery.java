import java.sql.*;
import java.util.Scanner;


public class DMLQuery {
    public static void insert(){
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:/home/ankurpudale/java/database");
            Statement st= con.createStatement();

            PreparedStatement prst1=con.prepareStatement("insert into employee (fname,lname,deptId,designation,salary,YoP) values(?,?,?,?,?,?)");
            System.out.print("Enter first name:");
            String str1=sc.next();
            prst1.setString(1,str1);
            System.out.print("Enter last name:");
            String str2=sc.next();
            prst1.setString(2,str2);
            System.out.print("Enter department id:");
            int did=sc.nextInt();
            prst1.setInt(3,did);
            System.out.print("Enter designation:");
            String str3=sc.next();
            prst1.setString(4,str3);
            System.out.print("Enter salary:");
            float sal=sc.nextFloat();
            prst1.setFloat(5,  sal);
            System.out.print("Enter year of joining:");
            int year=sc.nextInt();
            prst1.setInt(6,year);
            prst1.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void search(){
        Scanner sc=new Scanner(System.in);
        System.out.print("1.All\n2.By Id\n3.By First name\n4.By Last name\n5.Department Id\n6.Designation,\n7.Year of joining\nEnter your choice:");
        int ch=sc.nextInt();
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:/home/ankurpudale/java/database");
            Statement st = con.createStatement();
            PreparedStatement prst=null;
            switch (ch){
                case 1:{
                    prst=con.prepareStatement("select * from employee");
                    break;
                }
                case 2:{
                    System.out.print("Enter employee id: ");
                    prst=con.prepareStatement("select * from employee where employee Id=?");
                    int id=sc.nextInt();
                    prst.setInt(1,id);
                }
                case 3:{
                    System.out.print("Enter employee first name: ");
                    prst=con.prepareStatement("select * from employee where fname=?");
                    String fn=sc.next();
                    prst.setString(1,fn);
                }
                case 4:{
                    System.out.print("Enter employee last name: ");
                    prst=con.prepareStatement("select * from employee where lname=?");
                    String ln=sc.next();
                    prst.setString(1,ln);
                }
                case 5:{
                    System.out.print("Enter employees department id: ");
                    prst=con.prepareStatement("select * from employee where deptId=?");
                    int did=sc.nextInt();
                    prst.setInt(1,did);
                }
                case 6:{
                    System.out.print("Enter employee designation: ");
                    prst=con.prepareStatement("select * from employee where designation=?");
                    String des=sc.next();
                    prst.setString(1,des);
                }
                case 7:{
                    System.out.print("Enter employees Year of joining: ");
                    prst=con.prepareStatement("select * from employee where yoP=?");
                    int year=sc.nextInt();
                    prst.setInt(1,year);
                }
            }
            ResultSet rs2= prst.executeQuery();
            while(rs2.next()) {
                int id = rs2.getInt("empId");
                String fname = rs2.getString("fname");
                String lname = rs2.getString("lname");
                int id1= rs2.getInt("deptId");
                String des= rs2.getString("designation");
                int year=rs2.getInt("YoP");
                float sal=rs2.getFloat("salary");
                System.out.print("Employee Id =" + id);
                System.out.print(",  Emp name =" + fname+" "+lname);
                System.out.print(", Department id="+id1);
                System.out.print(", Designation ="+des);
                System.out.println(", Salary:"+sal+", Year of joining:"+year);
                System.out.println("\n");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        int k=0;
        while(k!=3) {
            System.out.print("1.Insert \n2.Search \n3.Exit\nEnter the choice:");
            Scanner sc = new Scanner(System.in);
            k=sc.nextInt();
            switch(k){
                case 1:insert();
                break;
                case 2:search();
                break;
                case 3:
                    System.out.println("Exit successfully");
                    break;
                default:
                    System.out.println("You entered wrong choice\n\n");
            }
        }
    }
}
