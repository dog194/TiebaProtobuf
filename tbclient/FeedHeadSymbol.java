package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedHeadSymbol extends Message {
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<FeedKV> business_info;

    @ProtoField(tag = 6)
    public final FeedContentCustom custom;

    @ProtoField(tag = 1)
    public final FeedHeadIcon icon;

    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<FeedKV> log_info;

    @ProtoField(tag = 7)
    public final FeedHeadIcon prefix_icon;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String schema;

    @ProtoField(tag = 3)
    public final FeedHeadText text;

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final List<FeedKV> DEFAULT_LOG_INFO = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();

    public static final class Builder extends Message.Builder<FeedHeadSymbol> {
        public List<FeedKV> business_info;
        public FeedContentCustom custom;
        public FeedHeadIcon icon;
        public List<FeedKV> log_info;
        public FeedHeadIcon prefix_icon;
        public String schema;
        public FeedHeadText text;
        public Integer type;

        public Builder() {
        }

        public Builder(FeedHeadSymbol feedHeadSymbol) {
            super(feedHeadSymbol);
            if (feedHeadSymbol == null) {
                return;
            }
            this.icon = feedHeadSymbol.icon;
            this.type = feedHeadSymbol.type;
            this.text = feedHeadSymbol.text;
            this.schema = feedHeadSymbol.schema;
            this.log_info = Message.copyOf(feedHeadSymbol.log_info);
            this.custom = feedHeadSymbol.custom;
            this.prefix_icon = feedHeadSymbol.prefix_icon;
            this.business_info = Message.copyOf(feedHeadSymbol.business_info);
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedHeadSymbol build(boolean z) {
            return new FeedHeadSymbol(this, z);
        }
    }

    public FeedHeadSymbol(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.icon = builder.icon;
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            this.text = builder.text;
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
            } else {
                this.schema = str;
            }
            List<FeedKV> list = builder.log_info;
            if (list == null) {
                this.log_info = DEFAULT_LOG_INFO;
            } else {
                this.log_info = Message.immutableCopyOf(list);
            }
            this.custom = builder.custom;
            this.prefix_icon = builder.prefix_icon;
            List<FeedKV> list2 = builder.business_info;
            if (list2 == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
                return;
            } else {
                this.business_info = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.icon = builder.icon;
        this.type = builder.type;
        this.text = builder.text;
        this.schema = builder.schema;
        this.log_info = Message.immutableCopyOf(builder.log_info);
        this.custom = builder.custom;
        this.prefix_icon = builder.prefix_icon;
        this.business_info = Message.immutableCopyOf(builder.business_info);
    }
}