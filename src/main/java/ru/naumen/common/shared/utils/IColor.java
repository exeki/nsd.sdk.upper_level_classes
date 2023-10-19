//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.naumen.common.shared.utils;

import java.io.Serializable;

public interface IColor extends Serializable {
    int getBlue();

    float getBrightness();

    int getContrastBrightness();

    int getGreen();

    float getHue();

    int getRed();

    float getSaturation();

    String getString();

    int getValue();

    IColor guessContrastColor();

    String html();

    IColor inverse();

    boolean isContrastWith(IColor var1);
}
