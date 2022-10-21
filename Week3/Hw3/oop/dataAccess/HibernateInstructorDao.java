package oop.dataAccess;

import oop.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor added using Hibernate.");
    }
}
