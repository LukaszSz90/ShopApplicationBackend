package pl.Lukasz90sz.shopapplication.product.controlller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.Lukasz90sz.shopapplication.product.controlller.model.Product;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        return List.of(
                new Product("Nowy produkt 1", "Nowa kategoria 1", "Nowy opis 1", new BigDecimal("1.99"), "PLN"),
                new Product("Nowy produkt 2", "Nowa kategoria 2", "Nowy opis 2", new BigDecimal("2.99"), "PLN"),
                new Product("Nowy produkt 3", "Nowa kategoria 3", "Nowy opis 3", new BigDecimal("3.99"), "PLN"),
                new Product("Nowy produkt 4", "Nowa kategoria 4", "Nowy opis 4", new BigDecimal("4.99"), "PLN")
        );
    }
}
