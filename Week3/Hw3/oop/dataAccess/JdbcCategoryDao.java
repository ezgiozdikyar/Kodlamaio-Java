package oop.dataAccess;

import oop.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Added category using Jdbc.");
    }
}
