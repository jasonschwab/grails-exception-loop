package intex

import groovy.util.logging.Slf4j

@Slf4j
class TestInterceptor {

    boolean before() {
        log.error("Before Test Interceptor")
        throw new Exception("Test Exception")
        true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
