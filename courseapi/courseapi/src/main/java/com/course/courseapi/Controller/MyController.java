package com.course.courseapi.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.course.courseapi.Model.Course;
import com.course.courseapi.Service.courseService;

@RestController
public class MyController {

	@Autowired
	private courseService courseService;

	@GetMapping("/home")
	public String Home() {
		return "This is my Home page";
	}

	// Get all Courses
	@GetMapping("Courses")
	public List<Course> getAllCourses() {
		return this.courseService.getAllCources();
	}

	// Get Course Particularly with courseID .
	@GetMapping("Courses/{courseid}")
	public Course getCourseById(@PathVariable int courseid) {
		return this.courseService.getCourseById(courseid);
	}

	// Add Entire Object in JSON .
	@PostMapping(path = "/Courses", consumes = "application/json")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}

	// Update Course Using PUT Request
	@PutMapping("Courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}

	// Delete course by ID.
	@DeleteMapping("Courses/{courseid}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable int courseid) {
		try {
			this.courseService.deleteCourse(courseid);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
