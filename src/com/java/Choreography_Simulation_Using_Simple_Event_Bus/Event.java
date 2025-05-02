package com.java.Choreography_Simulation_Using_Simple_Event_Bus;

import java.util.*;
//Event Bus to Simulate Message Communication
interface Event {
}
interface EventListener{
    void onEvent(Event e);
}

class EventBus {
    private static final Map<Class<? extends Event>, List<EventListener>> listeners = new HashMap<>();

    public static <T extends Event> void subscribe(Class<T> eventType, EventListener listener) {
        listeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(listener);
    }

    public static void publish(Event event) {
        List<EventListener> eventListeners = listeners.getOrDefault(event.getClass(), Collections.emptyList());
        for (EventListener listener : eventListeners) {
            listener.onEvent(event);
        }
    }
}


//2.2️⃣ Define Events
class OrderCreated implements Event {
    public final String orderId;
    public OrderCreated(String orderId) { this.orderId = orderId; }
}

class PaymentCompleted implements Event {
    public final String orderId;
    public PaymentCompleted(String orderId) { this.orderId = orderId; }
}

class ShippingCompleted implements Event {
    public final String orderId;
    public ShippingCompleted(String orderId) { this.orderId = orderId; }
}
//3 Microservices as Event Listeners

class OrderService {
    public void createOrder(String orderId) {
        System.out.println("Order created: " + orderId);
        EventBus.publish(new OrderCreated(orderId));
    }
}

class PaymentService implements EventListener {
    public PaymentService() {
        EventBus.subscribe(OrderCreated.class, this);
    }

    public void onEvent(Event e) {
        OrderCreated event = (OrderCreated) e;
        System.out.println("Processing payment for order: " + event.orderId);
        EventBus.publish(new PaymentCompleted(event.orderId));
    }
}

class ShippingService implements EventListener {
    public ShippingService() {
        EventBus.subscribe(PaymentCompleted.class, this);
    }

    public void onEvent(Event e) {
        PaymentCompleted event = (PaymentCompleted) e;
        System.out.println("Shipping order: " + event.orderId);
        EventBus.publish(new ShippingCompleted(event.orderId));
    }
}
//4 Main Application

 class Main {
    public static void main(String[] args) {
        new PaymentService();
        new ShippingService();

        OrderService orderService = new OrderService();
        orderService.createOrder("ORD123");
    }
}
