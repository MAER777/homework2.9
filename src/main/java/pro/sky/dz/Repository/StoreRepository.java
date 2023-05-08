package pro.sky.dz.Repository;

import org.springframework.stereotype.Repository;
import pro.sky.dz.Model.Item;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StoreRepository {
    private int idCounter = 1;
    private final Map<Integer, Item> store = new HashMap<>();

    @PostConstruct
    public void init() {
        store.put(idCounter, new Item(idCounter++, "Апельсин"));
        store.put(idCounter, new Item(idCounter++, "Мандарин"));
        store.put(idCounter, new Item(idCounter++, "Чебурек"));
        store.put(idCounter, new Item(idCounter++, "Самокат"));
        store.put(idCounter, new Item(idCounter++, "Велосипед"));
        store.put(idCounter, new Item(idCounter++, "Рыба"));
        store.put(idCounter, new Item(idCounter++, "Носок"));
        store.put(idCounter, new Item(idCounter++, "Фартук"));
    }

    public void add(Item item) {
        store.put(item.getId(), item);
    }

    public Item get(int id) {
        return store.get(id);
    }

    public List<Item> getAll() {
        return new ArrayList<>(store.values());
    }

    public void update(int id, Item item) {
        if (store.containsKey(id)) {
            store.replace(id, item);
        }
    }

    public Item delete (int id) {
        return store.remove(id);
    }
}
