package com.gy.abstractfactory;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.NestedParticle;

/**
 * @author guoyou
 * @date 2019/9/4 9:32
 */
public  abstract class CourseFactory {

    public abstract Article article();

    public abstract Video video();
}
