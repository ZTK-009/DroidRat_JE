package test.java.gui;

import com.je_chen.droidRat.gui.callgui.CallGui;
import com.je_chen.droidRat.gui.cameragui.CameraGui;
import com.je_chen.droidRat.gui.infogui.InfoGui;
import com.je_chen.droidRat.gui.installgui.InstallGui;
import com.je_chen.droidRat.gui.locationgui.LocationGui;
import com.je_chen.droidRat.gui.mailgui.MailGui;
import com.je_chen.droidRat.gui.maingui.MainGui;
import com.je_chen.droidRat.gui.playgui.PlayGui;
import com.je_chen.droidRat.gui.runappgui.RunAppGui;
import com.je_chen.droidRat.gui.sensorgui.SensorGui;
import com.je_chen.droidRat.gui.smsgui.SMSGui;
import com.je_chen.droidRat.gui.toastgui.ToastGui;
import com.je_chen.droidRat.gui.vibratorgui.VibratorGui;
import com.je_chen.droidRat.gui.webgui.WebGui;
import org.junit.jupiter.api.Test;

class GuiTest {

    @Test
    void getMainGuiInstance() {
        MainGui.getInstance("Test");
        MainGui.getInstance("Test");
    }

    @Test
    void getCallGuiInstance(){
        CallGui.getInstance("Test");
        CallGui.getInstance("Test");
    }

    @Test
    void getCameraGuiInstance(){
        CameraGui.getInstance("Test");
        CameraGui.getInstance("Test");
    }

    @Test
    void getInfoGuiInstance(){
        InfoGui.getInstance("Test");
        InfoGui.getInstance("Test");

    }

    @Test
    void getInstallGuiInstance(){
        InstallGui.getInstance("Test");
        InstallGui.getInstance("Test");
    }

    @Test
    void getLocationGuiInstance(){
        LocationGui.getInstance("Test");
        LocationGui.getInstance("Test");
    }

    @Test
    void getMailGuiInstance(){
        MailGui.getInstance("Test");
        MailGui.getInstance("Test");
    }

    @Test
    void getPlayGuiInstance(){
        PlayGui.getInstance("Test");
        PlayGui.getInstance("Test");
    }

    @Test
    void getRunAppGuiInstance(){
        RunAppGui.getInstance("Test");
        RunAppGui.getInstance("Test");
    }

    @Test
    void getSensorGuiInstance(){
        SensorGui.getInstance("Test");
        SensorGui.getInstance("Test");
    }

    @Test
    void getSMSGuiInstance(){
        SMSGui.getInstance("Test");
        SMSGui.getInstance("Test");
    }

    @Test
    void getToastGuiInstance(){
        ToastGui.getInstance("Test");
        ToastGui.getInstance("Test");
    }

    @Test
    void getVibratorGuiInstance(){
        VibratorGui.getInstance("Test");
        VibratorGui.getInstance("Test");
    }

    @Test
    void getWebGuiInstance(){
        WebGui.getInstance("Test");
        WebGui.getInstance("Test");
    }
}