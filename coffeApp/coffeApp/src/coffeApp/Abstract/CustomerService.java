package coffeApp.Abstract;

import coffeApp.Entities.Customer;

public interface CustomerService {
	 void save(Customer customer);

	boolean CheckPerson(Customer customer);
}
