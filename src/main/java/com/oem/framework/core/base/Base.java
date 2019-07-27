package com.oem.framework.core.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Base {

    default Logger getLogger(){
        return  LoggerFactory.getLogger(this.getClass());

    }
}
