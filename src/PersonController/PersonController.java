package PersonController;

import MyPackage.Person;
import ViewPerson.PersonView;

public class PersonController {
    private Person model;
    private PersonView view;
    public PersonController(Person model, PersonView view){
        this.model = model;
        this.view = view;
    }

    public void setPersonFirstname(String firstname){
        model.setFirstName(firstname);
    }
    public String getPersonFirstname(){
        return model.getFirstName();
    }
    public void setPersonLastname(String lastname){
        model.setLastName(lastname);
    }
    public String getPersonLastname(){
        return model.getLastName();
    }
    public void setPersonjob(String job){
        model.setLastName(job);
    }
    public String getPersonjob(){
        return model.getJob();
    }
}
