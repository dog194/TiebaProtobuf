package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class DiscussLayout extends Message {
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(tag = 5)
    public final FeedContentIcon background;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedKV> business_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ComponentFactory> components;

    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<FeedKV> log_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedKV> log_param;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String schema;
    public static final List<ComponentFactory> DEFAULT_COMPONENTS = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_INFO = Collections.emptyList();

    public static final class Builder extends Message.Builder<DiscussLayout> {
        public FeedContentIcon background;
        public List<FeedKV> business_info;
        public List<ComponentFactory> components;
        public List<FeedKV> log_info;
        public List<FeedKV> log_param;
        public String schema;

        public Builder() {
        }

        public Builder(DiscussLayout discussLayout) {
            super(discussLayout);
            if (discussLayout == null) {
                return;
            }
            this.components = Message.copyOf(discussLayout.components);
            this.log_param = Message.copyOf(discussLayout.log_param);
            this.business_info = Message.copyOf(discussLayout.business_info);
            this.schema = discussLayout.schema;
            this.background = discussLayout.background;
            this.log_info = Message.copyOf(discussLayout.log_info);
        }

        @Override // com.squareup.wire.Message.Builder
        public DiscussLayout build(boolean z) {
            return new DiscussLayout(this, z);
        }
    }

    public DiscussLayout(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ComponentFactory> list = builder.components;
            if (list == null) {
                this.components = DEFAULT_COMPONENTS;
            } else {
                this.components = Message.immutableCopyOf(list);
            }
            List<FeedKV> list2 = builder.log_param;
            if (list2 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
            } else {
                this.log_param = Message.immutableCopyOf(list2);
            }
            List<FeedKV> list3 = builder.business_info;
            if (list3 == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
            } else {
                this.business_info = Message.immutableCopyOf(list3);
            }
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
            } else {
                this.schema = str;
            }
            this.background = builder.background;
            List<FeedKV> list4 = builder.log_info;
            if (list4 == null) {
                this.log_info = DEFAULT_LOG_INFO;
                return;
            } else {
                this.log_info = Message.immutableCopyOf(list4);
                return;
            }
        }
        this.components = Message.immutableCopyOf(builder.components);
        this.log_param = Message.immutableCopyOf(builder.log_param);
        this.business_info = Message.immutableCopyOf(builder.business_info);
        this.schema = builder.schema;
        this.background = builder.background;
        this.log_info = Message.immutableCopyOf(builder.log_info);
    }
}