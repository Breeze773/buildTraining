package com.thoughtworks;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.io.IOException;

public class HelloWorldTest {
    private HelloWorld hello;

    @Before
    public void setup() {
        hello = new HelloWorld();
    }

    @Test
    public void testCanSayHello() {
        assertTrue(hello.sayHello("", "").contains("Hello World"));
    }


    @Test
    public void testSetsContentType() throws IOException, ServletException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PrintWriter writer = mock(PrintWriter.class);
        when(response.getWriter()).thenReturn(writer);
        hello.doGet(request, response);
        verify(response).setContentType("text/html");
        verify(request).getRequestURI();
    }

}
