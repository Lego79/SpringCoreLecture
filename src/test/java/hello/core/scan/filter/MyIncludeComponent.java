package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)

@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent { //추가할것
}
