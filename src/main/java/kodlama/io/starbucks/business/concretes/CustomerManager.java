package kodlama.io.starbucks.business.concretes;

import kodlama.io.starbucks.adapters.MernisServiceAdapter;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import kodlama.io.starbucks.business.abstracts.CustomerService;
import kodlama.io.starbucks.business.dto.create.CreateCustomerRequest;
import kodlama.io.starbucks.business.dto.create.CreateCustomerResponse;
import kodlama.io.starbucks.entities.Customer;
import kodlama.io.starbucks.repository.CustomerRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerManager implements CustomerService {

    private CustomerRepository customerRepository;

    private ModelMapper mapper;

    private MernisServiceAdapter mernisServiceAdapter;

    @Override
    public CreateCustomerResponse save(CreateCustomerRequest request) {
        checkPersonIsReal(request);
        Customer customer = mapper.map(request, Customer.class);
        customerRepository.save(customer);
        return mapper.map(customer, CreateCustomerResponse.class);
    }

    private boolean checkPersonIsReal(CreateCustomerRequest request)  {
        try {
            if(!mernisServiceAdapter.checkPersonIsReal(request)) throw new RuntimeException("Bu Kullanıcı Doğrulanamadı!");
            return true;
        }
        catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
    
}
