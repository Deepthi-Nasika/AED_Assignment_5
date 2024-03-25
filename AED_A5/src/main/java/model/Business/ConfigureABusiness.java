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
 * @author nasik
 */
public class ConfigureABusiness {

  public static Business initialize() {
    Business business = new Business("Stationary");
    
    // Create Directory
    SupplierDirectory suplierdirectory = business.getSupplierDirectory();
    PersonDirectory persondirectory = business.getPersonDirectory();
    SalesPersonDirectory salesPersonDirectory = business.getSalesPersonDirectory();
    CustomerDirectory customerDirectory = business.getCustomerDirectory();
    UserAccountDirectory userAccountDirectory = business.getUserAccountDirectory();
    MasterOrderList masterorderlist = business.getMasterOrderList();
    
    // Create Suppliers
    Supplier supplier1 = suplierdirectory.newSupplier("Apsara");
    
    // Create Products
    ProductCatalog productcatalog = supplier1.getProductCatalog();
    Product p1 = productcatalog.newProduct("Pen", 1000, 5000, 2000);
    Product p2 = productcatalog.newProduct("Pencil", 500, 3000, 1500);
    Product p3 = productcatalog.newProduct("Notebook", 2000, 8000, 4000);
    Product p4 = productcatalog.newProduct("Eraser", 300, 1500, 750);
    Product p5 = productcatalog.newProduct("Ruler", 400, 2000, 1000);
    Product p6 = productcatalog.newProduct("Highlighter", 800, 4000, 2000);
    Product p7 = productcatalog.newProduct("Marker", 1200, 6000, 3000);
    Product p8 = productcatalog.newProduct("Stapler", 1500, 7000, 3500);
    Product p9 = productcatalog.newProduct("Scissors", 1000, 5000, 2500);
    Product p10 = productcatalog.newProduct("Glue Stick", 600, 3000, 1500);
    
    
    
    // Create Sales_Person
    Person salesperson1 = persondirectory.newPerson("SalesPerson1");
    Person salesperson2 = persondirectory.newPerson("SalesPerson2");
    
    SalesPersonProfile sp1 = salesPersonDirectory.newSalesPersonProfile(salesperson1); 
    SalesPersonProfile sp2 = salesPersonDirectory.newSalesPersonProfile(salesperson2);
    
    // Create User Accounts
    UserAccount userAccount1 = userAccountDirectory.newUserAccount(sp1, "user1", "pass1");
    UserAccount userAccount2 = userAccountDirectory.newUserAccount(sp2, "user2", "pass2");
    
    // Create Customers
    Person customer1 = persondirectory.newPerson("Customer1");
    Person customer2 = persondirectory.newPerson("Customer2");
    Person customer3 = persondirectory.newPerson("Customer3");
    Person customer4 = persondirectory.newPerson("Customer4");
    Person customer5 = persondirectory.newPerson("Customer5");
    
    CustomerProfile cp1 = customerDirectory.newCustomerProfile(customer1);
    CustomerProfile cp2 = customerDirectory.newCustomerProfile(customer2);
    CustomerProfile cp3 = customerDirectory.newCustomerProfile(customer3);
    CustomerProfile cp4 = customerDirectory.newCustomerProfile(customer4);
    CustomerProfile cp5 = customerDirectory.newCustomerProfile(customer5);
    
    // Process Orders on behalf of sales person and customer
    // Order-1 (Customer 1, SalesPerson 1)
    Order order1 = masterorderlist.newOrder(cp1, sp1);
    order1.newOrderItem(p1, 2500, 20);
    order1.newOrderItem(p2, 1500, 15);
    order1.newOrderItem(p3, 1000, 10);
    order1.newOrderItem(p4, 500, 5);
    order1.newOrderItem(p5, 200, 2);
    order1.newOrderItem(p6, 400, 4);
    order1.newOrderItem(p7, 600, 6);
    order1.newOrderItem(p8, 700, 7);
    order1.newOrderItem(p9, 500, 5);
    order1.newOrderItem(p10, 300, 3);

    // Order 2 (Customer 2, SalesPerson 1)
    Order order2 = masterorderlist.newOrder(cp2, sp1);
    order2.newOrderItem(p1, 3000, 20);
    order2.newOrderItem(p2, 2000, 15);
    order2.newOrderItem(p3, 1500, 20);
    order2.newOrderItem(p4, 800, 10);
    order2.newOrderItem(p5, 500, 4);
    order2.newOrderItem(p6, 700, 6);
    order2.newOrderItem(p7, 800, 8);
    order2.newOrderItem(p8, 900, 3);
    order2.newOrderItem(p9, 800, 5);
    order2.newOrderItem(p10, 500, 2);

    // Order 3 (Customer 3, SalesPerson 1)
    Order order3 = masterorderlist.newOrder(cp3, sp1);
    order3.newOrderItem(p1, 1800, 10);
    order3.newOrderItem(p2, 500, 5);
    order3.newOrderItem(p3, 500, 0);
    order3.newOrderItem(p4, 700, 2);
    order3.newOrderItem(p5, 900, 2);
    order3.newOrderItem(p6, 900, 8);
    order3.newOrderItem(p7, 300, 6);
    order3.newOrderItem(p8, 300, 3);
    order3.newOrderItem(p9, 700, 2);
    order3.newOrderItem(p10, 400, 8);

    // Order 4 (Customer 4, SalesPerson 1)
    Order order4 = masterorderlist.newOrder(cp4, sp1);
    order4.newOrderItem(p1, 800, 20);
    order4.newOrderItem(p2, 1300, 5);
    order4.newOrderItem(p3, 300, 4);
    order4.newOrderItem(p4, 800, 9);
    order4.newOrderItem(p5, 100, 3);
    order4.newOrderItem(p6, 200, 4);
    order4.newOrderItem(p7, 400, 3);
    order4.newOrderItem(p8, 300, 2);
    order4.newOrderItem(p9, 200, 8);
    order4.newOrderItem(p10, 250, 5);

    // Order 5 (Customer 5, SalesPerson 1)
    Order order5 = masterorderlist.newOrder(cp5, sp1);
    order5.newOrderItem(p1, 500, 5);
    order5.newOrderItem(p2, 900, 12);
    order5.newOrderItem(p3, 800, 1);
    order5.newOrderItem(p4, 300, 9);
    order5.newOrderItem(p5, 500, 8);
    order5.newOrderItem(p6, 700, 8);
    order5.newOrderItem(p7, 800, 16);
    order5.newOrderItem(p8, 200, 7);
    order5.newOrderItem(p9, 600, 15);
    order5.newOrderItem(p10, 800, 23);

    
    return business;
  }
}
