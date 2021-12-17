package plus.yuhaozhang.blog.common.aop;

import java.lang.annotation.*;
/**
 * @author Yuh Z
 * @date 12/16/21
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Cache {
    long expire() default 1*60*1000;
    //cache key
    String name() default "";
}
