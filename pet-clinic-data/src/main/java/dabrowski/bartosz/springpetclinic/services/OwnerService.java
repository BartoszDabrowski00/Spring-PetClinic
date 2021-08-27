package dabrowski.bartosz.springpetclinic.services;

import dabrowski.bartosz.springpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}
