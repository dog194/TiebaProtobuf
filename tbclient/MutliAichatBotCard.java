package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class MutliAichatBotCard extends Message {
    public static final List<AichatBotCard> DEFAULT_AICHAT_BOT_CARD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_INVALID_BOT = 0;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<AichatBotCard> aichat_bot_card_list;

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer has_invalid_bot;

    @ProtoField(tag = 3)
    public final InvalidInfo invalid_info;

    public static final class Builder extends Message.Builder<MutliAichatBotCard> {
        public List<AichatBotCard> aichat_bot_card_list;
        public Integer has_invalid_bot;
        public InvalidInfo invalid_info;

        public Builder() {
        }

        public Builder(MutliAichatBotCard mutliAichatBotCard) {
            super(mutliAichatBotCard);
            if (mutliAichatBotCard == null) {
                return;
            }
            this.aichat_bot_card_list = Message.copyOf(mutliAichatBotCard.aichat_bot_card_list);
            this.has_invalid_bot = mutliAichatBotCard.has_invalid_bot;
            this.invalid_info = mutliAichatBotCard.invalid_info;
        }

        @Override // com.squareup.wire.Message.Builder
        public MutliAichatBotCard build(boolean z) {
            return new MutliAichatBotCard(this, z);
        }
    }

    public MutliAichatBotCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<AichatBotCard> list = builder.aichat_bot_card_list;
            if (list == null) {
                this.aichat_bot_card_list = DEFAULT_AICHAT_BOT_CARD_LIST;
            } else {
                this.aichat_bot_card_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.has_invalid_bot;
            if (num == null) {
                this.has_invalid_bot = DEFAULT_HAS_INVALID_BOT;
            } else {
                this.has_invalid_bot = num;
            }
            this.invalid_info = builder.invalid_info;
            return;
        }
        this.aichat_bot_card_list = Message.immutableCopyOf(builder.aichat_bot_card_list);
        this.has_invalid_bot = builder.has_invalid_bot;
        this.invalid_info = builder.invalid_info;
    }
}