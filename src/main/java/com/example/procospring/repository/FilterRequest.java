package com.example.procospring.repository;

import java.util.Map;

public class FilterRequest {
    private Map<String, Boolean> checkboxState;

    public Map<String, Boolean> getCheckboxState() {
        return checkboxState;
    }

    public void setCheckboxState(Map<String, Boolean> checkboxState) {
        this.checkboxState = checkboxState;
    }
}
