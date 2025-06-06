package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedScoreComponent extends Message {
    public static final List<FeedScoreItem> DEFAULT_ITEM = Collections.emptyList();
    public static final Integer DEFAULT_LIMIT_COUNT = 0;
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(tag = 3)
    public final FeedContentResource desc;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FeedScoreItem> item;

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer limit_count;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String schema;

    public static final class Builder extends Message.Builder<FeedScoreComponent> {
        public FeedContentResource desc;
        public List<FeedScoreItem> item;
        public Integer limit_count;
        public String schema;

        public Builder() {
        }

        public Builder(FeedScoreComponent feedScoreComponent) {
            super(feedScoreComponent);
            if (feedScoreComponent == null) {
                return;
            }
            this.item = Message.copyOf(feedScoreComponent.item);
            this.limit_count = feedScoreComponent.limit_count;
            this.desc = feedScoreComponent.desc;
            this.schema = feedScoreComponent.schema;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedScoreComponent build(boolean z) {
            return new FeedScoreComponent(this, z);
        }
    }

    public FeedScoreComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FeedScoreItem> list = builder.item;
            if (list == null) {
                this.item = DEFAULT_ITEM;
            } else {
                this.item = Message.immutableCopyOf(list);
            }
            Integer num = builder.limit_count;
            if (num == null) {
                this.limit_count = DEFAULT_LIMIT_COUNT;
            } else {
                this.limit_count = num;
            }
            this.desc = builder.desc;
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str;
                return;
            }
        }
        this.item = Message.immutableCopyOf(builder.item);
        this.limit_count = builder.limit_count;
        this.desc = builder.desc;
        this.schema = builder.schema;
    }
}