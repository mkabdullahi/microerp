// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.habibu.model;

import com.habibu.model.PurchaseOrder;
import com.habibu.model.PurchaseOrder_Roo_Jaxb_Entity;
import javax.xml.bind.annotation.XmlTransient;

privileged aspect PurchaseOrder_Roo_Jaxb_Entity {
    
    /*
     * This Aspect takes the lower precedence
     */
    declare precedence: *, PurchaseOrder_Roo_Jaxb_Entity;
    
    declare @method: public Long PurchaseOrder.getId(): @XmlTransient;
    
}
