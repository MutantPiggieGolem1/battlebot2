package despacito7.menu;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.HashSet;
import java.util.Set;

import despacito7.DrawingCanvas;
import despacito7.util.Drawable;

import java.awt.Point;

public abstract class Menu {
    public static final RotaryMenu cornerMenu = new RotaryMenu(new Point(0, 0));
    protected Set<Button> buttons;

    public abstract void update();

    public void draw(Graphics2D g) {
        for (Button b : this.buttons) b.draw(g);
    }
    public static interface Button extends Drawable {
        public void draw(Graphics2D g);
    }
}

class DialogueMenu extends Menu implements Drawable {
    private int height;

    public DialogueMenu(Set<String> topics) {
        Set<Button> buttons = new HashSet<>();
        topics.forEach((String topic) -> buttons.add(new DialogueButton(topic)));
        this.buttons = buttons;
    }

    public void update() {}

    @Override
    public void draw(Graphics2D g) {
        g.setColor(new Color(0x00000099, true));
        g.drawRect(0, DrawingCanvas.dimensions[1], DrawingCanvas.dimensions[0], height);
        super.draw(g);
    }

    private class DialogueButton implements Button {
        private DialogueButton(String text) {

        }

        @Override
        public void draw(Graphics2D g) {
            
        }
    }
}