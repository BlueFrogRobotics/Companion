package com.bfr.companion;

import java.util.ArrayList;
import java.util.List;

public class MissionManager implements Runnable {

    //TODO : sort missionList quand ya un add dans la liste, commencer à remplir les actions
    protected static List<Mission> missionList = new ArrayList<Mission>();
    private int sizeMissionList;

    @Override
    public void run() {
        switch (missionList.get(0).getTask().getTypeTask())
        {
            case DELIVER_MESSAGE:
                break;
            case PLAY_BI:
                break;
            case SPEAK:
                break;
            case RANDOM_BALLAD:
                break;
            case RECHARGE_BATTERY:
                break;
            case LAUNCH_APP:
                break;
        }
    }
}
