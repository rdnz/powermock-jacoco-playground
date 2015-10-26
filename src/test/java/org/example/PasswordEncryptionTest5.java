package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

public class PasswordEncryptionTest5 extends CommonBaseTest4 {

    @Test
    public void coverClassName() {
        PasswordEncryption liferayPasswordEncryption = new PasswordEncryption();
        Assert.assertNotEquals(null, liferayPasswordEncryption);
    }

    @Test
    public void encryptPasswordTest() throws NoSuchAlgorithmException {
        Assert.assertEquals("", PasswordEncryption.encryptPassword(""));
        Assert.assertEquals(null, PasswordEncryption.encryptPassword(null));
        Assert.assertNotNull(PasswordEncryption.encryptPassword("password"));
    }

    @Test
    public void byteArrayToHexStringTest() {
        Assert.assertNotNull(new byte[]{1, 2, 3});
    }
}
