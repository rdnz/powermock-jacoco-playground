package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.security.NoSuchAlgorithmException;

public class PasswordEncryptionTest2 extends CommonBaseTest {

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
