package com.sancode.invent.workshop.services;

import com.sancode.invent.workshop.model.Mechanic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author sanjay
 * @apiNote Build for Demo purpose
 * @version version1
 * @implNote Testing
 */
@Service
@Slf4j
public class MechanicService {

    public Mechanic getMechanicDetails() {
        return Mechanic.builder().mechanicName("Sanjay").role("Developer").contributions(1).build();
    }
}
