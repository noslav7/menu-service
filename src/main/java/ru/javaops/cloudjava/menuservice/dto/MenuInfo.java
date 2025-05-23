package ru.javaops.cloudjava.menuservice.dto;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
public class MenuInfo {
    private String name;
    private BigDecimal price;
    private Boolean isAvailable;
}
