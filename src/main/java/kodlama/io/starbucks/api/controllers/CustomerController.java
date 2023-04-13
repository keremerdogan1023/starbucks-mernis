package kodlama.io.starbucks.api.controllers;

import kodlama.io.starbucks.business.abstracts.CustomerService;
import kodlama.io.starbucks.business.dto.create.CreateCustomerRequest;
import kodlama.io.starbucks.business.dto.create.CreateCustomerResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @PostMapping("")
    public ResponseEntity<CreateCustomerResponse> add(@RequestBody CreateCustomerRequest request){
        CreateCustomerResponse response = customerService.save(request);
        return new ResponseEntity<CreateCustomerResponse>(response,HttpStatus.CREATED);
    }
}
