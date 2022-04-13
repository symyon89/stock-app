package com.example.stockapp.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Stocuri")
@Data
public class ProduseListDto {
    @XmlElement(name = "Stocuri", type = ProduseDto.class)
    private List<ProduseDto> stoc = new ArrayList<>();
}
