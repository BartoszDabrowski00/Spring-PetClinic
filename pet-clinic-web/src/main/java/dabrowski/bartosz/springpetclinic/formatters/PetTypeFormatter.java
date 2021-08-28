package dabrowski.bartosz.springpetclinic.formatters;

import dabrowski.bartosz.springpetclinic.model.PetType;
import dabrowski.bartosz.springpetclinic.services.PetTypeService;
import lombok.AllArgsConstructor;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;

@AllArgsConstructor
@Component
public class PetTypeFormatter implements Formatter<PetType> {
    private final PetTypeService petTypeService;
    @Override
    public String print(PetType petType, Locale locale){
        return petType.getName();
    }

    @Override
    public PetType parse(String text, Locale locale) throws ParseException{
        Collection<PetType> findPetTypes = petTypeService.findAll();
        for(PetType type : findPetTypes){
            if(type.getName().equals(text)){
                return type;
            }
        }
        throw new ParseException("type not found", 0);
    }
}
