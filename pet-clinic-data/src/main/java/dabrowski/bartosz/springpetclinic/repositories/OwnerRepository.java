package dabrowski.bartosz.springpetclinic.repositories;

import dabrowski.bartosz.springpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;


public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findOwnerByLastName(String lastName);
}
