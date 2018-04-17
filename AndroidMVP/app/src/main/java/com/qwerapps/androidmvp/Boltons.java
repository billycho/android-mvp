package com.qwerapps.androidmvp;

import javax.inject.Inject;

/**
 * Created by IT02106 on 17/04/2018.
 */

public class Boltons implements  House {
    @Inject
    public Boltons()
    {

    }

    @Override
    public void prepareForWar()
    {
        System.out.println(this.getClass().getSimpleName() +  " prepared for war");

    }

    @Override
    public void reportForWar()
    {
        System.out.println(this.getClass().getSimpleName() + " reporting..");

    }
}
