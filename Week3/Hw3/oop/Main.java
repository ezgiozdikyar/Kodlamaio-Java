package oop;

import oop.business.CategoryManager;
import oop.business.CourseManager;
import oop.core.logging.DatabaseLogger;
import oop.core.logging.FileLogger;
import oop.core.logging.Logger;
import oop.dataAccess.HibernateCourseDao;
import oop.dataAccess.JdbcCategoryDao;
import oop.entities.Category;
import oop.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        /******************************* Testing Course ************************/

        Course course1 = new Course(1,"Java",50);
        Course course2 = new Course(2,"C#",45);
        Course course3 = new Course(3,"C++",60);

        Logger logger1 = new FileLogger();
        Logger logger2 = new DatabaseLogger();

        List<Course> courses = new ArrayList<Course>();
        List<Logger> loggers = new ArrayList<>();

        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        loggers.add(logger1);
        loggers.add(logger2);

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), courses,loggers);

        // Throws an exception
        // courseManager.add(new Course(4,"Java",60));
        // courseManager.add(new Course(4,"Javascript",-5));

        // Course added successfully.
        courseManager.add(new Course(4,"Javascript",70));

        /******************************* Testing Category ************************/

        Category category1 = new Category(1,"Back-end Development");
        Category category2 = new Category(2,"Front-end Development");
        Category category3 = new Category(2,"UI UX Design");

        List<Category> categories = new ArrayList<>();

        categories.add(category1);
        categories.add(category2);
        categories.add(category3);

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),categories,loggers);
        // Throws an exception
        // categoryManager.add(new Category(1,"Back-end Development"));

        // Category added successfully.
        categoryManager.add(new Category(1,"Full-stack Development"));
    }
}
