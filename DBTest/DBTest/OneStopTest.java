package DBTest;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entiryServiceImplTest.studentServiceImplTest;
import entityServiceTest.studentServiceTest;
import entityTest.Student;

public class OneStopTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		getConnection() method ကိုခေါ်လိုက်တော့ throws ထားတာတွေရှိလို့ ခေါ်လိုက်တဲ့ main method မှာလည်း ပြန် throw ပေးရတယ်
		Connection con = ConnectorTest.getConnection();
		
		// For Student
		studentServiceTest stuService = new studentServiceImplTest();
		
		// For Score
		
		
		// For Subject
		
		
//		DML for Student
		System.out.println("--- Select * from student ---");
		List<Student> students = stuService.get(con);
		students.stream().forEach(System.out::println);
		
		System.out.println("\n--- select count(*), gender from student group by gender ---");
		List<Student> countGender = stuService.countGender(con);
		countGender.stream().forEach(System.out::println);
		
//		DDL for Student
//		System.out.println("\n--- delete from student where studentNumber = 6726 ---");
//		stuService.deleteByID(con, 6726);
		
//		System.out.println("\n--- insert into student values (6726, 'Thet Zaw Hein', 'Male') ---");
//		System.out.println(stuService.insertStudent(con, 6726, "Thet Zaw Hein", "Male"));
		
	}

}
