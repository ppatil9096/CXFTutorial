/*
 * Copyright (C) 2020 Digital River, Inc. All Rights Reserved.
 */
package com.student;

import java.util.HashSet;
import java.util.Set;

public class Boy implements Person {

    private Set<String> internalNames = new HashSet<>();
    private String _cName;

    @Override
    public Set<String> getInternalNames() {
        if (internalNames == null) {
            internalNames = new HashSet<>();
        }
        return internalNames;
    }

    @Override
    public String getCName() {
        return _cName;
    }

    public void setInternalNames(Set<String> internalNames) {
        this.internalNames = internalNames;
    }
}
