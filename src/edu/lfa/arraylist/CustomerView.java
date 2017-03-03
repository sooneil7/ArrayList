/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.1

 */
package edu.lfa.arraylist;

import arraylist.entity.Customer;
import edu.lfa.arraylist.DAO.CustomerDAO;
import java.util.Scanner;


/**
 *
 * @author kafle
 */
public class CustomerView {
    int id;
    private Scanner in;
    private CustomerDAO cusDAO;
    private Iterable<Customer> cusList;

    public CustomerView(Scanner in, CustomerDAO cusDAO) {
        this.in = in;
        this.cusDAO = cusDAO;
    }

    public void menu() {
        System.out.println("menu");
        System.out.println("1. Add");
        System.out.println("2. Show all customer");
        System.out.println("3. Search by ID");
        System.out.println("4. Delete by ID");
        System.out.println("5. Exit");

    }

    public void add() {
        while(true){
        Customer cus = new Customer();
        System.out.println("Enter ID :");
        cus.setId(in.nextInt());
        System.out.println("Enter fname :");
        cus.setfName(in.next());
        System.out.println("Enter lname :");
        cus.setlName(in.next());
        System.out.println("Enter email :");
        cus.setEmail(in.next());
        System.out.println("Enter status :");
        cus.setStatus(in.nextBoolean());

        cusDAO.insert(cus);
            System.out.println("do you want to add? [yes/no];");
            if(in.next().equalsIgnoreCase("no")){
                break;
            }           
    }
    }
        

    public void showAll() {
        System.out.println("listing all employee");
        for (Customer cu : cusDAO.getAll()) {
            System.out.println(cu);
        }

    }

    public void searchById() {
        System.out.println("Enter ID to search");
         id = in.nextInt();
        if (cusDAO.searchById(id) == null) {
            System.out.println("not found");
        } else {
            System.out.println(cusDAO.searchById(id).toString());
        }

    }
    public void deleteById(){
     
    }

    public void controller() {
        while (true) {
            menu();
            System.out.println("choose [1-5]");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    searchById();
                    break;
                case 4:
                    deleteById();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
            System.out.println("do you want to continue(y/n):");
            String check = in.next();
            if (check.equalsIgnoreCase("n")) {
                System.exit(0);
            }

        }

    }
}
