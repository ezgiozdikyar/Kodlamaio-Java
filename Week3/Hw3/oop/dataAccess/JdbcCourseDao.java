package oop.dataAccess;

import oop.entities.Course;

public class JdbcCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Added course using Jdbc.");
    }
}
