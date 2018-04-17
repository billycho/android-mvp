package com.qwerapps.androidmvp;

import dagger.Component;

/**
 * Created by IT02106 on 17/04/2018.
 */

public class BattleOfBastards {
    @Component(modules = BraavosModule.class)
    interface  BattleComponent
    {
        War getWar();

        Starks getStarks();
        Boltons getBoltons();
        Cash getCash();
        Soldiers getSoldiers();
    }

    public void startWar()
    {
        Cash cash = new Cash();
        Soldiers soldiers = new Soldiers();
        BattleComponent component = DaggerBattleOfBastards_BattleComponent.builder().braavosModule(new BraavosModule(cash, soldiers)).build();

        War war = component.getWar();
        war.prepare();
        war.report();

        component.getCash();
        component.getSoldiers();
    }




}
