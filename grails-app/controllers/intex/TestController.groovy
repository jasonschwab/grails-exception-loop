package intex

class TestController {

    static allowedMethods = [doTest : 'GET']

    def doTest() {
        render "Hello"
    }
}
