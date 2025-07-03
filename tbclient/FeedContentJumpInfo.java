package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class FeedContentJumpInfo extends Message {
    public static final Long DEFAULT_ID = 0L;
    public static final Long DEFAULT_NUM = 0L;
    public static final String DEFAULT_TEXT = "";

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;

    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long num;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String text;

    public static final class Builder extends Message.Builder<FeedContentJumpInfo> {
        public Long id;
        public Long num;
        public String text;

        public Builder() {
        }

        public Builder(FeedContentJumpInfo feedContentJumpInfo) {
            super(feedContentJumpInfo);
            if (feedContentJumpInfo == null) {
                return;
            }
            this.id = feedContentJumpInfo.id;
            this.num = feedContentJumpInfo.num;
            this.text = feedContentJumpInfo.text;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedContentJumpInfo build(boolean z) {
            return new FeedContentJumpInfo(this, z);
        }
    }

    public FeedContentJumpInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            Long l2 = builder.num;
            if (l2 == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = l2;
            }
            String str = builder.text;
            if (str == null) {
                this.text = "";
                return;
            } else {
                this.text = str;
                return;
            }
        }
        this.id = builder.id;
        this.num = builder.num;
        this.text = builder.text;
    }
}