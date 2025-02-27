package ru.javaops.cloudjava.menuservice.storage.repositories.updaters;

import jakarta.persistence.criteria.CriteriaUpdate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.javaops.cloudjava.menuservice.dto.UpdateMenuRequest;
import ru.javaops.cloudjava.menuservice.storage.model.MenuItem;
import ru.javaops.cloudjava.menuservice.storage.model.MenuItem_;

import java.math.BigDecimal;
import java.util.function.Function;

@Configuration
public class MenuAttrUpdaters {

    @Bean
    MenuAttrUpdater<String> description() {
        return new MenuAttrUpdater<>(UpdateMenuRequest::getDescription,
                criteria -> criteria.set(MenuItem_.description, "value"));
    }

    @Bean
    MenuAttrUpdater<String> imageUrl() {
        return new MenuAttrUpdater<>(UpdateMenuRequest::getImageUrl,
                criteria -> criteria.set(MenuItem_.imageUrl, "value"));
    }

    @Bean
    MenuAttrUpdater<String> name() {
        return new MenuAttrUpdater<>(UpdateMenuRequest::getName,
                criteria -> criteria.set(MenuItem_.name, "value"));
    }

    @Bean
    MenuAttrUpdater<BigDecimal> price() {
        return new MenuAttrUpdater<>(UpdateMenuRequest::getPrice,
                criteria -> criteria.set(String.valueOf(MenuItem_.price), "value"));
    }

    @Bean
    MenuAttrUpdater<Long> timeToCook() {
        return new MenuAttrUpdater<>(UpdateMenuRequest::getTimeToCook,
                criteria -> criteria.set(String.valueOf(MenuItem_.timeToCook), "value"));
    }
}
