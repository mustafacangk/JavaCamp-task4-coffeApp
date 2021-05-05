package coffeApp.Abstract;

 
import coffeApp.Entities.Customer;

public class BaseCustomerManager implements CustomerService{

	
	public void save(Customer customer) {
		System.out.println("saved to db : "+customer.getFirstName());
		
	
	}

	@Override
	public boolean CheckPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}
}
