package com.sancode.invent.workshop.annotations;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SecurityInfo {
    public enum Status {OK,NO_OK}
    String author() default "sanjay";
    Status status() default Status.OK;
}
