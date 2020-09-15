package com.example.novelapplication;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */

public class AppTest {
	 public static void main(String[] args) throws Exception {
	        String path = "http://b-ssl.duitang.com/uploads/item/201805/19/20180519081907_wflza.jpg";
	        RGB rgb = HslTest.getMainRgb(path);
	        System.out.println(rgb);
	    }
}
