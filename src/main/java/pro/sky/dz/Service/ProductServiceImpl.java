//package pro.sky.dz.Service;
//
//import org.springframework.stereotype.Service;
//import pro.sky.dz.Exception.ProductException;
//import pro.sky.dz.Model.Item;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class ProductServiceImpl implements ProductService{
//    List<Item> products = new ArrayList<>(List.of());
//
//    @Override
//    public Item addProduct(int id,
//                           String nameProduct) throws ProductException {
//        Item item = new Item(id, nameProduct);
//        if (products.contains(item)) {
//            throw new ProductException();
//        }
//        products.add(item);
//        return item;
//    }
//
//    @Override
//    public Item dellProduct(int id,
//                            String nameProduct) {
//        int idp = products.indexOf(new Item(
//                id,
//                nameProduct));
//        return products.remove(idp);
//    }
//
//    @Override
//    public List<Item> getIdProduct() {
//        return Collections.unmodifiableList(products);
//    }
//
//    @Override
//    public List<Item> productList() {
//        return products.stream()
//                .sorted(Comparator.comparingInt(Item::getId))
//                .collect(Collectors.toList());
//    }
//}
