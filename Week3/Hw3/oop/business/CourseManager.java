package oop.business;

import oop.core.logging.Logger;
import oop.dataAccess.CourseDao;
import oop.entities.Course;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private List<Course>courses;
    private List<Logger> loggers;

    public CourseManager(CourseDao courseDao, List<Course> courses, List<Logger> loggers) {
        this.courseDao = courseDao;
        this.courses = courses;
        this.loggers = loggers;
    }
    public void add(Course newCourse) throws Exception {
        for (Course course:courses) {
            if(course.getCourseName() == newCourse.getCourseName())
                throw new Exception("This course name already exists!");
        }
        if(newCourse.getPrice() < 0){
            throw new Exception("Course price cannot be less than 0!");
        }
        for (Logger logger: loggers) {
            logger.log(newCourse.getCourseName());
        }
        courseDao.add(newCourse);
        courses.add(newCourse);
    }
}
