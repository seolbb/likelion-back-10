package com.example.day06;

import java.util.Objects;

public class Pen {
    int 잉크양;
    String 컬러;

    public Pen(int 잉크양, String 컬러) {
        this.잉크양 = 잉크양;
        this.컬러 = 컬러;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "잉크양=" + 잉크양 +
                ", 컬러='" + 컬러 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return 잉크양 == pen.잉크양 && Objects.equals(컬러, pen.컬러);
    }

    @Override
    public int hashCode() {
        return Objects.hash(잉크양, 컬러);
    }
}
