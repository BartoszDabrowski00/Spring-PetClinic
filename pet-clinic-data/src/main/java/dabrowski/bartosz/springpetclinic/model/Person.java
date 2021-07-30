package dabrowski.bartosz.springpetclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Person extends BaseEntity{

    private String firstName;
    private String lastName;

}
