package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedInteractionLeft extends Message {
    public static final List<FeedHeadSymbol> DEFAULT_MAIN_DATA = Collections.emptyList();
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(tag = 1)
    public final FeedHeadImg image_data;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedHeadSymbol> main_data;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String schema;

    public static final class Builder extends Message.Builder<FeedInteractionLeft> {
        public FeedHeadImg image_data;
        public List<FeedHeadSymbol> main_data;
        public String schema;

        public Builder() {
        }

        public Builder(FeedInteractionLeft feedInteractionLeft) {
            super(feedInteractionLeft);
            if (feedInteractionLeft == null) {
                return;
            }
            this.image_data = feedInteractionLeft.image_data;
            this.main_data = Message.copyOf(feedInteractionLeft.main_data);
            this.schema = feedInteractionLeft.schema;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedInteractionLeft build(boolean z) {
            return new FeedInteractionLeft(this, z);
        }
    }

    public FeedInteractionLeft(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.image_data = builder.image_data;
            List<FeedHeadSymbol> list = builder.main_data;
            if (list == null) {
                this.main_data = DEFAULT_MAIN_DATA;
            } else {
                this.main_data = Message.immutableCopyOf(list);
            }
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str;
                return;
            }
        }
        this.image_data = builder.image_data;
        this.main_data = Message.immutableCopyOf(builder.main_data);
        this.schema = builder.schema;
    }
}