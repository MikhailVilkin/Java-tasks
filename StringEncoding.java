package com.company;

import java.util.*;

public class StringEncoding
{
    public static void main(String[] args)
    {
        String a = "SomeString";
        Cryptography f = new Cryptography(a);
        System.out.println(f.getText());
        f.login();
        f.Decrypt();
        System.out.println(f.getText());
    }
}

class Cryptography {
    private int key;
    private String text;
    private ArrayList<Integer> symb_codes;
    private boolean PASSWORD = false;
    private String password;

    Cryptography(String text)
    {
        password = "hey11";
        this.text = text;
        symb_codes = new ArrayList();
        for(int i=0;i<text.length(); i++){
            symb_codes.add((int)text.charAt(i));
        }
        key = symb_codes.get(0) - 100;
        Encrypt();
    }

    private void Encrypt() {
        for (int i=0; i<symb_codes.size(); i++) {
            symb_codes.set(i, symb_codes.get(i) + key);
        }
        text = "";
        for(int i = 0; i<symb_codes.size(); i++)
            text += (char)(int)symb_codes.get(i);
        symb_codes.clear();
    }

    void Decrypt() {
        if(!PASSWORD) {
            System.out.println("No access");
            return;
        }
        for(int i=0;i<text.length(); i++){
            symb_codes.add((int)text.charAt(i));
        }
        for (int i=0; i<symb_codes.size(); i++) {
            symb_codes.set(i, symb_codes.get(i) - key);
        }
        text = "";
        for(int i = 0; i<symb_codes.size(); i++)
            text += (char)(int)symb_codes.get(i);
        symb_codes.clear();
    }

    String getText() {
        return text;
    }

    void login() {
        Scanner inp = new Scanner(System.in);
        String log = inp.next();
        if(log.equals(password))
            PASSWORD = true;
    }
}
