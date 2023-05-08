package pro.sky.dz.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.dz.Model.Item;
import pro.sky.dz.Service.StoreServiceImpl;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreServiceImpl storeService;

    public StoreController(StoreServiceImpl storeService) {
        this.storeService = storeService;
    }

    @RequestMapping(path = "add")
    public void addStoreList (@RequestParam ("id") Set<Integer> id) {
        storeService.add(id);
    }

    @RequestMapping(path = "get")
    public  List<Item> get() {
        return storeService.get();
    }
}
