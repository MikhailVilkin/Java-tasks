package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FrequencyDictionary
{
    public static void main(String[] args) throws IOException {
        final int alphabet_size = 26;
        ArrayList<Letter> letters = new ArrayList<>();

        for (int i = 0; i < alphabet_size; i++) {
            letters.add(new Letter((char) (i + 97)));
        }

        FileReader inp = new FileReader("input.txt");
        int c;
        while((c = inp.read()) != -1) {
            if(c>=97 && c<=122) {
                letters.get(c - 97).countUp();
                continue;
            }
            if(c>=65 && c<=90) {
                c+=32;
                letters.get(c - 97).countUp();
            }
        }

        for (int i = 0; i<alphabet_size; i++) {
            System.out.print(letters.get(i).letter + "\t");
            System.out.println(letters.get(i).count);
        }
    }
}

class Letter {
    char letter;
    int count;
    Letter(char letter) {
        this.letter = letter;
        count = 0;
    }
    void countUp() {
        count++;
    }
}
