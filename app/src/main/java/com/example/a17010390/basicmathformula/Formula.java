package com.example.a17010390.basicmathformula;

/**
 * Created by 17010390 on 18/7/2018.
 */

public class Formula {

    private String Area;
    private String Length;
    private String Type;

    public Formula(String area, String length, String type) {
        Area = area;
        Length = length;
        Type = type;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getLength() {
        return Length;
    }

    public void setLength(String length) {
        Length = length;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Length = type;
    }

    @Override
    public String toString() {
        return "Formula{" +
                "Area='" + Area + '\'' +
                ", Length='" + Length + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
