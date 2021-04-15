package br.edu.ifpb.padroes.payment;

import br.edu.ifpb.padroes.domain.Property;
import br.edu.ifpb.padroes.payment.processors.GovernmentTaxesPayment;
import br.edu.ifpb.padroes.payment.processors.PropertyPayment;
import br.edu.ifpb.padroes.payment.processors.RealEstatePayment;

public class PaymentService {

    public void pay(Property sale) {
        PaymentProcessorHandler governmentTaxesPayment = new GovernmentTaxesPayment();
        PaymentProcessorHandler realEstatePayment = new RealEstatePayment();
        PaymentProcessorHandler propertyPayment = new PropertyPayment();

        governmentTaxesPayment.setNext(realEstatePayment);
        realEstatePayment.setNext(propertyPayment);

        governmentTaxesPayment.handle(sale);
    }

}
