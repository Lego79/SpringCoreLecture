package hello.core.scan;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyIncludeComponent {
    @Test
    void filterScan() {
        ApplicationContext ac = new AnnotationConfigApplicationContext();
    }
}
