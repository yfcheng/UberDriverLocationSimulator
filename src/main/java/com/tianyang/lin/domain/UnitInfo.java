package com.tianyang.lin.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Embeddable
public class UnitInfo {
    private final String unitVin;
    private String engineMake;
    private String customerName;
    private String unitNumber;

    private UnitInfo() {
        this.unitVin = "";
    }
}
