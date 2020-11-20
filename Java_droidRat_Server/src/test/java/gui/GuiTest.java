package test.java.gui;

import com.je_chen.droidRat.gui.callgui.CallGui;
import com.je_chen.droidRat.gui.maingui.MainGui;
import org.junit.jupiter.api.Test;

class GuiTest {

    @Test
    void getMainGuiInstance() {
        MainGui.getInstance("Test");
    }

    @Test
    void getCallGuiInstance(){
        CallGui.getInstance("Test");
    }
}