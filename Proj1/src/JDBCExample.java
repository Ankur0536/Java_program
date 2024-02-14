import java.sql.*;
import java.util.Scanner;

public class JDBCExample {
    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:/home/ankurpudale/java/database");
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery("select * from department");
            System.out.println("department");
            while(rs.next()) {
                int id = rs.getInt("deptid");
                String dept = rs.getString("deptname");
                System.out.print("Id =" + id);
                System.out.println("   Department =" + dept);
            }

            ResultSet rs1= st.executeQuery("select * from student");
            System.out.println("Student");
            while(rs1.next()) {
                int id = rs1.getInt("studId");
                String name = rs1.getString("studName");
                int id1= rs1.getInt("deptid");
                System.out.print("Id =" + id);
                System.out.print("   Name =" + name);
                System.out.println("  Department id= "+id1);
            }

//            PreparedStatement prst=con.prepareStatement("select * from department where deptid=?");

//            System.out.print("Enter id=");
//            int id1= sc.nextInt();
//            prst.setInt(1,id1);
//            ResultSet rs2= prst.executeQuery();
//            while(rs2.next()) {
//                int id = rs2.getInt("deptid");
//                String dept = rs2.getString("deptname");
//                System.out.print("Id =" + id);
//                System.out.println("   Department =" + dept);
//            }

//            PreparedStatement prst1=con.prepareStatement("insert into student (studName,deptid) values(?,?)");
//            System.out.print("Enter id=");
//            int id2= sc.nextInt();
//            System.out.print("Enter name=");
//            String str= sc.next();
//            prst1.setInt(2,id2);
//            prst1.setString(1,str);
//            prst1.executeUpdate();
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
