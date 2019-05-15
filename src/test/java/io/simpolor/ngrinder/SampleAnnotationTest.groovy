package io.simpolor.ngrinder

import net.grinder.plugin.http.HTTPRequest
import net.grinder.script.GTest
import net.grinder.scriptengine.groovy.junit.GrinderRunner
import net.grinder.scriptengine.groovy.junit.annotation.AfterProcess
import net.grinder.scriptengine.groovy.junit.annotation.AfterThread
import net.grinder.scriptengine.groovy.junit.annotation.BeforeProcess
import net.grinder.scriptengine.groovy.junit.annotation.BeforeThread
import net.grinder.scriptengine.groovy.junit.annotation.Repeat
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@Repeat(10) // 해당 테스트 클래스에 대한 반복
@RunWith(GrinderRunner)
class SampleAnnotationTest {

    public static GTest test
    public static HTTPRequest request

    @BeforeProcess
    static void beforeProcess() {
        println("> beforeProcess!!")
    }

    @BeforeThread
    void beforeThread() {
        println(">> beforeThread!!")
    }

    @Before
    void before() {
        println(">>> before!!")
    }

    @Test
    void test(){
        println("test!!")
    }

    @Test
    void test2(){
        println("test2!!")
    }

    @After
    void after() {
        println(">>> after!!")
    }

    @AfterThread
    void afterThread() {
        println(">> afterThread!!")
    }

    @AfterProcess
    void afterProcess() {
        println("> afterProcess!!")
    }

}
