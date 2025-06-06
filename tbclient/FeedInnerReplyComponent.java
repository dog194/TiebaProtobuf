package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedInnerReplyComponent extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(tag = 3)
    public final Agree agree;

    @ProtoField(tag = 1)
    public final FeedHeadImg avatar;

    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<FeedKV> business_info;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String content;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedHeadSymbol> main_data;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String schema;
    public static final List<FeedHeadSymbol> DEFAULT_MAIN_DATA = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();

    public static final class Builder extends Message.Builder<FeedInnerReplyComponent> {
        public Agree agree;
        public FeedHeadImg avatar;
        public List<FeedKV> business_info;
        public String content;
        public List<FeedHeadSymbol> main_data;
        public String schema;

        public Builder() {
        }

        public Builder(FeedInnerReplyComponent feedInnerReplyComponent) {
            super(feedInnerReplyComponent);
            if (feedInnerReplyComponent == null) {
                return;
            }
            this.avatar = feedInnerReplyComponent.avatar;
            this.main_data = Message.copyOf(feedInnerReplyComponent.main_data);
            this.agree = feedInnerReplyComponent.agree;
            this.content = feedInnerReplyComponent.content;
            this.schema = feedInnerReplyComponent.schema;
            this.business_info = Message.copyOf(feedInnerReplyComponent.business_info);
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedInnerReplyComponent build(boolean z) {
            return new FeedInnerReplyComponent(this, z);
        }
    }

    public FeedInnerReplyComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.avatar = builder.avatar;
            List<FeedHeadSymbol> list = builder.main_data;
            if (list == null) {
                this.main_data = DEFAULT_MAIN_DATA;
            } else {
                this.main_data = Message.immutableCopyOf(list);
            }
            this.agree = builder.agree;
            String str = builder.content;
            if (str == null) {
                this.content = "";
            } else {
                this.content = str;
            }
            String str2 = builder.schema;
            if (str2 == null) {
                this.schema = "";
            } else {
                this.schema = str2;
            }
            List<FeedKV> list2 = builder.business_info;
            if (list2 == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
                return;
            } else {
                this.business_info = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.avatar = builder.avatar;
        this.main_data = Message.immutableCopyOf(builder.main_data);
        this.agree = builder.agree;
        this.content = builder.content;
        this.schema = builder.schema;
        this.business_info = Message.immutableCopyOf(builder.business_info);
    }
}