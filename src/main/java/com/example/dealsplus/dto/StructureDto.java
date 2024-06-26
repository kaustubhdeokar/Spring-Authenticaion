package com.example.dealsplus.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StructureDto {

    private String structureName;
    private String structureInfo;

    @Override
    public String toString() {
        return "structureName: " + structureName + ", structureInfo: " + structureInfo + ".";
    }
}
