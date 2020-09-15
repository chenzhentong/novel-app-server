package com.example.novelapplication;

public class HSL {

    private float h;
    /** 饱和度 */
    private float s;
    /** 深度 */
    private float l;

    public HSL() {
    }

    public HSL(float h, float s, float l) {
        setH(h);
        setS(s);
        setL(l);
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        if (h < 0) {
            this.h = 0;
        } else if (h > 360) {
            this.h = 360;
        } else {
            this.h = h;
        }
    }

    public float getS() {
        return s;
    }

    public void setS(float s) {
        if (s < 0) {
            this.s = 0;
        } else if (s > 255) {
            this.s = 255;
        } else {
            this.s = s;
        }
    }

    public float getL() {
        return l;
    }

    public void setL(float l) {
        if (l < 0) {
            this.l = 0;
        } else if (l > 255) {
            this.l = 255;
        } else {
            this.l = l;
        }
    }

    @Override
    public boolean equals(Object obj) {
        HSL theHSL = (HSL) obj;
        return this.getH() == theHSL.getH() && this.getS() == theHSL.getS() && this.getL() == theHSL.getL();
    }

    @Override
    public int hashCode() {
        return Float.valueOf(this.getH() * 1000000 + this.getS() * 1000 + this.getL()).intValue();
    }

    public String toString() {
        return "HSL {" + h + ", " + s + ", " + l + "}";
    }

}