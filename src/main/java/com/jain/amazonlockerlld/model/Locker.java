package com.jain.amazonlockerlld.model;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;

@Builder
@Data
public class Locker {

    ArrayList<Compartment> compartments;
    HashMap<String, AccessToken> accessTokenMapping;
}
