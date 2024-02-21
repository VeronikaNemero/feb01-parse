package by.teachmeskills.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
public class Product {
    private String productName;

    private String productValue;

    @XmlElement(name = "productname")
    public String getProductName() {
        return productName;
    }

    @XmlElement(name = "productvalue")
    public String getProductValue() {
        return productValue;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductValue(String productValue) {
        this.productValue = productValue;
    }
}
