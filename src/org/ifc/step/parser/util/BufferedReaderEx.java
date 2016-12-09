package org.ifc.step.parser.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by coyove on 2016/12/5.
 */
public class BufferedReaderEx extends BufferedReader {
    // It's hard to overflow, maybe...
    private int cachedRead = -2;

    private int curLine = 0;

    public BufferedReaderEx(Reader in) {
        super(in);
    }

    public int getCurLine() {
        return curLine + 1;
    }

    @Override
    public int read() {
        if (cachedRead != -2) {
            int tmp = cachedRead;
            cachedRead = -2;
            if (tmp == '\n') {
                curLine++;
            }

            return tmp;
        }

        try {
            int ret = super.read();
            if (ret == '\n') {
                curLine++;
            }

            return ret;
        } catch (IOException e) {
            return -1;
        }
    }

    public int next() {
        try {
            cachedRead = super.read();
            return cachedRead;
        } catch (IOException e) {
            cachedRead = -1;
            return -1;
        }
    }

    public void commit() {
        cachedRead = -2;
    }
}
