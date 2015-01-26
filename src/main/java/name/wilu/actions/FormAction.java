package name.wilu.actions;

import com.opensymphony.xwork2.ActionSupport;
import name.wilu.model.Hotel;
import org.apache.struts2.convention.annotation.Action;


@Action("userForm")
public class FormAction extends ActionSupport {

    private Hotel hotel;

    @Override
    public String execute() throws Exception {
        System.out.println("It works!");
        return super.execute();
    }

    public String handle() {
        System.out.println(hotel);
        return ActionSupport.SUCCESS;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
        System.out.println("Setter injection!");
    }
}
