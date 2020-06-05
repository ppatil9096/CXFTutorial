/*
 * Copyright (C) 2020 Digital River, Inc. All Rights Reserved.
 */
package com.student;

import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@Service
@WebService(serviceName = "ChangeStudentDetails", targetNamespace = "com.student.webservice", endpointInterface = "com.student.ChangeStudentDetails")
public class ChangeStudentDetailsImpl implements ChangeStudentDetails {

    @Override
    public Student findStudentDetails(FindCParams findCParams) {
        Student student = new Student();
        List<Boy> boyList = new ArrayList<>();
        student.setConstraints(boyList);
        return student;
    }

    @Override
    public Student<Girl> findStudentDetailsGirl() {
        Student<Girl> student = new Student<>();
        List<Girl> boyList = new ArrayList<>();
        student.setConstraints(boyList);
        return student;
    }


}