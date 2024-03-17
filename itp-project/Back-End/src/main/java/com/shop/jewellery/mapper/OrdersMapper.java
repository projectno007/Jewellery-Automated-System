package com.shop.jewellery.mapper;

import com.shop.jewellery.entity.Orders;
import com.shop.jewellery.model.request.orders.OrdersRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OrdersMapper {
    @Mapping(source = "sellableCustomerNIC", target = "customer.NIC")
    @Mapping(source = "sellableCustomerAddress", target = "customer.address")
    @Mapping(source = "sellableCustomerTelephone", target = "customer.telephone")
    @Mapping(source = "sellableCustomerLastName", target = "customer.lastName")
    @Mapping(source = "sellableCustomerFirstName", target = "customer.firstName")
    @Mapping(source = "sellableCustomerName", target = "customer.name")
    @Mapping(source = "sellableCustomerId", target = "customer.id")
    @Mapping(source = "sellableSellPrice", target = "sellable.sellPrice")
    @Mapping(source = "sellableSupplierEmail", target = "supplier.email")
    @Mapping(source = "sellableSupplierCategory", target = "supplier.category")
    @Mapping(source = "sellableSupplierStatus", target = "supplier.status")
    @Mapping(source = "sellableSupplierTelephone", target = "supplier.telephone")
    @Mapping(source = "sellableSupplierCompanyName", target = "supplier.companyName")
    @Mapping(source = "sellableSupplierAddress", target = "supplier.address")
    @Mapping(source = "sellableSupplierName", target = "supplier.name")
    @Mapping(source = "sellableSupplierId", target = "supplier.id")
    @Mapping(source = "sellableSupplyPrice", target = "sellable.supplyPrice")
    @Mapping(source = "sellableImage_url", target = "sellable.image_url")
    @Mapping(source = "sellableMaterial", target = "sellable.material")
    @Mapping(source = "sellableName", target = "sellable.name")
    @Mapping(source = "sellableId", target = "sellable.id")
    @Mapping(source = "paymentPaymentDate", target = "payment.paymentDate")
    @Mapping(source = "paymentPaymentStatus", target = "payment.paymentStatus")
    @Mapping(source = "paymentAmount", target = "payment.amount")
    @Mapping(source = "paymentId", target = "payment.id")
    @Mapping(source = "deliveryDistrict", target = "delivery.district")
    @Mapping(source = "deliveryPhoneNumber", target = "delivery.phoneNumber")
    @Mapping(source = "deliveryProvince", target = "delivery.province")
    @Mapping(source = "deliveryDistance", target = "delivery.distance")
    @Mapping(source = "deliveryStatus", target = "delivery.status")
    @Mapping(source = "deliveryDeliveredTime", target = "delivery.deliveredTime")
    @Mapping(source = "deliveryRequestedTime", target = "delivery.requestedTime")
    @Mapping(source = "deliveryCity", target = "delivery.city")
    @Mapping(source = "deliveryAddress", target = "delivery.address")
    @Mapping(source = "deliveryId", target = "delivery.id")
    Orders toEntity(OrdersRequest ordersRequest);

    @InheritInverseConfiguration(name = "toEntity")
    OrdersRequest toDto(Orders orders);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Orders partialUpdate(OrdersRequest ordersRequest, @MappingTarget Orders orders);
}