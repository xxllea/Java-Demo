package test3;

public class Time4 {
    private int hour;
    private int minute;
    private int second;

    public Time4() {
        setTime(0, 0, 0);
    }

    public Time4(int h) {
        setTime(h, 0, 0);
    }

    public void setTime(int h, int m, int s) {
        hour = (h >= 0 && h < 24) ? h : 0;
        minute = (m >= 0 && m < 60) ? m : 0;
        second = (s >= 0 && s < 60) ? s : 0;
}