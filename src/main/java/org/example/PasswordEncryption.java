package org.example;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.sun.jersey.core.util.Base64;

public class PasswordEncryption {

    public static boolean isNull(final String string) {
        return string == null ? true : false;
    }

    public static boolean isNullOrEmpty(String string) {
        return (isNull(string) || string.trim().length() == 0) ? true : false;
    }

    public static String encryptPassword(final String password) throws NoSuchAlgorithmException {
        if (isNullOrEmpty(password)) {
            return password;
        } else {
            return new String(Base64.encode(hexStringToByteArray(toSHA1(password.getBytes()))));
        }
    }

    private static String toSHA1(final byte[] convertme) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        return byteArrayToHexString(md.digest(convertme));
    }

    private static String byteArrayToHexString(final byte[] b) {
        String result = "";
        for (int i = 0; i < b.length; i++) {
            result += Integer.toString( ( b[i] & 0xff ) + 0x100, 16).substring( 1 );
        }
        return result;
    }

    private static byte[] hexStringToByteArray(final String s) {
        final int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) +
                    Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }
}
