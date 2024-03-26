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
    
    // Create Sales_Person
    Person salesperson1 = persondirectory.newPerson("SalesPerson1");
    Person salesperson2 = persondirectory.newPerson("SalesPerson2");
    
    SalesPersonProfile sp1 = salesPersonDirectory.newSalesPersonProfile(salesperson1); 
    SalesPersonProfile sp2 = salesPersonDirectory.newSalesPersonProfile(salesperson2);
    
    // Create User Accounts
    UserAccount userAccount1 = userAccountDirectory.newUserAccount(sp1, "user1", "pass1");
    UserAccount userAccount2 = userAccountDirectory.newUserAccount(sp2, "user2", "pass2");
    
//    // Create Suppliers
//    Supplier supplier1 = suplierdirectory.newSupplier("Apsara");
//    
//    // Create Products
//    ProductCatalog productcatalog = supplier1.getProductCatalog();
//    Product s1p1 = productcatalog.newProduct("Pen", 1000, 5000, 2000);
//    Product s1p2 = productcatalog.newProduct("Pencil", 500, 3000, 1500);
//    Product s1p3 = productcatalog.newProduct("Notebook", 2000, 8000, 4000);
//    Product s1p4 = productcatalog.newProduct("Eraser", 300, 1500, 750);
//    Product s1p5 = productcatalog.newProduct("Ruler", 400, 2000, 1000);
//    Product s1p6 = productcatalog.newProduct("Highlighter", 800, 4000, 2000);
//    Product s1p7 = productcatalog.newProduct("Marker", 1200, 6000, 3000);
//    Product s1p8 = productcatalog.newProduct("Stapler", 1500, 7000, 3500);
//    Product s1p9 = productcatalog.newProduct("Scissors", 1000, 5000, 2500);
//    Product s1p10 = productcatalog.newProduct("Glue Stick", 600, 3000, 1500);
//    
//    // Create Customers
//    Person s1c1 = persondirectory.newPerson("Customer1");
//    Person s1c2 = persondirectory.newPerson("Customer2");
//    Person s1c3 = persondirectory.newPerson("Customer3");
//    Person s1c4 = persondirectory.newPerson("Customer4");
//    Person s1c5 = persondirectory.newPerson("Customer5");
//    Person s1c6 = persondirectory.newPerson("Customer6");
//    Person s1c7 = persondirectory.newPerson("Customer7");
//    Person s1c8 = persondirectory.newPerson("Customer8");
//    Person s1c9 = persondirectory.newPerson("Customer9");
//    Person s1c10 = persondirectory.newPerson("Customer10");
//    
//    
//    CustomerProfile s1cp1 = customerDirectory.newCustomerProfile(s1c1);
//    CustomerProfile s1cp2 = customerDirectory.newCustomerProfile(s1c2);
//    CustomerProfile s1cp3 = customerDirectory.newCustomerProfile(s1c3);
//    CustomerProfile s1cp4 = customerDirectory.newCustomerProfile(s1c4);
//    CustomerProfile s1cp5 = customerDirectory.newCustomerProfile(s1c5);
//    CustomerProfile s1cp6 = customerDirectory.newCustomerProfile(s1c6);
//    CustomerProfile s1cp7 = customerDirectory.newCustomerProfile(s1c7);
//    CustomerProfile s1cp8 = customerDirectory.newCustomerProfile(s1c8);
//    CustomerProfile s1cp9 = customerDirectory.newCustomerProfile(s1c9);
//    CustomerProfile s1cp10 = customerDirectory.newCustomerProfile(s1c10);
//    
//    // Process Orders on behalf of sales person and customer
//    // Order-1 (Customer 1, SalesPerson 1)
//    Order order1 = masterorderlist.newOrder(s1cp1, sp1);
//    order1.newOrderItem(s1p1, 2500, 20);
//    order1.newOrderItem(s1p2, 1500, 15);
//    order1.newOrderItem(s1p3, 1000, 10);
//    order1.newOrderItem(s1p4, 500, 5);
//    order1.newOrderItem(s1p5, 200, 2);
//    order1.newOrderItem(s1p6, 400, 4);
//    order1.newOrderItem(s1p7, 600, 6);
//    order1.newOrderItem(s1p8, 700, 7);
//    order1.newOrderItem(s1p9, 500, 5);
//    order1.newOrderItem(s1p10, 300, 3);
//
//    // Order 2 (Customer 2, SalesPerson 1)
//    Order order2 = masterorderlist.newOrder(s1cp2, sp1);
//    order2.newOrderItem(s1p1, 3000, 20);
//    order2.newOrderItem(s1p2, 2000, 15);
//    order2.newOrderItem(s1p3, 1500, 20);
//    order2.newOrderItem(s1p4, 800, 10);
//    order2.newOrderItem(s1p5, 500, 4);
//    order2.newOrderItem(s1p6, 700, 6);
//    order2.newOrderItem(s1p7, 800, 8);
//    order2.newOrderItem(s1p8, 900, 3);
//    order2.newOrderItem(s1p9, 800, 5);
//    order2.newOrderItem(s1p10, 500, 2);
//
//    // Order 3 (Customer 3, SalesPerson 1)
//    Order order3 = masterorderlist.newOrder(s1cp3, sp1);
//    order3.newOrderItem(s1p1, 1800, 10);
//    order3.newOrderItem(s1p2, 500, 5);
//    order3.newOrderItem(s1p3, 500, 0);
//    order3.newOrderItem(s1p4, 700, 2);
//    order3.newOrderItem(s1p5, 900, 2);
//    order3.newOrderItem(s1p6, 900, 8);
//    order3.newOrderItem(s1p7, 300, 6);
//    order3.newOrderItem(s1p8, 300, 3);
//    order3.newOrderItem(s1p9, 700, 2);
//    order3.newOrderItem(s1p10, 400, 8);
//
//    // Order 4 (Customer 4, SalesPerson 1)
//    Order order4 = masterorderlist.newOrder(s1cp4, sp1);
//    order4.newOrderItem(s1p1, 800, 20);
//    order4.newOrderItem(s1p2, 1300, 5);
//    order4.newOrderItem(s1p3, 300, 4);
//    order4.newOrderItem(s1p4, 800, 9);
//    order4.newOrderItem(s1p5, 100, 3);
//    order4.newOrderItem(s1p6, 200, 4);
//    order4.newOrderItem(s1p7, 400, 3);
//    order4.newOrderItem(s1p8, 300, 2);
//    order4.newOrderItem(s1p9, 200, 8);
//    order4.newOrderItem(s1p10, 250, 5);
//
//    // Order 5 (Customer 5, SalesPerson 1)
//    Order order5 = masterorderlist.newOrder(s1cp5, sp1);
//    order5.newOrderItem(s1p1, 500, 5);
//    order5.newOrderItem(s1p2, 900, 12);
//    order5.newOrderItem(s1p3, 800, 1);
//    order5.newOrderItem(s1p4, 300, 9);
//    order5.newOrderItem(s1p5, 500, 8);
//    order5.newOrderItem(s1p6, 700, 8);
//    order5.newOrderItem(s1p7, 800, 16);
//    order5.newOrderItem(s1p8, 200, 7);
//    order5.newOrderItem(s1p9, 600, 15);
//    order5.newOrderItem(s1p10, 800, 23);
//
//    // Order-6 (Customer 6, SalesPerson 2)
//    Order order6 = masterorderlist.newOrder(s1cp6, sp2);
//    order6.newOrderItem(s1p1, 2400, 10);
//    order6.newOrderItem(s1p2, 1200, 20);
//    order6.newOrderItem(s1p3, 1500, 15);
//    order6.newOrderItem(s1p4, 800, 8);
//    order6.newOrderItem(s1p5, 250, 5);
//    order6.newOrderItem(s1p6, 350, 7);
//    order6.newOrderItem(s1p7, 450, 9);
//    order6.newOrderItem(s1p8, 550, 11);
//    order6.newOrderItem(s1p9, 650, 13);
//    order6.newOrderItem(s1p10, 750, 17);
//
//    // Order-7 (Customer 7, SalesPerson 3)
//    Order order7 = masterorderlist.newOrder(s1cp7, sp2);
//    order7.newOrderItem(s1p1, 2600, 12);
//    order7.newOrderItem(s1p2, 1400, 14);
//    order7.newOrderItem(s1p3, 1600, 16);
//    order7.newOrderItem(s1p4, 700, 7);
//    order7.newOrderItem(s1p5, 300, 3);
//    order7.newOrderItem(s1p6, 500, 5);
//    order7.newOrderItem(s1p7, 400, 4);
//    order7.newOrderItem(s1p8, 600, 6);
//    order7.newOrderItem(s1p9, 800, 8);
//    order7.newOrderItem(s1p10, 1000, 10);
//
//    // Order-8 (Customer 8, SalesPerson 4)
//    Order order8 = masterorderlist.newOrder(s1cp8, sp2);
//    order8.newOrderItem(s1p1, 2800, 14);
//    order8.newOrderItem(s1p2, 1100, 11);
//    order8.newOrderItem(s1p3, 1300, 13);
//    order8.newOrderItem(s1p4, 900, 9);
//    order8.newOrderItem(s1p5, 400, 4);
//    order8.newOrderItem(s1p6, 600, 6);
//    order8.newOrderItem(s1p7, 800, 8);
//    order8.newOrderItem(s1p8, 1000, 10);
//    order8.newOrderItem(s1p9, 1200, 12);
//    order8.newOrderItem(s1p10, 1400, 14);
//
//    // Order-9 (Customer 9, SalesPerson 5)
//    Order order9 = masterorderlist.newOrder(s1cp9, sp2);
//    order9.newOrderItem(s1p1, 3000, 15);
//    order9.newOrderItem(s1p2, 1000, 10);
//    order9.newOrderItem(s1p3, 1200, 12);
//    order9.newOrderItem(s1p4, 1400, 14);
//    order9.newOrderItem(s1p5, 500, 5);
//    order9.newOrderItem(s1p6, 700, 7);
//    order9.newOrderItem(s1p7, 900, 9);
//    order9.newOrderItem(s1p8, 1100, 11);
//    order9.newOrderItem(s1p9, 1300, 13);
//    order9.newOrderItem(s1p10, 1500, 15);
//
//    // Order-10 (Customer 10, SalesPerson 1)
//    Order order10 = masterorderlist.newOrder(s1cp10, sp2);
//    order10.newOrderItem(s1p1, 3200, 16);
//    order10.newOrderItem(s1p2, 900, 9);
//    order10.newOrderItem(s1p3, 1100, 11);
//    order10.newOrderItem(s1p4, 1300, 13);
//    order10.newOrderItem(s1p5, 1500, 15);
//    order10.newOrderItem(s1p6, 1700, 17);
//    order10.newOrderItem(s1p7, 600, 6);
//    order10.newOrderItem(s1p8, 800, 8);
//    order10.newOrderItem(s1p9, 1000, 10);
//    order10.newOrderItem(s1p10, 1200, 12);


        // Assuming suplierdirectory, persondirectory, customerDirectory, masterorderlist, and a sales person (sp2) are already defined.

    // Create Suppliers
    Supplier[] suppliers = new Supplier[5];
    suppliers[0] = suplierdirectory.newSupplier("Apsara");
    suppliers[1] = suplierdirectory.newSupplier("Doms");
    suppliers[2] = suplierdirectory.newSupplier("Natraj");
    suppliers[3] = suplierdirectory.newSupplier("Camlin");
    suppliers[4] = suplierdirectory.newSupplier("Cello");

    // Product names for simplicity
    String[] productNames = new String[]{"Pen", "Pencil", "Notebook", "Eraser", "Ruler", "Highlighter", "Marker", "Stapler", "Scissors", "Glue Stick"};
    
    // Base values for cost, price, and target price
    int[] floorprice = {500, 700, 900, 300, 400, 800, 1200, 1500, 1000, 600};
    int[] ceilingprice = {2500, 2800, 3200, 1800, 2000, 4000, 6000, 7000, 5000, 3000};
    int[] targetprice = {1000, 1100, 1300, 750, 1000, 2000, 3000, 3500, 2500, 1500};
    
    // Assigning values to products with different logic for each supplier
    for (int s = 0; s < suppliers.length; s++) {
        ProductCatalog productCatalog = suppliers[s].getProductCatalog();
        
        for (int i = 0; i < 10; i++) {
            // Apply different logic based on supplier to vary product attributes
            int fp = floorprice[i] + ((s+i) * 10);
            int cp = ceilingprice[i] + ((s+i) * 500); // Example variation
            int tp = targetprice[i] + ((s+i) * 250); // Example variation
            productCatalog.newProduct(productNames[i] + " " + suppliers[s].getName(), fp, cp, tp);
        }
    }

    // Create 10 Customers
    CustomerProfile[] customerProfiles = new CustomerProfile[10];
    for (int i = 0; i < 10; i++) {
        Person customerPerson = persondirectory.newPerson("Customer" + (i + 1));
        customerProfiles[i] = customerDirectory.newCustomerProfile(customerPerson);
    }

    // Generate 10 Orders for each Product of every Supplier
    for (int s = 0; s < suppliers.length; s++) {
        ProductCatalog productCatalog = suppliers[s].getProductCatalog();
        for (Product product : productCatalog.getProductList()) {
            for (int i = 0; i < 10; i++) {
                Order order = masterorderlist.newOrder(customerProfiles[i], sp1); // Assuming sp2 is defined elsewhere
                order.newOrderItem(product, 1000 + (100 * (s+i)), 5 + (s*i));
            }
        }
    }
    
    return business;
  }
}
