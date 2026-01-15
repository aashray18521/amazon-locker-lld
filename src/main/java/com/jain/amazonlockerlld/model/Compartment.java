package com.jain.amazonlockerlld.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Compartment {

    Size size;
    boolean isOccupied;
}
