package edu.lfa.arraylist;

import java.util.ArrayList;
import arraylist.entity.Customer;
import edu.lfa.arraylist.DAO.CustomerDAO;
import edu.lfa.arraylist.DAO.impl.CustomerDAOImpl;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author kafle
 */
public class Program {

    public static void main(String[] args) {
        
        CustomerView cv = new CustomerView(new Scanner(System.in), new CustomerDAOImpl());
        cv.controller();
      
    }
}
