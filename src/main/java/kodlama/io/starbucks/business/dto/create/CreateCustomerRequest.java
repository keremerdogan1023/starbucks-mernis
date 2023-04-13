package kodlama.io.starbucks.business.dto.create;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerRequest {

    @NotBlank(message = "İsim alanı boş bırakılamaz!")
    private String firstName;
    @NotBlank(message = "Soyisim alanı boş bırakılamaz!")
    private String lastName;
    @NotNull(message = "Doğum tarihi boş bırakılamaz" )
    private int dateOfBirth;
    @NotBlank(message = "Tc Kimlik alanı boş bırakılamaz!")
    private String nationalIdentity;
    
}
