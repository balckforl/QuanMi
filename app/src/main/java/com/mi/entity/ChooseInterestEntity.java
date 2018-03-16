package com.mi.entity;

import java.io.Serializable;

/**
 * 兴趣
 *
 * @author shidandan
 */

public class ChooseInterestEntity implements Serializable {
    private int drawableRes;
    private String interest;
    private boolean isSelected;

    public ChooseInterestEntity(int drawableRes, String interest) {
        this.drawableRes = drawableRes;
        this.interest = interest;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
