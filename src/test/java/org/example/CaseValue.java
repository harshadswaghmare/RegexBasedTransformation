package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CaseValue {
    RegexBasedTransformation obj = new RegexBasedTransformation();

    @Test
    public void accountantRepresentative() {
        try {
            String result = obj.transform("ACCOUNT REPRESENTATIVE", "Account Representative");
            String result1 = obj.transform("ACCOUNTANT", "Account Representative");
            System.out.println(result + "\n" + result1);
            String expected = "Account Representative";
            String Unexpected = "Harsh";
            Assert.assertEquals(expected, result);
            Assert.assertEquals(Unexpected, result1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    @Test
    public void accountantI() {
        try {
            String result = obj.transform("ACCOUNTANT I", "Accountant I");
            String result1 = obj.transform("Account I", "Accountant I");
            System.out.println(result);
            System.out.println(result1);
            String expected = "Accountant I";
            String expected1 = "Null";
            Assert.assertEquals(expected, result);
            Assert.assertEquals(expected1, result1);

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    @Test
    public void accountantII() {
        try {

            String result = obj.transform("ACCOUNTANT II", "Accountant II");
            String result1 = obj.transform("Account II", "Accountant II");
            System.out.println(result + "\n" + result1);
            String expected = "Accountant II";
            String expected1 = "Null";
            Assert.assertTrue(obj.transform("ACCOUNTANT II", "ACCOUNTANT II").contains("ACCOUNTANT II"));
            Assert.assertEquals(expected, result);
            Assert.assertEquals("Test passed ", expected1, result1);


        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void accountingCoordAmco() {
        try {
            String result = obj.transform("Accounting Coordinator-Amco", "Accounting Coordinator - AMCO");
            String result1 = obj.transform("ACC CORD AMCO", "Accounting Coordinator - AMCO");
            System.out.println(result + "\n" + result1);
            String expected = "Accounting Coordinator - AMCO";
            String expected1 = "Null";
            Assert.assertEquals("Test Passed", expected, result);
            Assert.assertNotEquals("Test passed ", expected1, result1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void accPayableClerk() {
        try {
            String result = obj.transform("ACCOUNTS PAYABLE CLERK", "Accounts Payable Clerk");
            System.out.println(result);
            String expected = "Accounts Payable Clerk";
            Assert.assertEquals(expected, result);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void actuarialAnalyst() {
        String result = obj.transform("ActuarialAnalyst", "Actuarial Analyst");
        System.out.println(result);
        String expected = "Actuarial Analyst";
        Assert.assertEquals(expected, result);

    }

    @Test
    public void actuary() {
        String result = obj.transform("ACTUARY", "Actuary");
        System.out.println(result);
        String expected = "Actuary";
        Assert.assertEquals(expected, result);
    }


    @Test
    public void adminSvcsCoord() {
        String result = obj.transform("ADMIN SVCS COORD I", "Admin Svcs Coord I");
        System.out.println(result);
        String expected = "Admin Svcs Coord I";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void forAdmin() {
        try {
            String result = obj.transform("Admin", "Admin");
            System.out.println("After Transform attr is " + result);
            String result1 = obj.transform("akash", "Admin");
            String result2 = obj.transform("ADMIN", "Admin");
            System.out.println(result + "\n" + result1 + "\n" + result2);
            String expected = "Admin";
            String expected1 = "null";
            String expected2 = "Admin";
            Assert.assertEquals(expected, result);
            Assert.assertNotEquals(expected1, result1);
            Assert.assertEquals(expected2, result2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    @Test
    public void administrativeClerk() {
        String result = obj.transform("ADMINISTRATIVE CLERK", "Administrative Clerk");
        System.out.println(result);
        String expected = "Administrative Clerk";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void aideHomeHealth() {
        String result = obj.transform("AIDE, HOME HEALTH", "Aide, Home Health");
        System.out.println(result);
        String expected = "Aide, Home Health";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void analystOrAnalyst() {
        try {
            String result = obj.transform("ANALYST ", "Analyst");
            String result1 = obj.transform("analys ", "Analyst");
            System.out.println(result + "\n" + result1);
            String expected = "Analyst";
            String expected1 = "Analyst";
            Assert.assertEquals(expected, result);
            Assert.assertEquals(expected1, result1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    @Test
    public void analystData() {
        String result = obj.transform("Analyst,Data", "Analyst,Data");
        System.out.println(result);
        String expected = "Analyst,Data";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void audiologist() {
        String result = obj.transform("AUDIOLOGIST", "Audiologist");
        System.out.println(result);
        String expected = "Audiologist";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void bsfConslt() {
        String result = obj.transform("BS&F Conslt", "BS&F Consultant");
        System.out.println(result);
        String expected = "BS&F Consultant";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void bsfAnl() {
        try{
        String result = obj.transform("BS&F Conslt", "BS&F Analyst");
        String result1 = obj.transform("BS&F Consl", "BS&F Analyst");
        System.out.println(result + "\n" + result1);
        String expected = "BS&F Analyst";
        String expected1 = "BS&F Analyst";
        Assert.assertEquals(expected, result);
        Assert.assertNotEquals(expected1, result1);
    }catch(Exception e)
        {
            System.out.println(e);
        }
    }

    @Test
    public void labAssistantI() {
        try{
        String result = obj.transform("Lab Asst I", "Lab Assistant I");
        String result1 = obj.transform("Lab ASST I ", "Lab Assistant I");
        String result2 = obj.transform("LAB ASST I", "Lab Assistant I");
        String result3 = obj.transform("LAB ASST ", "Lab Assistant I");
        System.out.println(result + "\n" + result1 + "\n" + result2 + "\n" + result3);
            System.out.println(result2);
        String expected = "Lab Assistant I";
        String expected1 = "Lab Assistant I";
        String expected2 = "Lab Assistant I";
        String expected3 = "Lab assistant i";
        Assert.assertEquals(expected, result);
        Assert.assertEquals(expected1, result1);
        Assert.assertEquals(expected2, result2);
        Assert.assertNotEquals(expected3, result3);
    }catch(Exception e)
        {
            System.out.println(e);
        }
    }

    @Test
    public void labAssistantII() {
        try{
        String result = obj.transform("Lab Asst II", "Lab Assistant II");
        String result1 = obj.transform("Lab ASST II ", "Lab Assistant II");
        String result2 = obj.transform("LAB ASST II", "Lab Assistant II");
        String result3 = obj.transform("LAB ASST ", "Lab Assistant II");
        System.out.println(result + "\n" + result1 + "\n" + result2 + "\n" + result3);
        String expected = "Lab Assistant II";
        String expected1 = "Lab Assistant II";
        String expected2 = "Lab Assistant II";
        String expected3 = "Lab assistant ii";
        Assert.assertEquals(expected, result);
        Assert.assertEquals(expected1, result1);
        Assert.assertEquals(expected2, result2);
        Assert.assertNotEquals(expected3, result3);
    }catch(Exception e)
        {
            System.out.println(e);
        }
    }

    @Test
    public void show() {
        try{
        String result = obj.transform("Behavioral Medicine Spec LCSW".trim(), "Behavioral Medicine Spec (LCSW)");
        String result1 = obj.transform("Behavioral Medicn Spec LCSW".trim(), "Behavioral Medicine Spec (LCSW)");
        String result2 = obj.transform("Behavioral Medicn Spec (LCSW)".trim(), "Behavioral Medicine Spec (LCSW)");
        System.out.println(result + "\n" + result1 + "\n" + result2);
        String expected2, expected1;
        String expected = expected1 = expected2 = "Behavioral Medicine Spec (LCSW)";
        Assert.assertEquals(expected, result);
        Assert.assertEquals(expected1, result1);
        Assert.assertEquals(expected2, result2);
    }catch(Exception e)
        {
            System.out.println(e);
        }
    }


    @Test
    public void accManager() {
        try {
            String result = obj.transform("ACCOUNT MANAGER - OHS".trim(), "Account Manager - OHS");
            String result1 = obj.transform("Account Manager-OHS".trim(), "Account Manager - OHS");
            String result2 = obj.transform("ACCOUNT MANAGER".trim(), "Account Manager - OHS");
            String result3 = obj.transform("SR','ACCOUNT MANAGER, SR".trim(), "Account Manager - OHS");
            String result4 = obj.transform("SR','ACCOUNT MANAGER SR".trim(), "Account Manager - OHS");
            String result5 = obj.transform("SR','ACCOUNT MANAGER ".trim(), "Account Manager - OHS");

            System.out.println(result + "\n" + result1 + "\n" + result2 + "\n" + result3 + "\n" + result4 + "\n" + result5);

            String expected, expected1, expected2, expected3, expected4, expected5;
            expected = expected1 = expected2 = expected4 = expected3 = expected5 = "Account Manager - OHS";
            Assert.assertEquals(expected, result);
            Assert.assertEquals(expected1, result1);
            Assert.assertEquals(expected2, result2);
            Assert.assertEquals(expected3, result3);
            Assert.assertEquals(expected4, result4);
            Assert.assertNotEquals(expected5, result5);


        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //Test cases for country

    @Test
    public void forUS() {
        try {
            String result = obj.transform("US", "United States of America");
            String result1 = obj.transform("us", "United States of America");
            String result2 = obj.transform("CALIFORNIA", "United States of America");
            String result3 = obj.transform("California", "United States of America");

            System.out.println(result + "\n" + result1 + "\n" + result2 + "\n" + result3);
            String expected, expected1, expected2, expected3;
            expected = expected1 = expected2 = expected3 = "United States of America";
            Assert.assertEquals(expected, result);
            Assert.assertEquals(expected1, result1);
            Assert.assertEquals(expected2, result2);
            Assert.assertEquals(expected3, result3);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void forIndia() {
        String result = obj.transform("ind", "India");
        String result1 = obj.transform("IND", "India");
        String result2 = obj.transform("INDIA", "India");

        System.out.println(result + "\n" + result1 + "\n" + result2);
        String expected, expected1, expected2;
        expected = expected1 = expected2 = "India";
        Assert.assertEquals(expected, result);
        Assert.assertEquals(expected1, result1);
        Assert.assertEquals(expected2, result2);

    }


    @Test
    public void afg() {
        try {
            String result = obj.transform("AFG", "AFG");
            System.out.println(result);
            String expected = "AFG";
            Assert.assertEquals(expected, result);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void forCameroon() {
        String result = obj.transform("cameroon", "Cameroon");
        System.out.println(result);
        String expected = "Cameroon";
        Assert.assertEquals(expected, result);

    }

    @Test
    public void forUk() {
        try {
            String result = obj.transform("uk", "United Kingdom");
            String result1 = obj.transform("uk", "United Kingdom");
            System.out.println(result + "\n" + result);
            String expected = "United Kingdom";
            String expected1 = "United Kingdom";
            Assert.assertEquals(expected, result);
            Assert.assertEquals(expected1, result1);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void forTrinidad() {
        String result = obj.transform("TrinidadTRO", "Trinidad");
        System.out.println(result);
        String expected = "Trinidad";
        Assert.assertEquals(expected, result);

    }

    @Test
    public void forArgentina() {
        String result = obj.transform("ARG", "Argentina");
        System.out.println(result);
        String expected = "Argentina";
        Assert.assertEquals(expected, result);

    }


    @Test
    public void forNull() {
        String result = obj.transform("XXX", "NULL");
        String result1 = obj.transform("countr", "NULL");
        String result2 = obj.transform("country", "NULL");
        String result3 = obj.transform("111", "NULL");

        System.out.println(result + "\n" + result1 + "\n" + result2 + "\n" + result3);
        String expected, expected1, expected2, expected3;
        expected = expected1 = expected2 = expected3 = "NULL";
        Assert.assertEquals(expected, result);
        Assert.assertEquals(expected1, result1);
        Assert.assertEquals(expected2, result2);
        Assert.assertEquals(expected3, result3);
    }


}
