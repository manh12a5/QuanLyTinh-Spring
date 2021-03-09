package repository;

import model.Country;
import model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Integer> {

    List<Customer> findAllByCountry(Country country);

    @Query(value = "select * from Customer where Customer.lastName like ?", nativeQuery = true)
    List<Customer> findCustomerByLastName(String lastName);
}
