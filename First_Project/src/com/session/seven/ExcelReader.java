package com.session.seven;

import java.io.FileInputStream;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ExcelReader {
    public static void main(String[] args) throws Exception{
        LocalDateTime time = LocalDateTime.now();
        System.out.println("Code started at "+time);
        FileChannel channel = new FileInputStream("C://SOB-Canada Works/Training & Education/Java Trainings/IIBS FULL STACK JAVA DEV/Lecture Notes/Codes/CustomerbankData.csv").getChannel();
        MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY,0,channel.size());
        System.out.println("size "+channel.size());
        CharBuffer charBuffer = null;
        if (buffer != null) {
            charBuffer = Charset.forName("UTF-8").decode(buffer);
            System.out.println(">>>"+charBuffer);
        }
        channel.close();
        LocalDateTime time2 = LocalDateTime.now();
        long diff = ChronoUnit.MILLIS.between(time,time2);
        System.out.println("code finished in "+diff+" millis");

    }
}

