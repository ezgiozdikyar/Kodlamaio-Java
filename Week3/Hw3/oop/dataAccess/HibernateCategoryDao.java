package oop.dataAccess;

import oop.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Added category using Hibernate.");
    }
}
