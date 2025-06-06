package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class UserShowInfo extends Message {

    @ProtoField(tag = 1)
    public final FeedHeadComponent feed_head;

    public static final class Builder extends Message.Builder<UserShowInfo> {
        public FeedHeadComponent feed_head;

        public Builder() {
        }

        public Builder(UserShowInfo userShowInfo) {
            super(userShowInfo);
            if (userShowInfo == null) {
                return;
            }
            this.feed_head = userShowInfo.feed_head;
        }

        @Override // com.squareup.wire.Message.Builder
        public UserShowInfo build(boolean z) {
            return new UserShowInfo(this, z);
        }
    }

    public UserShowInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.feed_head = builder.feed_head;
        } else {
            this.feed_head = builder.feed_head;
        }
    }
}