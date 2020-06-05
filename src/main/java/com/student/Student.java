/*
 * Copyright (C) 2020 Digital River, Inc. All Rights Reserved.
 */
package com.student;

import java.util.ArrayList;
import java.util.List;

public class Student<T extends Person> {
    private List<T> _constraints;

    public List<T> getConstraints() {
        if (_constraints == null) {
            _constraints = new ArrayList<>();
        }
        return _constraints;
    }

    public void setConstraints(List<T> constraints) {
        _constraints = constraints;
    }
}