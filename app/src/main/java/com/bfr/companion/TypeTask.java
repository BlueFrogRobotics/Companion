package com.bfr.companion;

public enum TypeTask {

    DELIVER_MESSAGE(0),
    PLAY_BI(1),
    SPEAK(2),
    RECHARGE_BATTERY(3),
    RANDOM_BALLAD(4),



    /**
     * A voir
     * **/
    LAUNCH_APP(100)
    ;

    private final int mTypeTaskCode;

    TypeTask(final int iTypeTaskCode) {
        this.mTypeTaskCode = iTypeTaskCode;
    }

    public int getValue(){return this.mTypeTaskCode;}
}
