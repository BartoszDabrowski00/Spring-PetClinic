package dabrowski.bartosz.springpetclinic.repositories;

import dabrowski.bartosz.springpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
