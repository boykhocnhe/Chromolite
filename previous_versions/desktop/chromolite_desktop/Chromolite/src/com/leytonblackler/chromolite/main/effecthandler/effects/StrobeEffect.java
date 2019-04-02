package com.leytonblackler.chromolite.main.effecthandler.effects;

import com.leytonblackler.chromolite.main.effecthandler.EffectUtilities;
import com.leytonblackler.chromolite.main.effecthandler.effectplatforms.EffectPlatform;
import com.leytonblackler.chromolite.main.settings.categories.LightSettings;

import java.util.List;

public class StrobeEffect extends Effect {

    private static final int MAX_DELAY = 600;
    private static final int MIN_DELAY = 100;

    private boolean on = false;

    public StrobeEffect(LightSettings lightSettings) {
        super(lightSettings);
    }

    @Override
    public void tick(EffectPlatform ... effectPlatforms) {
        int[] colour = {0, 0, 0};
        if (on) {
            on = false;
        } else {
            colour = lightSettings.getPrimaryColour();
            on = true;
        }
        //razerChromaService.setSingleDevices(colour[0], colour[1], colour[2]);
        //ledStripSimulation.setAll(colour[0], colour[1], colour[2]);

        //Calculate how long to wait before the next tick.
        int time = EffectUtilities.calculateDelay(MIN_DELAY, MAX_DELAY, lightSettings.getSpeed());

        delay(time);
    }
}
