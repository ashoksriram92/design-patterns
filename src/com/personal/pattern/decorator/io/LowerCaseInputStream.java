package com.personal.pattern.decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * File IO is using decorator pattern.
 * 
 * FilterInputStream is the abstract Decorator class from which other decorators extend
 * We are decorating the input stream to convert the read input to lower case
 * 
 * How cool is that? :D
 * 
 * @author ashoksrirampandian
 */
public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }
    
    public int read() throws IOException {
        int c = super.read();
        return ( c == -1 ? c : Character.toLowerCase( (char) c ));
    }
    
    public int read( byte[] b, int offset, int len ) throws IOException {
        int result = super.read(b, offset, len);
        for( int i = offset; i < offset + result; i++ ) {
            b[i] = (byte) Character.toLowerCase( (char) b[i] );
        }
        
        return result;
    }
}
