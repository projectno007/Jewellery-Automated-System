package com.shop.jewellery.repository;

import com.shop.jewellery.entity.DeliverBoy;
import com.shop.jewellery.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface DeliverRepository extends JpaRepository<Delivery, UUID> {
    List<Delivery> findByDeliverBoy(DeliverBoy deliverBoy);
    List<Delivery> findByStatus(String status);
    @Query("select d "+
            "from Delivery d "+
            "where d.customer=?1 and d.status=?2")
    List<Delivery> findByCustomerId(String customerId,String status);
    @Query("select d "+
    "from Delivery d "+
    "where d.deliverBoy=?1 and d.status=?2 and d.deliveredTime=?3")
    List<Delivery> findByDeliveredTime(DeliverBoy deliverBoy,String status,String deliveredTime);
    @Query("select d "+
            "from Delivery d "+
            "where d.status=?1 and d.deliverBoy=?2")
    List<Delivery> findByDeliveryBoyAndStatus(String status,DeliverBoy deliverBoy);
    @Query("select d "+
            "from Delivery d "+
            "where d.status=?1 or d.status=?2")
    List<Delivery>findByDeliveryBoyTwoStatus(String status,String status2);
}
