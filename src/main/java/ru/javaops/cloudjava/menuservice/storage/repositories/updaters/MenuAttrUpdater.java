package ru.javaops.cloudjava.menuservice.storage.repositories.updaters;

import jakarta.persistence.criteria.CriteriaUpdate;
import lombok.AllArgsConstructor;
import ru.javaops.cloudjava.menuservice.dto.UpdateMenuRequest;
import ru.javaops.cloudjava.menuservice.storage.model.MenuItem;
import java.util.function.Function;

@AllArgsConstructor
public class MenuAttrUpdater<V> {
    private final Function<UpdateMenuRequest, V> extractor;
    private final Function<CriteriaUpdate<MenuItem>, CriteriaUpdate<MenuItem>> setter;

    public void updateAttr(CriteriaUpdate<MenuItem> criteria, UpdateMenuRequest dto) {
        V value = extractor.apply(dto);
        if (value != null) {
            setter.apply(criteria).set("value", value);
        }
    }
}
