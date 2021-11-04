package com.atr.jme.font.example;

import com.atr.jme.font.TrueTypeFont;
import com.atr.jme.font.asset.TrueTypeKey;
import com.atr.jme.font.asset.TrueTypeKeyMesh;
import com.atr.jme.font.asset.TrueTypeLoader;
import com.atr.jme.font.shape.TrueTypeContainer;
import com.atr.jme.font.shape.TrueTypeNode;
import com.atr.jme.font.util.StringContainer;
import com.atr.jme.font.util.Style;
import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;

/**
 * TestTrueTypeMesh
 * @author yanmaoyuan
 * 2019-08-27
 * @version 1.0
 */
public class TestTrueTypeMesh extends SimpleApplication {

    /**
     * @param args unused
     */
    public static void main(String[] args) {
        TestTrueTypeMesh app = new TestTrueTypeMesh();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        flyCam.setMoveSpeed(100f);
        assetManager.registerLoader(TrueTypeLoader.class, "ttf");

        TrueTypeKey key = new TrueTypeKeyMesh(Constants.FONT, Style.Plain, 48, 72, true);
        TrueTypeFont font = (TrueTypeFont) assetManager.loadAsset(key);
        StringContainer sc = new StringContainer(font, Constants.HELLO_WORLD);

        // test getFormattedText
        TrueTypeContainer ttc = font.getFormattedText(sc, ColorRGBA.White);
        guiNode.attachChild(ttc);

        // test getText
        TrueTypeNode text = font.getText(Constants.HELLO_WORLD, 1, ColorRGBA.White);
        text.move(0, cam.getHeight(), 0);// move up
        guiNode.attachChild(text);
    }
}
