package com.shop.jewellery.api;


import com.shop.jewellery.entity.Payment;
import com.shop.jewellery.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v2/payment")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/allPay")
    List<Payment> getAllPayments() {return this.paymentService.getAllPayments();}

    @GetMapping("/{payment_id}")
    ResponseEntity<?> getPaymentById(@PathVariable UUID payment_id) {return this.paymentService.getPaymentById(payment_id);}

    @PostMapping("/sendPayment")
    ResponseEntity<Payment> addNewPayment(@Validated @RequestBody Payment payment) throws URISyntaxException{
        return this.paymentService.addNewPayment(payment);
    }

    @DeleteMapping("/deletePayment/{id}")
    ResponseEntity<?> deletePayment(@PathVariable UUID id) {return this.paymentService.deletePayment(id);
    }

    @RequestMapping("/paymentStatus/{paymentstatus}")
    List<Payment>getPaymentByPaymentStatus(@PathVariable String paymentstatus){
        return this.paymentService.getPaymentByPaymentStatus(paymentstatus);
    }

    @PutMapping("/updatePayment/{id}")
    ResponseEntity<Payment> updatePayment(@Validated @RequestBody Payment Payment){
        return this.paymentService.updatePayment(Payment);
    }


}
