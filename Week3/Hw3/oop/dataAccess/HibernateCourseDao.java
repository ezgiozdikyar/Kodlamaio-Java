package oop.dataAccess;

import oop.entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Added course using Hibernate.");
    }
}
