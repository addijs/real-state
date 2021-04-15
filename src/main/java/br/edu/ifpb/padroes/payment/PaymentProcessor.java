package br.edu.ifpb.padroes.payment;

import br.edu.ifpb.padroes.domain.Property;

public abstract class PaymentProcessor implements PaymentProcessorHandler {
  protected PaymentProcessorHandler next;

  @Override
  public void setNext(PaymentProcessorHandler handler) {
    this.next = handler;
  }

  protected void runNextHandler(Property property) {
    if (next != null) {
      next.handle(property);
    }
  }
}
