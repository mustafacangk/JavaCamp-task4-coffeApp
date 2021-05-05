package coffeApp;
 

import java.util.GregorianCalendar;

import coffeApp.Abstract.BaseCustomerManager;
import coffeApp.Concrete.CustomerCheckManager;
import coffeApp.Concrete.NeroCustomerManager;
import coffeApp.Concrete.StarbucksCustomerManager;
import coffeApp.Entities.Customer;
import coffeApp.Adapters.MernisServiceAdaptor;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"Mustafa Can","Gök",new GregorianCalendar(1999,1,1),"123111");
		Customer customer2 = new Customer(2,"Engin","Demiroð",new GregorianCalendar(1989,2,11),"123456");
				
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
		neroCustomerManager.save(customer1);
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdaptor());
		starbucksCustomerManager.save( customer1);
		starbucksCustomerManager.save(customer2);

	}

}