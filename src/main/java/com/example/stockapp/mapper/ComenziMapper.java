package com.example.stockapp.mapper;

import com.example.stockapp.dto.ComenziDto;
import com.example.stockapp.model.Comenzi;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ComenziMapper {
    ComenziDto mapToDto(Comenzi comenzi);
    Comenzi mapToModel(ComenziDto comenziDto);
}
