package com.xzc.d11_interface_attention;

public class Test11 {
}


interface A{}
interface B{}
interface C{}

interface  D extends C,B,A{

}
class  E implements  D{

}