package com.bfr.companion;

public enum BuddyEvent {

    /**
    * Face Event
    * */
    LEFT_EYE_TOUCH(0),
    RIGHT_EYE_TOUCH(1),
    BOTH_EYE_TOUCH(2),
    MOUTH_TOUCH(3),
    FACE_TOUCH(4),

    /**
    * Sensors Event Body
    * */
    LEFT_BODY_CARESS_TOUCH(5),
    RIGHT_BODY_CARESS_TOUCH(6),
    MIDDLE_BODY_CARESS_TOUCH(7),

    LEFT_TOF_TOUCH(12),
    RIGHT_TOF_TOUCH(13),
    MIDDLE_TOF_TOUCH(14),
    BACK_TOF_TOUCH(15),

    LEFT_US(16),
    RIGHT_US(17),

    /**
    *  Sensors Event Head
    * */
    LEFT_HEAD_CARESS_TOUCH(8),
    RIGHT_HEAD_CARESS_TOUCH(9),
    TOP_HEAD_CARESS_TOUCH(10),

    /**
    * Misc (To define)
    * */
    MAIL_RECEIVED(11),

    /**
     *  Battery Level
     */
    VERY_LOW_BATTERY(18),
    LOW_BATTERY(19),
    MID_BATTERY(20),
    FULL_BATTERY(21),

    ;

    private final int mEventCode;

    BuddyEvent(final int iEventCode) {
        this.mEventCode = iEventCode;
    }

    public int getValue(){return this.mEventCode;}
}
