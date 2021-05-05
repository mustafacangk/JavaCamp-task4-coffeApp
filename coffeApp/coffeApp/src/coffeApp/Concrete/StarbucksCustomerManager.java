package coffeApp.Concrete;

import coffeApp.Abstract.BaseCustomerManager;
import coffeApp.Abstract.CustomerCheckService;
import coffeApp.Entities.Customer;

public class StarbucksCustomerManager extends  BaseCustomerManager{
	CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckPerson(customer)) {
			System.out.println("Starbucks Manager : Validation successfull.");
			super.save(customer);
		}else {
			System.out.println("Starbucks Manager : Validation Error - Not a valid person.");
		}

	}
}
