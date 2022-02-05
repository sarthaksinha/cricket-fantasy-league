package com.ipl.fantasy.application;

import com.ipl.fantasy.domain.PointsCalculator;
import com.ipl.fantasy.domain.PointsCalculatorImpl;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

/**
 * A class containing interface-to-implementation bindings for dependency injection
 */
public class PointsBinder extends AbstractBinder {

    @Override
    protected void configure() {
        bind(PointsCalculatorImpl.class).to(PointsCalculator.class);
    }

}
