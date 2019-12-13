package v1ch06.anonymousInnerClass;

import org.junit.Test;

import javax.swing.*;

public class TalkingClockTest {
    @Test
    public void testClock() {
        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);
        JOptionPane.showMessageDialog(null, "Quit?");
        System.exit(0);
    }
}
