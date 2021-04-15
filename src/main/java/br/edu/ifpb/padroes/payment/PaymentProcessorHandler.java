package br.edu.ifpb.padroes.payment;

import br.edu.ifpb.padroes.domain.Property;

public interface PaymentProcessorHandler {
    void setNext(PaymentProcessorHandler handler);
    void handle(Property property);
}
