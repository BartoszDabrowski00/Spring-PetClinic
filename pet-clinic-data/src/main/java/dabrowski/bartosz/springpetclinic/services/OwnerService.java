package dabrowski.bartosz.springpetclinic.services;

import dabrowski.bartosz.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
    Owner findByLastName(String lastName);
}
