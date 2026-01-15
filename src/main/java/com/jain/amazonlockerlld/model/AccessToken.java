package com.jain.amazonlockerlld.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class AccessToken {

    String code;
    Date expirationTime;
    Compartment compartment;
}
