package oop.business;

import oop.core.logging.Logger;
import oop.dataAccess.InstructorDao;
import oop.entities.Instructor;

import java.util.List;

public class InstructorManager {
    private InstructorDao instructorDao;
    private List<Instructor> instructors;
    private List<Logger> loggers;

    public InstructorManager(InstructorDao instructorDao, List<Instructor> instructors, List<Logger> loggers) {
        this.instructorDao = instructorDao;
        this.instructors = instructors;
        this.loggers = loggers;
    }
    public void add(Instructor instructor){
        instructorDao.add(instructor);
        instructors.add(instructor);
        for (Logger logger:loggers) {
            logger.log(instructor.getInstructorName());
        }
    }
}
