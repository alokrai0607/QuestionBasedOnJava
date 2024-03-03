package com.course.courseapi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	private Integer courseid;
	private String courseName;
	private String courseDuration;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(Integer courseid, String courseName, String courseDuration) {
		super();
		this.courseid = courseid;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
	}

	public Integer getCourseid() {
		return courseid;
	}

	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", courseName=" + courseName + ", courseDuration=" + courseDuration
				+ "]";
	}

}
