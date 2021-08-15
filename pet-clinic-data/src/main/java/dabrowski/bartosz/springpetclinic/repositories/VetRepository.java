package dabrowski.bartosz.springpetclinic.repositories;

import dabrowski.bartosz.springpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
