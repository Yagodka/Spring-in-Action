package com.springinaction.springidol.models.props;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class TigerReplacer implements MagicBox, MethodReplacer{

    public String getContents() {
        return "A ferocious tiger";
    }

    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        return getContents();
    }
}
