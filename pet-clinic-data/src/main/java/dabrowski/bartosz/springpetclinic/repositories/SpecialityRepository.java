package dabrowski.bartosz.springpetclinic.repositories;

import dabrowski.bartosz.springpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
