package v1ch06.innerClass;

import org.junit.Test;

import javax.swing.*;

public class TalkingClockTest {
    @Test
    public void testInnerClass() {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null, "Quit Program?");
        System.exit(0);
    }
}
