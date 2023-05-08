package pro.sky.dz.Service;

import org.springframework.stereotype.Service;
import pro.sky.dz.Model.Box;
import pro.sky.dz.Model.Item;
import pro.sky.dz.Repository.StoreRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StoreServiceImpl {
    private final Box box;
    private final StoreRepository storeRepository;

    public StoreServiceImpl(Box box, StoreRepository storeRepository) {
        this.box = box;
        this.storeRepository = storeRepository;
    }


    public void add(Set<Integer> id) {
        box.add(id);
    }
    public List<Item> get() {
        return box.get().stream()
                .map(id -> storeRepository.get(id))
                .collect(Collectors.toList());
    }
}
