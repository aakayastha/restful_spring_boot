package com.learn.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {  // is this Singleton class?

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);  // populate each iterable element in the courses arraylist
        return courses;
    }

    public Course getCourse(String id){
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return courseRepository.findById(id).orElse(null);
    }

    public void addCourse(Course course){
        courseRepository.save(course);
    }

    public void updateCourse(Course course){
        courseRepository.save(course);  // can add and update as well
    }

    public void deleteCourse(String id){
//        topics.removeIf(t -> t.getId().equals(id));
        courseRepository.deleteById(id);
    }
}
