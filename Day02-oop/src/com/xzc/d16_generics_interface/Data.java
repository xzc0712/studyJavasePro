package com.xzc.d16_generics_interface;

import java.util.ArrayList;

public interface Data<T> {
    void add(T t);
    ArrayList<T> getbyname(String name);
}
