package differentScopes;

public class Student {
	private int studentId;
	private String studentname;
	private String studentaddress;
	
	public Student() {
		super();
     System.out.println("Student class consructor");
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname=" + studentname + ", studentaddress=" + studentaddress
				+ "]";
	}
	
	

}
