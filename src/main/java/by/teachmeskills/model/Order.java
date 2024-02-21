package by.teachmeskills.model;
import lombok.Data;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Setter
@Data
@XmlRootElement(name = "order")
public class Order {
    private String date;

    private String shopName;

    private Product product;


    @XmlAttribute(name = "date")
    public String getDate() {
        return date;
    }

    @XmlElement(name = "shopname")
    public String getShopName() {
        return shopName;
    }

    @XmlElement(name = "product")
    public Product getProduct() {
        return product;
    }

}
