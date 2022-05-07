package lev.haladojava.pizza.Pizza.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotDog {
    @NotNull
    private int id;
    @NotBlank
    private String name;
    @NotNull
    @Min(1100)
    @Max(5500)
    private int price;
}
