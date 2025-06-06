package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedAiRecreationCard extends Message {
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_TARGET_SCHEMA = "";

    @ProtoField(tag = 1)
    public final User bot_info;

    @ProtoField(tag = 4)
    public final BotUser bot_user_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<FeedKV> business_info;

    @ProtoField(tag = 3)
    public final ChatContent chat_button;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String target_schema;

    public static final class Builder extends Message.Builder<FeedAiRecreationCard> {
        public User bot_info;
        public BotUser bot_user_info;
        public List<FeedKV> business_info;
        public ChatContent chat_button;
        public String content;
        public String target_schema;

        public Builder() {
        }

        public Builder(FeedAiRecreationCard feedAiRecreationCard) {
            super(feedAiRecreationCard);
            if (feedAiRecreationCard == null) {
                return;
            }
            this.bot_info = feedAiRecreationCard.bot_info;
            this.content = feedAiRecreationCard.content;
            this.chat_button = feedAiRecreationCard.chat_button;
            this.bot_user_info = feedAiRecreationCard.bot_user_info;
            this.business_info = Message.copyOf(feedAiRecreationCard.business_info);
            this.target_schema = feedAiRecreationCard.target_schema;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedAiRecreationCard build(boolean z) {
            return new FeedAiRecreationCard(this, z);
        }
    }

    public FeedAiRecreationCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.bot_info = builder.bot_info;
            String str = builder.content;
            if (str == null) {
                this.content = "";
            } else {
                this.content = str;
            }
            this.chat_button = builder.chat_button;
            this.bot_user_info = builder.bot_user_info;
            List<FeedKV> list = builder.business_info;
            if (list == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
            } else {
                this.business_info = Message.immutableCopyOf(list);
            }
            String str2 = builder.target_schema;
            if (str2 == null) {
                this.target_schema = "";
                return;
            } else {
                this.target_schema = str2;
                return;
            }
        }
        this.bot_info = builder.bot_info;
        this.content = builder.content;
        this.chat_button = builder.chat_button;
        this.bot_user_info = builder.bot_user_info;
        this.business_info = Message.immutableCopyOf(builder.business_info);
        this.target_schema = builder.target_schema;
    }
}