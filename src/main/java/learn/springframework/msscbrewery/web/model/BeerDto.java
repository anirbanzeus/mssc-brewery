package learn.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Builder;

import java.util.UUID;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class BeerDto {
    
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

}
