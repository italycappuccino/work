package com.stone.core.work.test.cache;

import java.io.Serializable;

/**
 * 
 * @author linco lee
 */

public class TairKey implements Serializable {

    Serializable key;
    int time = 0;
    int version = 0;

    public int getTime() {
        return time;
    }

    public int getVersion() {
        return version;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Serializable getKey() {
        return key;
    }

    public void setKey(Serializable key) {
        this.key = key;
    }
}