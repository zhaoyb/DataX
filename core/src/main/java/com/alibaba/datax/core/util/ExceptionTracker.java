package com.alibaba.datax.core.util;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 *  异常包装类
 */
public class ExceptionTracker {

    public static final int STRING_BUFFER = 4096;

    public static String trace(Throwable ex) {
        StringWriter sw = new StringWriter(STRING_BUFFER);
        PrintWriter pw = new PrintWriter(sw);
        ex.printStackTrace(pw);
        return sw.toString();
    }
}