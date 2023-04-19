package com.example.java_project2.week1;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readChar() throws IOException {
        InputStreamReader is;
// InputStreamReader를 인스턴스화
        is = new InputStreamReader(System.in);
// InputStreamReader에서 한 글자를 읽어 옴
        int asciiCode = is.read();
// 읽어 온 문자열 코드를 출력
        System.out.println(asciiCode);


    }

    public void readTwoChars() throws IOException {

        InputStreamReader is = new InputStreamReader(System.in);
        int asciCode1 = is.read();
        int asciCode2 = is.read();
        System.out.println(asciCode1);
        System.out.println(asciCode2);

    }
}
