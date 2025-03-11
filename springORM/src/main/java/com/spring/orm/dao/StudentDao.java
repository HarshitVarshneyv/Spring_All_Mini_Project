package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
    private HibernateTemplate hiber;
	public int insert(Student student) {
		//insert
		Integer i=(Integer)this.hiber.save(student);//this cannot be typecast so we use wrapper class integer;
		return i;
	}
	public HibernateTemplate getHiber() {
		return hiber;
	}
	public void setHiber(HibernateTemplate hiber) {
		this.hiber = hiber;
	}

}