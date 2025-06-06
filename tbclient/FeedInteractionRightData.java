package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedInteractionRightData extends Message {

    @ProtoField(tag = 2)
    public final Agree agree;

    @ProtoField(tag = 4)
    public final Comment comment;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedContentResource> text;

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final List<FeedContentResource> DEFAULT_TEXT = Collections.emptyList();

    public static final class Builder extends Message.Builder<FeedInteractionRightData> {
        public Agree agree;
        public Comment comment;
        public List<FeedContentResource> text;
        public Integer type;

        public Builder() {
        }

        public Builder(FeedInteractionRightData feedInteractionRightData) {
            super(feedInteractionRightData);
            if (feedInteractionRightData == null) {
                return;
            }
            this.type = feedInteractionRightData.type;
            this.agree = feedInteractionRightData.agree;
            this.text = Message.copyOf(feedInteractionRightData.text);
            this.comment = feedInteractionRightData.comment;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedInteractionRightData build(boolean z) {
            return new FeedInteractionRightData(this, z);
        }
    }

    public FeedInteractionRightData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            this.agree = builder.agree;
            List<FeedContentResource> list = builder.text;
            if (list == null) {
                this.text = DEFAULT_TEXT;
            } else {
                this.text = Message.immutableCopyOf(list);
            }
            this.comment = builder.comment;
            return;
        }
        this.type = builder.type;
        this.agree = builder.agree;
        this.text = Message.immutableCopyOf(builder.text);
        this.comment = builder.comment;
    }
}