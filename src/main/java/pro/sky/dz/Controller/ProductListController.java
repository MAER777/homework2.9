//package pro.sky.dz.Controller;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import pro.sky.dz.Model.Item;
//import pro.sky.dz.Service.ProductService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/products")
//public class ProductListController {
//    private final ProductService productService;
//
//    public ProductListController(ProductService productService) {
//        this.productService = productService;
//    }
//
//    @GetMapping
//    public List<Item> allProduct() {
//        return productService.productList();
//    }
//
//    @GetMapping(path = "add")
//    public Item addProduct(@RequestParam ("id") Integer id,
//                           @RequestParam ("name") String product) {
//        return productService.addProduct(id, product);
//    }
//
//    @GetMapping(path = "dell")
//    public Item dellProduct(@RequestParam ("id") Integer id,
//                            @RequestParam ("name") String product) {
//        return productService.dellProduct(id, product);
//    }
//}
