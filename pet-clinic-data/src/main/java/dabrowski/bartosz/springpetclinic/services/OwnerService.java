package dabrowski.bartosz.springpetclinic.services;

import dabrowski.bartosz.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
