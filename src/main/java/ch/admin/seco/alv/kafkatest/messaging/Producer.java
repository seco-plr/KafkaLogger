package ch.admin.seco.alv.kafkatest.messaging;


public interface Producer<T, U extends Binding<T>> {

    void produce(final T t);
}
