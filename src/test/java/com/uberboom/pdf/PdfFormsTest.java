package com.uberboom.pdf;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PdfFormsTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PdfFormsTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PdfFormsTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testPdfForms()
    {
        assertTrue( true );
    }
}
