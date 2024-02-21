package by.teachmeskills.model;
import by.teachmeskills.model.Order;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlRootElement(name = "orders")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrdersList {

    @XmlElement(name = "order")
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }
}
