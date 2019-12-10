/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extratutioncenter;

import java.util.HashMap;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shiva
 */
public class UserDataTest {
    
    public UserDataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class UserData.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        UserData instance = new UserData("Shiva","Male","AL109JD","28/03/1995",9100370890L);
        String expResult = "Shiva";
        String result = instance.getName();
        assertEquals(expResult, result);
//        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class UserData.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        UserData instance = new UserData();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class UserData.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        UserData instance = new UserData("Shiva","Male","AL109JD","28/03/1995",9100370890L);
        String expResult = "Male";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class UserData.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "";
        UserData instance = new UserData();
        instance.setGender(gender);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class UserData.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        UserData instance = new UserData("Shiva","Male","AL109JD","28/03/1995",9100370890L);
        String expResult = "AL109JD";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class UserData.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        UserData instance = new UserData();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDOB method, of class UserData.
     */
    @Test
    public void testGetDOB() {
        System.out.println("getDOB");
        UserData instance = new UserData("Shiva","Male","AL109JD","28/03/1995",9100370890L);
        String expResult = "28/03/1995";
        String result = instance.getDOB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDOB method, of class UserData.
     */
    @Test
    public void testSetDOB() {
        System.out.println("setDOB");
        String DOB = "";
        UserData instance = new UserData();
        instance.setDOB(DOB);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getContactNo method, of class UserData.
     */
    @Test
    public void testGetContactNo() {
        System.out.println("getContactNo");
        UserData instance = new UserData("Shiva","Male","AL109JD","28/03/1995",9100370890L);
        long expResult = 9100370890L;
        long result = instance.getContactNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setContactNo method, of class UserData.
     */
    @Test
    public void testSetContactNo() {
        System.out.println("setContactNo");
        long contactNo = 0L;
        UserData instance = new UserData();
        instance.setContactNo(contactNo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBooking method, of class UserData.
     */
    @Test
    public void testGetBooking() {
        System.out.println("getBooking");
        UserData instance = new UserData();
        List<Booking> expResult = null;
        List<Booking> result = instance.getBooking();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBooking method, of class UserData.
     */
    @Test
    public void testSetBooking() {
        System.out.println("setBooking");
        List<Booking> booking = null;
        UserData instance = new UserData();
        instance.setBooking(booking);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBookBooked method, of class UserData.
     */
    @Test
    public void testGetBookBooked() {
        System.out.println("getBookBooked");
        UserData instance = new UserData();
        List<BooksBooked> expResult = null;
        List<BooksBooked> result = instance.getBookBooked();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBookBooked method, of class UserData.
     */
    @Test
    public void testSetBookBooked() {
        System.out.println("setBookBooked");
        List<BooksBooked> BookBooked = null;
        UserData instance = new UserData();
        instance.setBookBooked(BookBooked);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMissed method, of class UserData.
     */
    @Test
    public void testGetMissed() {
        System.out.println("getMissed");
        UserData instance = new UserData();
        int expResult = 0;
        int result = instance.getMissed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMissed method, of class UserData.
     */
    @Test
    public void testSetMissed() {
        System.out.println("setMissed");
        int missed = 0;
        UserData instance = new UserData();
        instance.setMissed(missed);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSessionsBooked method, of class UserData.
     */
    @Test
    public void testGetSessionsBooked() {
        System.out.println("getSessionsBooked");
        UserData instance = new UserData();
        int expResult = 0;
        int result = instance.getSessionsBooked();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSessionsBooked method, of class UserData.
     */
    @Test
    public void testSetSessionsBooked() {
        System.out.println("setSessionsBooked");
        int sessionsBooked = 0;
        UserData instance = new UserData();
        instance.setSessionsBooked(sessionsBooked);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAttended method, of class UserData.
     */
    @Test
    public void testGetAttended() {
        System.out.println("getAttended");
        UserData instance = new UserData();
        int expResult = 0;
        int result = instance.getAttended();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAttended method, of class UserData.
     */
    @Test
    public void testSetAttended() {
        System.out.println("setAttended");
        int attended = 0;
        UserData instance = new UserData();
        instance.setAttended(attended);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCancelled method, of class UserData.
     */
    @Test
    public void testGetCancelled() {
        System.out.println("getCancelled");
        UserData instance = new UserData();
        int expResult = 0;
        int result = instance.getCancelled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCancelled method, of class UserData.
     */
    @Test
    public void testSetCancelled() {
        System.out.println("setCancelled");
        int cancelled = 0;
        UserData instance = new UserData();
        instance.setCancelled(cancelled);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class UserData.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        UserData instance = new UserData();
        String expResult = "Shiva";
        String result = instance.getLogin().get(expResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProfile method, of class UserData.
     */


    /**
     * Test of toString method, of class UserData.
     */

}
