package it.auties.whatsapp.model.message.payment;

import it.auties.protobuf.base.ProtobufProperty;
import it.auties.whatsapp.model.message.model.MessageContainer;
import it.auties.whatsapp.model.message.model.MessageKey;
import it.auties.whatsapp.model.message.model.MessageType;
import it.auties.whatsapp.model.message.model.PaymentMessage;
import it.auties.whatsapp.model.payment.PaymentBackground;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.extern.jackson.Jacksonized;

import static it.auties.protobuf.base.ProtobufType.MESSAGE;

/**
 * A model class that represents a message to confirm a {@link RequestPaymentMessage}.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Jacksonized
@Builder
@Accessors(fluent = true)
public final class SendPaymentMessage implements PaymentMessage {
    /**
     * The caption message, that is the message below the payment confirmation
     */
    @ProtobufProperty(index = 2, type = MESSAGE, implementation = MessageContainer.class)
    private MessageContainer noteMessage;

    /**
     * The key of the original {@link RequestPaymentMessage} that this message confirms
     */
    @ProtobufProperty(index = 3, type = MESSAGE, implementation = MessageKey.class)
    private MessageKey requestMessageKey;

    @ProtobufProperty(index = 4, name = "background", type = MESSAGE)
    private PaymentBackground background;

    @Override
    public MessageType type() {
        return MessageType.SEND_PAYMENT;
    }
}