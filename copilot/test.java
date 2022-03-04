package copilot;

import java.nio.charset.StandardCharsets;

import javax.sound.midi.Soundbank;
import javax.sound.sampled.SourceDataLine;

public class test {
    public static void main(String[] args) {
        // System.out.println(123%100 != 0);
        // System.out.println(13%100 != 0);

        // System.out.println(15300%100 != 0);
        String text = "한글12손경민";
        byte[] arr = text.getBytes(StandardCharsets.UTF_8);
        for (byte b : arr) {
            System.out.println(b);
        }
    }
}
