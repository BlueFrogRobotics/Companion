package com.bfr.companion;

import com.bfr.buddysdk.BuddySDK;

public class Mission {

    private Task task;
    private int priority;
    private int inhibitionValue;
    private int complexityLevel;

    public void setTask(Task task){this.task = task;}
    public Task getTask(){return task;}

    public void setPriority(int priority) { this.priority = priority;}
    public int getPriority (){ return priority;}

    public void setInhibitionValue(int inhibitionValue) {this.inhibitionValue = inhibitionValue;}
    public int getInhibitionValue(){return inhibitionValue;}

    public void setComplexityLevel(int complexityLevel){this.complexityLevel = complexityLevel;}
    public int getComplexityLevel() {return complexityLevel;}

}
