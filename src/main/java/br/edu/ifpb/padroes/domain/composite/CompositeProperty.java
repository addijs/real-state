package br.edu.ifpb.padroes.domain.composite;

import br.edu.ifpb.padroes.domain.Property;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeProperty implements Property {
  private List<Property> children = new ArrayList<>();

  public CompositeProperty(Property... properties) {
    this.add(properties);
  }

  @Override
  public float getPrice() {
    float totalPrice = 0;
    for (Property property : children) {
      totalPrice+=property.getPrice();
    }

    return totalPrice;
  }

  private void add(Property property) {
    this.children.add(property);
  }

  private void add(Property... properties) {
    this.children.addAll(Arrays.asList(properties));
  }
}
