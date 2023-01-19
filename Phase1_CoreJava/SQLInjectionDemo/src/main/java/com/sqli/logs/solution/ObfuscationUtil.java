package com.sqli.logs.solution;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

import org.apache.commons.codec.binary.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObfuscationUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(ObfuscationUtil.class);

    public static String obfuscateData(String data) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedhash = digest.digest(data.getBytes(StandardCharsets.UTF_8));
            return new String(Hex.encodeHex(encodedhash));
        } catch (Exception e) {
            LOGGER.error("error hashing data, outputting empty string instead");
            return "";
        }
    }
}
