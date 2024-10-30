package in.oliverit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.oliverit.model.Customer;
import in.oliverit.service.CustomerService;

@RestController
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/customer")
	public String saveCustomer(@RequestBody Customer customer) {
		boolean status = customerService.saveCutomer(customer);
		if (status) {
			return "Customer Saved";
		} else {
			return "Customer Not Saved";
		}
	}
}
