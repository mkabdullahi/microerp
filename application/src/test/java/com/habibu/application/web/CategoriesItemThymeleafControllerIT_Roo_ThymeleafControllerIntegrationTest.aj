// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.habibu.application.web;

import com.habibu.application.web.CategoriesItemThymeleafControllerIT;
import com.habibu.model.dod.CategoryFactory;
import com.habibu.service.api.CategoryService;
import com.habibu.service.api.ProductService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

privileged aspect CategoriesItemThymeleafControllerIT_Roo_ThymeleafControllerIntegrationTest {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @Autowired
    public MockMvc CategoriesItemThymeleafControllerIT.mvc;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @MockBean
    public CategoryService CategoriesItemThymeleafControllerIT.categoryServiceService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @MockBean
    public ProductService CategoriesItemThymeleafControllerIT.productServiceService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public CategoryFactory CategoriesItemThymeleafControllerIT.factory = new CategoryFactory();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MockMvc
     */
    public MockMvc CategoriesItemThymeleafControllerIT.getMvc() {
        return mvc;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return CategoryService
     */
    public CategoryService CategoriesItemThymeleafControllerIT.getCategoryServiceService() {
        return categoryServiceService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ProductService
     */
    public ProductService CategoriesItemThymeleafControllerIT.getProductServiceService() {
        return productServiceService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return CategoryFactory
     */
    public CategoryFactory CategoriesItemThymeleafControllerIT.getFactory() {
        return factory;
    }
    
    /**
     * Test method example. To be implemented by developer.
     * 
     */
    @Test
    public void CategoriesItemThymeleafControllerIT.testMethodExample() {
        // Setup
        // Previous tasks
        
        // Exercise
        // Execute method to test
        
        // Verify
        // Check results with assertions
    }
    
}
