package com.bfr.companion;

public class Task {

    private TypeTask typeTask;
    private String parameter;

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getParameter() {
        return parameter;
    }

    public void setTypeTask(TypeTask typeTask) {
        this.typeTask = typeTask;
    }

    public TypeTask getTypeTask() {
        return typeTask;
    }
}
