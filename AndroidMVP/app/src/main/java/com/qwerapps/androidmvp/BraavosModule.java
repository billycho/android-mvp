package com.qwerapps.androidmvp;

import dagger.Module;
import dagger.Provides;

/**
 * Created by IT02106 on 17/04/2018.
 */

@Module
public class BraavosModule {
    Cash cash;
    Soldiers soldiers;

    public BraavosModule(Cash cash, Soldiers soldiers)
    {
        this.cash = cash;
        this.soldiers = soldiers;
    }

    @Provides
    Cash provideCash()
    {
        return cash;
    }

    @Provides
    Soldiers provideSoldiers()
    {
        return soldiers;
    }



}
