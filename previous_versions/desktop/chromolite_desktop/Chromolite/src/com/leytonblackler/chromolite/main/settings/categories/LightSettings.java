package com.leytonblackler.chromolite.main.settings.categories;

import com.leytonblackler.chromolite.main.effecthandler.effects.CycleEffect;
import com.leytonblackler.chromolite.main.effecthandler.effects.ScanEffect;
import com.leytonblackler.chromolite.main.effecthandler.effects.StaticEffect;
import com.leytonblackler.chromolite.main.effecthandler.effects.WaveEffect;
import com.leytonblackler.chromolite.main.settings.presets.DefaultSettings;

public class LightSettings {

    public enum Mode {
        STATIC,
        CYCLE,
        WAVE,
        MUSIC,
        SCAN,
        STROBE,
        OFF,
        DISABLE
    }

    public enum ColourSelector {
        PRIMARY,
        SECONDARY,
        TERTIARY
    }

    private ColourSelector colourSelector = DefaultSettings.COLOUR_SELECTOR;

    private int[] primaryColour = DefaultSettings.PRIMARY_COLOUR;

    private int[] secondaryColour = DefaultSettings.SECONDARY_COLOUR;

    private int[] tertiaryColour = DefaultSettings.TERTIARY_COLOUR;

    private int[] primaryIndicatorPosition = DefaultSettings.PRIMARY_INDICATOR_POSITION;
    private int[] secondaryIndicatorPosition = DefaultSettings.SECONDARY_INDICATOR_POSITION;
    private int[] tertiaryIndicatorPosition = DefaultSettings.TERTIARY_INDICATOR_POSITION;

    private Mode mode = DefaultSettings.MODE;

    private int brightness = DefaultSettings.BRIGHTNESS;

    private int speed = DefaultSettings.SPEED;

    private StaticEffect.Style staticStyle = DefaultSettings.STATIC_STYLE;
    private StaticEffect.NumberOfColours staticNumberOfColours = DefaultSettings.STATIC_NUMBER_OF_COLOURS;

    private CycleEffect.NumberOfColours cycleNumberOfColours = DefaultSettings.CYCLE_NUMBER_OF_COLOURS;
    private CycleEffect.Transition cycleTransition = DefaultSettings.CYCLE_TRANSITION;

    private WaveEffect.NumberOfColours waveNumberOfColours = DefaultSettings.WAVE_NUMBER_OF_COLOURS;
    private WaveEffect.Direction waveDirection = DefaultSettings.WAVE_DIRECTION;

    private ScanEffect.Size scanSize = DefaultSettings.SCAN_SIZE;
    private boolean scanBackground = DefaultSettings.SCAN_BACKGROUND;

    /*
    Accessor Methods
     */

    public ColourSelector getColourSelector() {
        return colourSelector;
    }

    public int[] getPrimaryColour() {
        return primaryColour;
    }

    public int[] getSecondaryColour() {
        return secondaryColour;
    }

    public int[] getTertiaryColour() {
        return tertiaryColour;
    }

    public int[] getPrimaryIndicatorPosition() {
        return primaryIndicatorPosition;
    }

    public int[] getSecondaryIndicatorPosition() {
        return secondaryIndicatorPosition;
    }

    public int[] getTertiaryIndicatorPosition() {
        return tertiaryIndicatorPosition;
    }

    public Mode getMode() {
        return mode;
    }

    public int getBrightness() {
        return brightness;
    }

    public int getSpeed() {
        return speed;
    }

    public StaticEffect.Style getStaticStyle() {
        return staticStyle;
    }
    public StaticEffect.NumberOfColours getStaticNumberOfColours() {
        return staticNumberOfColours;
    }

    public CycleEffect.NumberOfColours getCycleNumberOfColours() {
        return cycleNumberOfColours;
    }
    public CycleEffect.Transition getCycleTransition() {
        return cycleTransition;
    }

    public WaveEffect.NumberOfColours getWaveNumberOfColours() {
        return waveNumberOfColours;
    }
    public WaveEffect.Direction getWaveDirection() {
        return waveDirection;
    }

    public ScanEffect.Size getScanSize() {
        return scanSize;
    }
    public boolean getScanBackground() {
        return scanBackground;
    }

    /*
    Mutator Methods
     */

    public void setColourSelector(ColourSelector colourSelector) {
        this.colourSelector = colourSelector;
    }

    public void setPrimaryColour(int[] primaryColour) {
        this.primaryColour = primaryColour;
    }

    public void setSecondaryColour(int[] secondaryColour) {
        this.secondaryColour = secondaryColour;
    }

    public void setTertiaryColour(int[] tertiaryColour) {
        this.tertiaryColour = tertiaryColour;
    }

    public void setPrimaryIndicatorPosition(int x, int y) {
        this.primaryIndicatorPosition = new int[2];
        this.primaryIndicatorPosition[0] = x;
        this.primaryIndicatorPosition[1] = y;
    }

    public void setSecondaryIndicatorPosition(int x, int y) {
        this.secondaryIndicatorPosition = new int[2];
        this.secondaryIndicatorPosition[0] = x;
        this.secondaryIndicatorPosition[1] = y;
    }

    public void setTertiaryIndicatorPosition(int x, int y) {
        this.tertiaryIndicatorPosition = new int[2];
        this.tertiaryIndicatorPosition[0] = x;
        this.tertiaryIndicatorPosition[1] = y;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStaticStyle(StaticEffect.Style staticStyle) {
        this.staticStyle = staticStyle;
    }
    public void setStaticNumberOfColours(StaticEffect.NumberOfColours staticNumberOfColours) {
        this.staticNumberOfColours = staticNumberOfColours;
    }

    public void setCycleNumberOfColours(CycleEffect.NumberOfColours cycleNumberOfColours) {
        this.cycleNumberOfColours = cycleNumberOfColours;
    }
    public void setCycleTransition(CycleEffect.Transition cycleTransition) {
        this.cycleTransition = cycleTransition;
    }

    public void setWaveNumberOfColours(WaveEffect.NumberOfColours waveNumberOfColours) {
        this.waveNumberOfColours = waveNumberOfColours;
    }
    public void setWaveDirection(WaveEffect.Direction waveDirection) {
        this.waveDirection = waveDirection;
    }

    public void setScanSize(ScanEffect.Size scanSize) {
        this.scanSize = scanSize;
    }
    public void setScanBackground(boolean scanBackground) {
        this.scanBackground = scanBackground;
    }

}
