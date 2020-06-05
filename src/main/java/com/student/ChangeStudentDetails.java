/*
 * Copyright (C) 2020 Digital River, Inc. All Rights Reserved.
 */
package com.student;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface ChangeStudentDetails {

    Student findStudentDetails(
            @WebParam(name = "findConstraintParams")
                    FindCParams findCParams);

    Student<Girl> findStudentDetailsGirl();
}