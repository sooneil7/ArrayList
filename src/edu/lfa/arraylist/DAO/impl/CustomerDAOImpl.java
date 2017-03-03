package edu.lfa.arraylist.DAO.impl;

import arraylist.entity.Customer;
import edu.lfa.arraylist.DAO.CustomerDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kafle
 */
public class CustomerDAOImpl implements CustomerDAO {

    private List<Customer> cusList = new ArrayList<>();

    @Override
    public String insert(Customer c) {
        cusList.add(c);
        return "Sucessfully inserted";
    }

    @Override
    public List<Customer> getAll() {
        return cusList;
    }

    @Override
    public Customer searchById(int id) {
        for (Customer cu : cusList) {
            if (id == cu.getId()) {
                return cu;
            }
        }
        return null;

    }

    public Customer deleteById(int id){
        for (Customer cu : cusList) {
            int ide = 0;
                    if (ide == cu.getId()) {
                        cusList.remove(cu);
                        System.out.println("delete vayo");
                    }
                }
        return null;
            
        
    }
    
}
