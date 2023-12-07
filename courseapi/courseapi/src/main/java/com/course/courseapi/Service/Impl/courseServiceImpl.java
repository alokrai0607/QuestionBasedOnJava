package com.course.courseapi.Service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.course.courseapi.Model.Course;
import com.course.courseapi.Service.courseService;

@Service
public class courseServiceImpl implements courseService {

	List<Course> list;

	public courseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(1, "Java", "16 month"));
		list.add(new Course(2, "JavaScript", "8 month"));
		list.add(new Course(3, "Kotlin", "6 month"));
		list.add(new Course(4, "Python", "12 month"));
		list.add(new Course(5, "Django", "3 month"));
	}

	@Override
	public List<Course> getAllCources() {

		return list;
	}

	@Override
	public Course getCourseById(int courseid) {
		Course cc = null;

		for (Course course : list) {
			if (course.getCourseid() == courseid) {
				cc = course;
				break;
			}
		}
		return cc;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		list.forEach(e -> {
			if (e.getCourseid() == course.getCourseid()) {
				e.setCourseName(course.getCourseName());
				e.setCourseDuration(course.getCourseDuration());
			}
		});

		return course;
	}

	@Override
	public void deleteCourse(int courseid) {
		list = this.list.stream().filter(e -> e.getCourseid() != courseid).collect(Collectors.toList());

	}

}
