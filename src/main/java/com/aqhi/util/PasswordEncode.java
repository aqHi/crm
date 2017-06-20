package com.aqhi.util;



import org.apache.shiro.crypto.hash.Md5Hash;

import org.apache.shiro.crypto.hash.Sha256Hash;
import sun.security.provider.MD5;

/**
 * Created by lj on 2017/6/4.
 */
public class PasswordEncode {

    public static String encodePassword(String password , String salt){
        String sha1 = new Sha256Hash(password, salt).toString();
        String md5 = new Md5Hash(sha1, salt).toString();
        return md5;
    }


}
