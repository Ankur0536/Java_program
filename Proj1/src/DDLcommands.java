import java.sql.*;
//In that program implement DDL command to crate databse;
public class DDLcommands {
    public static void main(String[] args) throws RuntimeException {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:/home/ankurpudale/java/database");
            Statement st = con.createStatement();
//            int i = st.executeUpdate("create table dept(deptId integer,deptName String)");
//            st.executeUpdate("drop table employee");
 //          int i= st.executeUpdate("create table employee(empId integer primary key AUTOINCREMENT,fname String not null,lname String not null, deptId integer not null,designation String not null,salary float not null,YoP integer not null,foreign key (deptId) references dept(deptId))");

            PreparedStatement prst=con.prepareStatement("select * from employee");
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
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
