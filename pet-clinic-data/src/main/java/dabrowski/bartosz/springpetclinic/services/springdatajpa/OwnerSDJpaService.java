package dabrowski.bartosz.springpetclinic.services.springdatajpa;

import dabrowski.bartosz.springpetclinic.model.Owner;
import dabrowski.bartosz.springpetclinic.repositories.OwnerRepository;
import dabrowski.bartosz.springpetclinic.repositories.PetRepository;
import dabrowski.bartosz.springpetclinic.repositories.PetTypeRepository;
import dabrowski.bartosz.springpetclinic.services.OwnerService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
@AllArgsConstructor
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findOwnerByLastName(lastName);
    }
}
