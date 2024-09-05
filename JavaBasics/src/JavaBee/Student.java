package JavaBee;

public class Student {

	private String studentName;
	private int studentId;
	private boolean isPostGraduate;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public boolean isPostGraduate() {
		return isPostGraduate;
	}
	public void setPostGraduate(boolean isPostGraduate) {
		this.isPostGraduate = isPostGraduate;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", isPostGraduate=" + isPostGraduate
				+ "]";
	}
	
	
}
