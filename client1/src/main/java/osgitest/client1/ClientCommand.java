package osgitest.client1;

import org.apache.karaf.shell.api.action.Action;
import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Reference;
import org.apache.karaf.shell.api.action.lifecycle.Service;

import osgitest.service.PersonService;

@Command(scope = "test", name = "client1")
@Service
public class ClientCommand implements Action {

    @Reference
    PersonService service;

    @Argument(index = 0, name = "firstName")
    String name;

    @Override
    public Object execute() throws Exception {
        System.out.println("Client1: " + service.getPerson(name).getFirstName());
        return null;
    }

}
