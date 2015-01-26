package name.wilu.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import name.wilu.model.Hotel;
import org.apache.struts2.convention.annotation.Action;


@Action("modelDriven")
public class DrivenFormAction extends ActionSupport implements ModelDriven<Hotel>{

    private Hotel hotel = new Hotel("Model Driven Hotel");

    @Override
    public String execute() throws Exception {
        System.out.println("It works!");
        return super.execute();
    }

    public String handle() {
        System.out.println(hotel);
        return ActionSupport.SUCCESS;
    }

    public Hotel getModel() {
        return hotel;
    }
}
