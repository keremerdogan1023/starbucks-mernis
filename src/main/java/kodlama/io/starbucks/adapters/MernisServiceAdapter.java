package kodlama.io.starbucks.adapters;

import kodlama.io.starbucks.adapters.mernis.UVMKPSPublicSoap;
import kodlama.io.starbucks.business.dto.create.CreateCustomerRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MernisServiceAdapter {

    private UVMKPSPublicSoap mernis;

    public boolean checkPersonIsReal(CreateCustomerRequest request) throws Exception{
        return mernis.TCKimlikNoDogrula(Long.parseLong(request.getNationalIdentity()),request.getFirstName().toUpperCase(),request.getLastName().toUpperCase(),request.getDateOfBirth());
    }
}
