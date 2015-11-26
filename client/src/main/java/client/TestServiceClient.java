package client;

import service.TestService;

/**
 * @author Adrian Rumpold (a.rumpold@ds-lab.org)
 */
public class TestServiceClient {
    final TestService service;

    public TestServiceClient(TestService service) {
        this.service = service;
    }

    public void doSomething() {
        service.getRandomNumber();
    }
}
