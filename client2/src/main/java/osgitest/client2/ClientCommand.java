package osgitest.client2;

import org.apache.karaf.shell.api.action.Action;
import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Reference;
import org.apache.karaf.shell.api.action.lifecycle.Service;

import osgitest.model.Person;
import osgitest.service.PersonService;

@Command(scope = "test", name = "client2")
@Service
public class ClientCommand implements Action {

    @Reference
    PersonService service;

    @Argument(index = 0, name = "firstName")
    String name;

    @Override
    public Object execute() throws Exception {
        Person person = service.getPerson(name);
        System.out.println("Client2: " + person.getFirstName() + " " + person.getLastName());
        return null;
    }

}
