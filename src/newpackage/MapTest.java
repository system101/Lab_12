//
// $Header: /home/due1/cvsreps/due/java/pattern/proxy/MapTest.java,v 1.1 2003-05-06 09:35:04 due Exp $
//
// Copyright (c) 2001 by Eric Dubuis,
// BFH, HTA Biel-Bienne.
// All rights reserved.


// Usage: java junit.textui.TestRunner patterns.proxy.MapTest


package newpackage;

import junit.framework.*;
import java.util.Date;

public class MapTest extends TestCase {

    private String fileName;
    private final int COUNT = 10000;

    public MapTest(String name) {
	super(name);
    }

    public static void main (String[] args) {
	junit.textui.TestRunner.run(suite());
    }

    public static Test suite() {
	TestSuite suite = new TestSuite(MapTest.class);
	return suite;
    }

    public void setUp() throws Exception {
	String sep = System.getProperty("file.separator");
	if (sep.equals("/")) {
	    // assume we are on Unix.
	    fileName = "/tmp/key_values";
	} // end of if (sep.equals("/"))
	else {
	    fileName = "C:\\TEMP\\key_values";
	} // end of else
    }

    public void test1() throws Exception {
	AbstractMap map = new Map(fileName);
    }

    public void test2() throws Exception {
	String value = "Eric Dubuis";
	AbstractMap map = new Map(fileName);
	map.add("name", value);
	String result = map.find("name");
	assertEquals(value, result);
    }

    public void test3() throws Exception {
	// Performance test.
	String value = "Eric Dubuis";
	AbstractMap map = new Map(fileName);
	map.add("name", value);
	System.out.println("\nStarting loop at: " + new Date().toString());
	for (int i = 0; i < COUNT; i++) {
	     map.find("name");
	} // end of for (int i = 0; i < COUNT; i++)
	System.out.println("Finished loop at: " + new Date().toString());
    }

    public void tearDown() throws Exception {
	//
    }
}
