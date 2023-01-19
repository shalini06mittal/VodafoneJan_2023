package com.encrypt.decrypt;

import java.io.File;

public interface Constants {

	public static final byte[] DATA = "This is a test".getBytes();
	 
    public static final File DATA_FILE = new File( "encrypted.data" );
    public static final File KEY_FILE = new File( "key.data" );
}

