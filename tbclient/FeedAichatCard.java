package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedAichatCard extends Message {
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_TARGET_SCHEME = "";

    @ProtoField(tag = 1)
    public final User bot_info;

    @ProtoField(tag = 5)
    public final BotUser bot_user_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<FeedKV> business_info;

    @ProtoField(tag = 3)
    public final ChatContent chat_button;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String target_scheme;

    public static final class Builder extends Message.Builder<FeedAichatCard> {
        public User bot_info;
        public BotUser bot_user_info;
        public List<FeedKV> business_info;
        public ChatContent chat_button;
        public String content;
        public String target_scheme;

        public Builder() {
        }

        public Builder(FeedAichatCard feedAichatCard) {
            super(feedAichatCard);
            if (feedAichatCard == null) {
                return;
            }
            this.bot_info = feedAichatCard.bot_info;
            this.content = feedAichatCard.content;
            this.chat_button = feedAichatCard.chat_button;
            this.target_scheme = feedAichatCard.target_scheme;
            this.bot_user_info = feedAichatCard.bot_user_info;
            this.business_info = Message.copyOf(feedAichatCard.business_info);
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedAichatCard build(boolean z) {
            return new FeedAichatCard(this, z);
        }
    }

    public FeedAichatCard(Builder builder, boolean z) {
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
            String str2 = builder.target_scheme;
            if (str2 == null) {
                this.target_scheme = "";
            } else {
                this.target_scheme = str2;
            }
            this.bot_user_info = builder.bot_user_info;
            List<FeedKV> list = builder.business_info;
            if (list == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
                return;
            } else {
                this.business_info = Message.immutableCopyOf(list);
                return;
            }
        }
        this.bot_info = builder.bot_info;
        this.content = builder.content;
        this.chat_button = builder.chat_button;
        this.target_scheme = builder.target_scheme;
        this.bot_user_info = builder.bot_user_info;
        this.business_info = Message.immutableCopyOf(builder.business_info);
    }
}