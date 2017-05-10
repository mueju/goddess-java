package com.bjike.goddess.common.utils.excel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Excel 标题(表头)
 *
 * @Author: [liguiqin]
 * @Date: [2017-05-10 09:24]
 * @Description: [ ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ExcelTitle {

    public String name();


    public boolean notNull() default false;
}