package mate.academy.rickandmorty.mapper;

import mate.academy.rickandmorty.config.MapperConfig;
import mate.academy.rickandmorty.dto.external.CharacterDataDto;
import mate.academy.rickandmorty.dto.internal.CharacterDto;
import mate.academy.rickandmorty.model.Character;
import mate.academy.rickandmorty.model.CharacterFromApi;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface CharacterMapper {
    CharacterDto toDto(CharacterFromApi characterFromApi);

    CharacterFromApi toModel(CharacterDataDto characterDataDto);

    CharacterDto toDto(Character character);

    Character toModel(CharacterDto characterDto);

}
