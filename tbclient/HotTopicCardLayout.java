package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class HotTopicCardLayout extends Message {
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedKV> business_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ComponentFactory> components;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedKV> log_param;

    @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
    public final List<String> prefetch_schema;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String schema;
    public static final List<ComponentFactory> DEFAULT_COMPONENTS = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
    public static final List<String> DEFAULT_PREFETCH_SCHEMA = Collections.emptyList();

    public static final class Builder extends Message.Builder<HotTopicCardLayout> {
        public List<FeedKV> business_info;
        public List<ComponentFactory> components;
        public List<FeedKV> log_param;
        public List<String> prefetch_schema;
        public String schema;

        public Builder() {
        }

        public Builder(HotTopicCardLayout hotTopicCardLayout) {
            super(hotTopicCardLayout);
            if (hotTopicCardLayout == null) {
                return;
            }
            this.components = Message.copyOf(hotTopicCardLayout.components);
            this.business_info = Message.copyOf(hotTopicCardLayout.business_info);
            this.log_param = Message.copyOf(hotTopicCardLayout.log_param);
            this.schema = hotTopicCardLayout.schema;
            this.prefetch_schema = Message.copyOf(hotTopicCardLayout.prefetch_schema);
        }

        @Override // com.squareup.wire.Message.Builder
        public HotTopicCardLayout build(boolean z) {
            return new HotTopicCardLayout(this, z);
        }
    }

    public HotTopicCardLayout(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ComponentFactory> list = builder.components;
            if (list == null) {
                this.components = DEFAULT_COMPONENTS;
            } else {
                this.components = Message.immutableCopyOf(list);
            }
            List<FeedKV> list2 = builder.business_info;
            if (list2 == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
            } else {
                this.business_info = Message.immutableCopyOf(list2);
            }
            List<FeedKV> list3 = builder.log_param;
            if (list3 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
            } else {
                this.log_param = Message.immutableCopyOf(list3);
            }
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
            } else {
                this.schema = str;
            }
            List<String> list4 = builder.prefetch_schema;
            if (list4 == null) {
                this.prefetch_schema = DEFAULT_PREFETCH_SCHEMA;
                return;
            } else {
                this.prefetch_schema = Message.immutableCopyOf(list4);
                return;
            }
        }
        this.components = Message.immutableCopyOf(builder.components);
        this.business_info = Message.immutableCopyOf(builder.business_info);
        this.log_param = Message.immutableCopyOf(builder.log_param);
        this.schema = builder.schema;
        this.prefetch_schema = Message.immutableCopyOf(builder.prefetch_schema);
    }
}