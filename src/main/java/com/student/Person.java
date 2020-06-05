/*
 * Copyright (C) 2020 Digital River, Inc. All Rights Reserved.
 */
package com.student;

import java.io.Serializable;
import java.util.Set;

public interface Person extends Serializable {
    String getCName();

    Set<String> getInternalNames();
}
