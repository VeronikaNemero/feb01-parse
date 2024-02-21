package by.teachmeskills.jaxb;

import by.teachmeskills.model.Order;
import by.teachmeskills.model.OrdersList;
import by.teachmeskills.model.Product;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class MainJaxb {
    public static void main(String[] args) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(OrdersList.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            OrdersList ordersList = (OrdersList) unmarshaller.unmarshal(new File("D:\\coding\\с72\\order.xml"));
            System.out.println(ordersList.getOrders());

            Marshaller marshaller = jaxbContext.createMarshaller();
            Order order = new Order();
            order.setDate("01.01.2024");
            order.setShopName("santa");
            Product product = new Product();
            product.setProductName("flowers");
            product.setProductValue("200");
            order.setProduct(product);
            marshaller.marshal(order, new File("D:\\coding\\с72\\order2.xml"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}