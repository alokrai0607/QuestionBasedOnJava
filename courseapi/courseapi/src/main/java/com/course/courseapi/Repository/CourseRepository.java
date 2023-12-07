package com.course.courseapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.courseapi.Model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
