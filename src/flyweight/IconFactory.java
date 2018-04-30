//
// $Header: /home/due1/cvsreps/due/java/pattern/flyweight/IconFactory.java.templ,v 1.1 2002-05-14 09:41:25 due Exp $
//
// Copyright (c) 2002 Eric Dubuis,
// Berner Fachhochschule, HTA Biel.
// All rights reserved.
//
// Based on: J.W. Cooper, Java Design Patterns, Addison-Wesley 2000.

package flyweight;

import java.util.*;

public class IconFactory {
    private Map iconmap = new HashMap();
    
    private static IconFactory uniqueInstance = new IconFactory();
    
    public IconFactory() {generateKeyValue();}
    
    public static synchronized IconFactory getInstance(){
        return uniqueInstance;
    }
    
    // Singleton.
    // COMPLETE.
    public void generateKeyValue(){
        this.iconmap.put("folder", new FolderIcon());
        this.iconmap.put("java", new JavaIcon());
        this.iconmap.put("pdf", new PdfIcon());
        this.iconmap.put("picture", new PictureIcon());
        this.iconmap.put("text", new TextIcon());
        this.iconmap.put("unknown", new UnknownIcon());
    }
    
    public AbstractIcon getValue (String key){
        return (AbstractIcon)this.iconmap.get(key);
    }
    public AbstractIcon createIcon(String key) {
        return getValue(key);
    }

    // Add helper methods here, if any.
}
