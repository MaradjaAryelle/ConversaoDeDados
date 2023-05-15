package br.com.fesc.fafic.ConversaoDeDados.Main;

import java.lang.Integer;

public class Main {
    public static void main(String[] args) {
        try {
            Object obj = new Integer(10);
            String str = (String) obj;
            System.out.println(str);
        } catch (ClassCastException e) {
            System.err.println(e);
        }
    }
}