package entityServiceTest;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import entityTest.Student;

public interface studentServiceTest {
	
//	service interface ထဲမှာကတော့ database ကို အလုပ်လုပ်ဖို့ query တွေအတွက် ဘုံ java method တွေရေးလေ့ရှိတယ်
//	သို့သော် အလုပ်လုပ်ဖို့ method တွေကိုတော့ serviceImplementation ထဲမှာပဲ override ရေးတယ်
//	get() method ကိုခေါ်လိုက်တာနဲ့ student table တွေထဲက student တွေကို console မှာရိုက်ပြချင်တယ်ဆိုရင် return type က Object အနေနဲ့ပြန်မယ်
	public List<Student> get(Connection con) throws SQLException;
	public Student insertStudent(Connection con, int id, String name, String gender) throws SQLException;
	public boolean deleteByID(Connection con, int id) throws SQLException;
	public List<Student> countGender(Connection con) throws SQLException;
//	အောက်မှာ gender မပါတဲ့ studentList View တစ်ခုဆောက်မယ်
	public List<Student> createView(Connection con) throws SQLException;

}
