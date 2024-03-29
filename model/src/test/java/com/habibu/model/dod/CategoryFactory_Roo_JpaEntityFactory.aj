// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.habibu.model.dod;

import com.habibu.model.Category;
import com.habibu.model.dod.CategoryFactory;
import java.util.Calendar;
import java.util.GregorianCalendar;

privileged aspect CategoryFactory_Roo_JpaEntityFactory {
    
    /**
     * Creates a new {@link Category} with the given index.
     * 
     * @param index position of the Category
     * @return a new transient Category
     */
    public Category CategoryFactory.create(int index) {
        Category obj = new Category();
        setCreatedBy(obj, index);
        setCreatedDate(obj, index);
        setDescription(obj, index);
        setModifiedBy(obj, index);
        setModifiedDate(obj, index);
        setName(obj, index);
        return obj;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param obj
     * @param index
     */
    public void CategoryFactory.setCreatedBy(Category obj, int index) {
        String createdBy = "createdBy_" + index;
        obj.setCreatedBy(createdBy);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param obj
     * @param index
     */
    public void CategoryFactory.setCreatedDate(Category obj, int index) {
        Calendar createdDate = Calendar.getInstance();
        obj.setCreatedDate(createdDate);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param obj
     * @param index
     */
    public void CategoryFactory.setDescription(Category obj, int index) {
        String description = "description_" + index;
        obj.setDescription(description);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param obj
     * @param index
     */
    public void CategoryFactory.setModifiedBy(Category obj, int index) {
        String modifiedBy = "modifiedBy_" + index;
        obj.setModifiedBy(modifiedBy);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param obj
     * @param index
     */
    public void CategoryFactory.setModifiedDate(Category obj, int index) {
        Calendar modifiedDate = Calendar.getInstance();
        obj.setModifiedDate(modifiedDate);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param obj
     * @param index
     */
    public void CategoryFactory.setName(Category obj, int index) {
        String name = "name_" + index;
        obj.setName(name);
    }
    
}
