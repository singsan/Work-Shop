package com.sancode.invent.workshop.model;

import lombok.*;

@Builder
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Mechanic {
    private String mechanicName;
    private String role;
    private int contributions;
}
