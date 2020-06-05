/*
 * Copyright (C) 2020 Digital River, Inc. All Rights Reserved.
 */
package com.student;

public class FindCParams {
    private Class type;
    private String searchString;

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }
}