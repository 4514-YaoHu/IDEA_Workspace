package com.wyc.java02;

/**
 * @ClassName MyDate
 * @Author 王韫琛
 * @Date 2020/12/14 18:12
 * @Version 1.0
 */
public class MyDate implements Comparable {
    private Integer year;
    private Integer month;
    private Integer day;

    public MyDate() {
    }

    public MyDate(Integer year, Integer month, Integer day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof MyDate) {
            MyDate m = (MyDate) o;
            int minusYear = this.getYear() - m.getYear();
            if (minusYear != 0) {
                return minusYear;
            }
            int minusMonth = this.getMonth() - m.getMonth();
            if (minusMonth != 0) {
                return minusMonth;
            }
            int minusDay = this.getDay() - m.getDay();
            if (minusDay != 0) {
                return minusDay;
            }
            return 0;
        }
        throw new RuntimeException("输入类型不匹配");
    }
}
