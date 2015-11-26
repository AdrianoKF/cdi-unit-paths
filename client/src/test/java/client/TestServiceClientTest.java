package client;

import helper.Helper;
import org.jglue.cdiunit.AdditionalClasspaths;
import org.jglue.cdiunit.CdiRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import service.TestService;

import javax.inject.Inject;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(CdiRunner.class)
@AdditionalClasspaths(TestService.class)
public class TestServiceClientTest {
    @Inject
    Helper helper;

    @Test
    public void testDoSomething() throws Exception {
        final TestService service = mock(TestService.class);
        final TestServiceClient client = new TestServiceClient(service);

        client.doSomething();

        verify(service).getRandomNumber();
    }
}
