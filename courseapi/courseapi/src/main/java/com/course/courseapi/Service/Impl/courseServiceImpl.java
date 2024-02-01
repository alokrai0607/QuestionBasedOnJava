package com.course.courseapi.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.courseapi.Model.Course;
import com.course.courseapi.Repository.CourseRepository;
import com.course.courseapi.Service.courseService;

@Service
public class courseServiceImpl implements courseService {

	@Autowired
	private CourseRepository courserepository;

	public courseServiceImpl() {}

	@Override
	public List<Course> getAllCources() {
		return courserepository.findAll();
	}

	@Override
	public Course getCourseById(Integer courseid) {
		return courserepository.getReferenceById(courseid);
	}

	@Override
	public Course addCourse(Course course) {
		courserepository.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courserepository.save(course);
		return course;
	}

	@Override
	public void deleteCourse(Integer courseid) {
		Course entity = courserepository.getReferenceById(courseid);
		courserepository.delete(entity);
	}

}
