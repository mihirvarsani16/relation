package com.relation.relation.controller.onetomany;

import com.relation.relation.entity.onetomany.Course;
import com.relation.relation.entity.onetomany.Student;
import com.relation.relation.repository.onetomany.CourseRepository;
import com.relation.relation.repository.onetomany.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneToManyController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @PostMapping("/addstudent")
    public Student add(@RequestBody Student student) {

        return this.studentRepository.save(student);
    }

    @PostMapping("/addcourse/{id}")
    public Course addCourse(@RequestBody Course course, @PathVariable int id) {

        Student student = this.studentRepository.findById(id).get();

        course.setStudent(student);
        student.getCourse().add(course);

        this.studentRepository.save(student);

        return course;
    }

    @GetMapping("/student/{id}")
    public Student getstudent(@PathVariable int id) {

        Student student = this.studentRepository.findById(id).get();

        return student;
    }

    @GetMapping("/course/{id}")
    public Course getCourse(@PathVariable int id) {

        return this.courseRepository.findByCid(id);
    }

}
