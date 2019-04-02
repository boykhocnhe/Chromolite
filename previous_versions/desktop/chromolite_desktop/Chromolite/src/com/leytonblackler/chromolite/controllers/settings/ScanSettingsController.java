package com.leytonblackler.chromolite.controllers.settings;

import com.leytonblackler.chromolite.controllers.Controller;
import com.leytonblackler.chromolite.main.effecthandler.effects.ScanEffect;
import com.leytonblackler.chromolite.main.effecthandler.effects.StaticEffect;
import com.leytonblackler.chromolite.main.effecthandler.effects.WaveEffect;
import com.leytonblackler.chromolite.main.settings.SettingsManager;
import com.leytonblackler.chromolite.main.settings.presets.DefaultSettings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class ScanSettingsController extends Controller implements Initializable {

    private static final int DEFAULT_BRIGHTNESS = 100;
    private static final int DEFAULT_SPEED = 50;

    private enum Size {
        NARROW,
        MEDIUM,
        WIDE
    }

    @FXML
    private Slider brightnessSlider;

    @FXML
    private Label brightnessPercentLabel;

    @FXML
    private Slider speedSlider;

    @FXML
    private Label speedPercentLabel;

    @FXML
    private ChoiceBox<String> sizeChoiceBox;

    @FXML
    private CheckBox backgroundCheckBox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        initialiseChoiceBox(sizeChoiceBox, ScanEffect.Size.values(), DefaultSettings.SCAN_SIZE);

        brightnessSlider.setValue(DEFAULT_BRIGHTNESS);
        brightnessPercentLabel.setText(Integer.toString(DEFAULT_BRIGHTNESS) + "%");
        brightnessSlider.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                                Number old_val, Number new_val) {
                Long percentValue = Math.round(new_val.doubleValue());
                String percentString = Long.toString(percentValue) + "%";
                brightnessPercentLabel.setText(percentString);
            }
        });

        speedSlider.setValue(DEFAULT_SPEED);
        speedPercentLabel.setText(Integer.toString(DEFAULT_SPEED) + "%");
        speedSlider.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                                Number old_val, Number new_val) {
                int percentValue = (int) Math.round(new_val.doubleValue());
                String percentString = Long.toString(percentValue) + "%";
                speedPercentLabel.setText(percentString);
                getSettings().setSpeed(percentValue);
            }
        });
    }

    @Override
    public void update(SettingsManager settings) {
        backgroundCheckBox.setSelected(settings.getCurrentLightSettings().getScanBackground());
    }

    private void initialiseChoiceBox(ChoiceBox choiceBox, Enum[] choices, Enum defaultChoice) {
        ObservableList<String> choiceStrings = FXCollections.observableArrayList();
        for (Enum choice : choices) {
            choiceStrings.add(choice.toString());
        }
        choiceBox.setItems(choiceStrings);
        choiceBox.setValue(defaultChoice.toString());
    }

    @FXML
    private void sizeChoiceBoxChanged() {
        getSettings().setScanSize(ScanEffect.Size.valueOf(sizeChoiceBox.getValue()));
    }

    @FXML
    private void backgroundCheckBoxClicked() {
        getSettings().setScanBackground(backgroundCheckBox.isSelected());
    }
}
