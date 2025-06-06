package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class AichatBotCommentCard extends Message {
    public static final String DEFAULT_BOT_TYPE = "";
    public static final String DEFAULT_UK = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String bot_type;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String uk;

    public static final class Builder extends Message.Builder<AichatBotCommentCard> {
        public String bot_type;
        public String uk;

        public Builder() {
        }

        public Builder(AichatBotCommentCard aichatBotCommentCard) {
            super(aichatBotCommentCard);
            if (aichatBotCommentCard == null) {
                return;
            }
            this.uk = aichatBotCommentCard.uk;
            this.bot_type = aichatBotCommentCard.bot_type;
        }

        @Override // com.squareup.wire.Message.Builder
        public AichatBotCommentCard build(boolean z) {
            return new AichatBotCommentCard(this, z);
        }
    }

    public AichatBotCommentCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.uk;
            if (str == null) {
                this.uk = "";
            } else {
                this.uk = str;
            }
            String str2 = builder.bot_type;
            if (str2 == null) {
                this.bot_type = "";
                return;
            } else {
                this.bot_type = str2;
                return;
            }
        }
        this.uk = builder.uk;
        this.bot_type = builder.bot_type;
    }
}