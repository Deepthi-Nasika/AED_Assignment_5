/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import model.Business.Business;
import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomerProfile;
import model.MarketingManagement.MarketingPersonDirectory;
import model.MarketingManagement.MarketingPersonProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.EmployeeDirectory;
import model.Personnel.EmployeeProfile;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.Personnel.Profile;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.SalesManagement.SalesPersonDirectory;
import model.SalesManagement.SalesPersonProfile;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class ConfigureABusiness {

  public static Business initialize() {
    Business business = new Business("Xerox");
    
    // Create Users
    UserAccountDirectory userAccountDirectory = business.getUserAccountDirectory();
    Person p1 = business.getPersonDirectory().newPerson("User1");
    EmployeeProfile emp1 = new EmployeeProfile(p1);
    userAccountDirectory.newUserAccount(emp1, "user1", "1234");
    
    
    Person p2 = business.getPersonDirectory().newPerson("User2");
    EmployeeProfile emp2 = new EmployeeProfile(p2);
    userAccountDirectory.newUserAccount(emp2, "user2", "12345");
    
    
    // Create Suppliers
    SupplierDirectory supplierDirectory = business.getSupplierDirectory();
    for(int i=0; i<5; i++){
        Supplier supplier = supplierDirectory.newSupplier("Supplier " + i);
        // For each supplier
        for(int j=0; i<10; j++){
            // Create products
            Product product = supplier.getProductCatalog().newProduct("Product " + j, 90 + j*10, 100 + j*10, 110 + j*10);
            // Create customers
            Person person = business.getPersonDirectory().newPerson("Customer " + j);
            CustomerProfile cp = business.getCustomerDirectory().newCustomerProfile(person);
            
            for(int k=0; k<10; k++){
                Order order = business.getMasterOrderList().newOrder(cp);
                int actual_price = 50 + (int)(Math.random() * ((100 - 200) + 1));
                order.newOrderItem(product, actual_price, k+2);
            }
            
        }
    }

    return business;
  }
}
