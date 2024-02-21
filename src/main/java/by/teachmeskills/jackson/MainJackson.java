package by.teachmeskills.jackson;

import by.teachmeskills.model.OrdersList;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class MainJackson {
    public static void main(String[] args) {

        try{
            ObjectMapper objectMapper = new ObjectMapper();
            File file = new File("D:\\coding\\с72\\order-js.json");
            OrdersList ordersList = objectMapper.readValue(file, OrdersList.class);
            System.out.println(ordersList.getOrders());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
