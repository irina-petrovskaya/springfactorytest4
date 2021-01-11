package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * *
 * <p>Created by irina on 11.01.2021.</p>
 * <p>Project: springfactorytest4</p>
 * *
 */

@Target(value={TYPE,METHOD})
@Retention(value=RUNTIME)
@Documented
public @interface ConditionalAnno1 {
}
