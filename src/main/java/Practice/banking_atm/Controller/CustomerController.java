package Practice.banking_atm.Controller;

import Practice.banking_atm.Model.Customer;
import Practice.banking_atm.Repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @GetMapping("/all")
    public List<Customer> getAll() {
        return customerRepo.findAll();
    }

    @GetMapping("/id/{id}")
    public Customer getId(@PathVariable("customer_Id") final Integer findById) {
        return customerRepo.findById(findById).get();
    }

}
