package name.wilu.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;


@Action("userForm")
public class FormAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        System.out.println("It works!");
        return super.execute();
    }
}
