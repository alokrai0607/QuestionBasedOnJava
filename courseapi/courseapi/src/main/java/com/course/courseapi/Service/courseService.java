package com.course.courseapi.Service;

import java.util.List;

import com.course.courseapi.Model.Course;

public interface courseService {

	public List<Course> getAllCources();

	public Course getCourseById(Integer courseid);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(Integer courseid);

}
