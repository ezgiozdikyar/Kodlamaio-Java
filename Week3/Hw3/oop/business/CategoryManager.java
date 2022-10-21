package oop.business;

import oop.core.logging.Logger;
import oop.dataAccess.CategoryDao;
import oop.entities.Category;

import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private List<Category> categories;
    private List<Logger> loggers;

    public CategoryManager(CategoryDao categoryDao, List<Category> categories, List<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.categories = categories;
        this.loggers = loggers;
    }

    public void add(Category newCategory) throws Exception {
        for (Category category: categories) {
            if(category.getCategoryName() == newCategory.getCategoryName())
                throw new Exception("This category name already exists!");
        }
        for (Logger logger: loggers) {
            logger.log(newCategory.getCategoryName());
        }
        categoryDao.add(newCategory);
        categories.add(newCategory);

    }
}
