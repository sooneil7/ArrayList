
package arraylist.entity;

/**
 *
 * @author kafle
 */
public class Customer {
    private int id;
    private String fName,lName,email;
    private boolean status;
     
    public Customer(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", status=" + status + '}';
    }
    
    
    
}
