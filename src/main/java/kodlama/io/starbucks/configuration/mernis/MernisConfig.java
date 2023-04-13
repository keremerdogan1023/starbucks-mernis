package kodlama.io.starbucks.configuration.mernis;

import kodlama.io.starbucks.adapters.mernis.UVMKPSPublicSoap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MernisConfig {

    @Bean
    public UVMKPSPublicSoap getMernis(){
        return new UVMKPSPublicSoap();
    }
}
