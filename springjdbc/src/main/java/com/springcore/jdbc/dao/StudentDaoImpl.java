package com.springcore.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

import com.springcore.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		/* insert query */
        String query="insert into student(id,name,city) values(?,?,?)";
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}

	@Override
	public int change(Student student) {
		// TODO Auto-generated method stub
		/* updating data */
		String query="Update student set name=?,city=? WHERE id=?" ;
        int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		/* Deleting data */
		String query="Delete FROM student WHERE id=? ";
		int r = this.jdbcTemplate.update(query, id);
		return r;
	}
	
	@Override
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
       //  Selecting Single student data
		String query="Select * From student WHERE id=?";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return student;
	}
	@Override
	public List<Student> getAllStudents() {
		// Selecting multiple students
		String query="Select * FROM student";
		List<Student> student=this.jdbcTemplate.query(query,new RowMapperImpl());
		return student;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
