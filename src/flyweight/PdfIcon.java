//
// $Header: /home/due1/cvsreps/due/java/pattern/flyweight/PdfIcon.java.templ,v 1.1 2002-05-14 09:41:25 due Exp $
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

public class PdfIcon extends AbstractIcon {

    private final int H = 48;
    private ImageIcon icon;

    public PdfIcon() {
        URL iconURL =
	    ClassLoader.getSystemResource("images/pdf.png");
	if (iconURL != null) {
	    icon = new ImageIcon(iconURL);
	} else {
	    System.out.println("Icon images/pdf.png not found");
	}
    }


    // COMPLETE.

    @Override
    public void draw(Graphics g, int tx, int ty, String name, boolean selected) {
        g.clearRect(tx, ty, icon.getIconWidth(), icon.getIconHeight());
        icon.paintIcon(null, g, tx, ty);
        g.drawString(name, tx, ty + H + 15);  //title
    }











}
