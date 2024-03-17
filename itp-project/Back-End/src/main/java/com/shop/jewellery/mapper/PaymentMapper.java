package com.shop.jewellery.mapper;

import com.shop.jewellery.entity.Payment;
import com.shop.jewellery.model.request.payment.Paymentrequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PaymentMapper {
    Payment toEntity(Paymentrequest paymentrequest);

    Paymentrequest toDto(Payment payment);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Payment partialUpdate(Paymentrequest paymentrequest, @MappingTarget Payment payment);
}