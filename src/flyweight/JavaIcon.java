//
// $Header: /home/due1/cvsreps/due/java/pattern/flyweight/JavaIcon.java.templ,v 1.1 2002-05-14 09:41:25 due Exp $
//
// Copyright (c) 2002 Eric Dubuis,
// Berner Fachhochschule, HTA Biel.
// All rights reserved.
//
// Based on: J.W. Cooper, Java Design Patterns, Addison-Wesley 2000.

package flyweight;

import java.awt.*;
import javax.swing.*;
import java.net.URL;

public class JavaIcon extends AbstractIcon {

    private final int H = 48;
    private ImageIcon icon;

    // COMPLETE.

    public JavaIcon() {
        URL iconURL =
	    ClassLoader.getSystemResource("images/source_java.png");
	if (iconURL != null) {
	    icon = new ImageIcon(iconURL);
	} else {
	    System.out.println("Icon images/source_java.png not found");
	}
    }

    @Override
    public void draw(Graphics g, int tx, int ty, String name, boolean selected) {
        g.clearRect(tx, ty, icon.getIconWidth(), icon.getIconHeight());
        icon.paintIcon(null, g, tx, ty);
        g.drawString(name, tx, ty + H + 15);  //title
    }







}
