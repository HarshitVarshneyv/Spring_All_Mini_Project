package MvcSearch.Controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {

	private String name;
	private String email;
	private String gender;
	/*Not able to know that why date is giving an error 
	 * @DateTimeFormat(pattern = "yyyy-MM-dd") private Date dob;
	 */
	private List<String> courses[];
	private String studentType;
	
	//Address contains multiple field.It is a custom type.
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	/*
	 * public Date getDob() { return dob; } public void setDob(Date dob) { this.dob
	 * = dob; }
	 */	public List<String>[] getCourses() {
		return courses;
	}
	public void setCourses(List<String>[] courses) {
		this.courses = courses;
	}
	public String getStudentType() {
		return studentType;
	}
	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", gender=" + gender + ", courses="
				+ Arrays.toString(courses) + ", studentType=" + studentType + ", address=" + address + "]";
	}
	
	
	
}
