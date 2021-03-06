package Practice.banking_atm.Model;

import javax.persistence.*;

@Entity
@Table(name="checking_account")
public class CheckingAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="checking_id")
    private Integer checkingId;
    @Column(name="balance")
    private Integer balance;
    @Column(name="add_subtract_balance")
    private Integer addOrMinusBalance;
    @Column(name="new_balance")
    private Integer newBalance;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customer;

    public CheckingAccount() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public Integer getCheckingId() {
        return checkingId;
    }

    public void setCheckingId(Integer checkingId) {
        this.checkingId = checkingId;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getAddOrMinusBalance() {
        return addOrMinusBalance;
    }

    public void setAddOrMinusBalance(Integer addOrMinusBalance) {
        this.addOrMinusBalance = addOrMinusBalance;
    }

    public Integer getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(Integer newBalance) {
        this.newBalance = newBalance;
    }
}
