package kodlama.io.starbucks.business.dto.create;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerResponse {

    private int id;
    private String firstName;
    private String lastName;
    private int dateOfBirth;
    private String nationalIdentity;
    
}