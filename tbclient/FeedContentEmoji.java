package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class FeedContentEmoji extends Message {
    public static final String DEFAULT_C = "";
    public static final String DEFAULT_NAME = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String c;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;

    public static final class Builder extends Message.Builder<FeedContentEmoji> {
        public String c;
        public String name;

        public Builder() {
        }

        public Builder(FeedContentEmoji feedContentEmoji) {
            super(feedContentEmoji);
            if (feedContentEmoji == null) {
                return;
            }
            this.name = feedContentEmoji.name;
            this.c = feedContentEmoji.c;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedContentEmoji build(boolean z) {
            return new FeedContentEmoji(this, z);
        }
    }

    public FeedContentEmoji(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.c;
            if (str2 == null) {
                this.c = "";
                return;
            } else {
                this.c = str2;
                return;
            }
        }
        this.name = builder.name;
        this.c = builder.c;
    }
}