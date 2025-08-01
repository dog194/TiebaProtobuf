package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedStaggerLayout extends Message {
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(tag = 7)
    public final FeedContentIcon background;

    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<FeedKV> business_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ComponentFactory> components;

    @ProtoField(tag = 4)
    public final FeedFeedback feedback;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedKV> log_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<FeedKV> log_param;

    @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.STRING)
    public final List<String> prefetch_schema;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String schema;
    public static final List<ComponentFactory> DEFAULT_COMPONENTS = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_INFO = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
    public static final List<String> DEFAULT_PREFETCH_SCHEMA = Collections.emptyList();

    public static final class Builder extends Message.Builder<FeedStaggerLayout> {
        public FeedContentIcon background;
        public List<FeedKV> business_info;
        public List<ComponentFactory> components;
        public FeedFeedback feedback;
        public List<FeedKV> log_info;
        public List<FeedKV> log_param;
        public List<String> prefetch_schema;
        public String schema;

        public Builder() {
        }

        public Builder(FeedStaggerLayout feedStaggerLayout) {
            super(feedStaggerLayout);
            if (feedStaggerLayout == null) {
                return;
            }
            this.components = Message.copyOf(feedStaggerLayout.components);
            this.schema = feedStaggerLayout.schema;
            this.log_info = Message.copyOf(feedStaggerLayout.log_info);
            this.feedback = feedStaggerLayout.feedback;
            this.business_info = Message.copyOf(feedStaggerLayout.business_info);
            this.log_param = Message.copyOf(feedStaggerLayout.log_param);
            this.background = feedStaggerLayout.background;
            this.prefetch_schema = Message.copyOf(feedStaggerLayout.prefetch_schema);
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedStaggerLayout build(boolean z) {
            return new FeedStaggerLayout(this, z);
        }
    }

    public FeedStaggerLayout(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ComponentFactory> list = builder.components;
            if (list == null) {
                this.components = DEFAULT_COMPONENTS;
            } else {
                this.components = Message.immutableCopyOf(list);
            }
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
            } else {
                this.schema = str;
            }
            List<FeedKV> list2 = builder.log_info;
            if (list2 == null) {
                this.log_info = DEFAULT_LOG_INFO;
            } else {
                this.log_info = Message.immutableCopyOf(list2);
            }
            this.feedback = builder.feedback;
            List<FeedKV> list3 = builder.business_info;
            if (list3 == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
            } else {
                this.business_info = Message.immutableCopyOf(list3);
            }
            List<FeedKV> list4 = builder.log_param;
            if (list4 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
            } else {
                this.log_param = Message.immutableCopyOf(list4);
            }
            this.background = builder.background;
            List<String> list5 = builder.prefetch_schema;
            if (list5 == null) {
                this.prefetch_schema = DEFAULT_PREFETCH_SCHEMA;
                return;
            } else {
                this.prefetch_schema = Message.immutableCopyOf(list5);
                return;
            }
        }
        this.components = Message.immutableCopyOf(builder.components);
        this.schema = builder.schema;
        this.log_info = Message.immutableCopyOf(builder.log_info);
        this.feedback = builder.feedback;
        this.business_info = Message.immutableCopyOf(builder.business_info);
        this.log_param = Message.immutableCopyOf(builder.log_param);
        this.background = builder.background;
        this.prefetch_schema = Message.immutableCopyOf(builder.prefetch_schema);
    }
}