package dabrowski.bartosz.springpetclinic.repositories;

import dabrowski.bartosz.springpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findOwnerByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}
