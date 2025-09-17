import java.lang.classfile.CodeBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        director dir = new director(builder);
        Car bmw = dir.buildBmw();
        Car mercedes = dir.buildMercedes();
        System.out.println("Bmw color: " + bmw.getColor());
        System.out.println("Mers color: " + mercedes.getColor());
}}
