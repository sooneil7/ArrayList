
package edu.lfa.arraylist.DAO;

import arraylist.entity.Customer;
import java.util.List;

/**
 *
 * @author kafle
 */
public interface CustomerDAO {
  String   insert(Customer c);
    List<Customer> getAll();
    Customer searchById(int id);
    Customer deleteById(int id);
}
