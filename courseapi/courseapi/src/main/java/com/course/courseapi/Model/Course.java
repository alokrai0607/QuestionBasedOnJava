package com.course.courseapi.Model;

public class Course {

	private int courseid;
	private String courseName;
	private String courseDuration;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int courseid, String courseName, String courseDuration) {
		super();
		this.courseid = courseid;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
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
