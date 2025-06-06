package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class SidewayLayout extends Message {

    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<FeedKV> appendix;

    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<FeedKV> business_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ComponentFactory> components;

    @ProtoField(tag = 4)
    public final FeedFeedback feedback;

    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<FeedKV> log_param;

    @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.STRING)
    public final List<String> prefetch_schema;

    @ProtoField(tag = 3)
    public final ComponentFactory title;
    public static final List<ComponentFactory> DEFAULT_COMPONENTS = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_APPENDIX = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
    public static final List<String> DEFAULT_PREFETCH_SCHEMA = Collections.emptyList();

    public static final class Builder extends Message.Builder<SidewayLayout> {
        public List<FeedKV> appendix;
        public List<FeedKV> business_info;
        public List<ComponentFactory> components;
        public FeedFeedback feedback;
        public List<FeedKV> log_param;
        public List<String> prefetch_schema;
        public ComponentFactory title;

        public Builder() {
        }

        public Builder(SidewayLayout sidewayLayout) {
            super(sidewayLayout);
            if (sidewayLayout == null) {
                return;
            }
            this.components = Message.copyOf(sidewayLayout.components);
            this.title = sidewayLayout.title;
            this.feedback = sidewayLayout.feedback;
            this.business_info = Message.copyOf(sidewayLayout.business_info);
            this.appendix = Message.copyOf(sidewayLayout.appendix);
            this.log_param = Message.copyOf(sidewayLayout.log_param);
            this.prefetch_schema = Message.copyOf(sidewayLayout.prefetch_schema);
        }

        @Override // com.squareup.wire.Message.Builder
        public SidewayLayout build(boolean z) {
            return new SidewayLayout(this, z);
        }
    }

    public SidewayLayout(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ComponentFactory> list = builder.components;
            if (list == null) {
                this.components = DEFAULT_COMPONENTS;
            } else {
                this.components = Message.immutableCopyOf(list);
            }
            this.title = builder.title;
            this.feedback = builder.feedback;
            List<FeedKV> list2 = builder.business_info;
            if (list2 == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
            } else {
                this.business_info = Message.immutableCopyOf(list2);
            }
            List<FeedKV> list3 = builder.appendix;
            if (list3 == null) {
                this.appendix = DEFAULT_APPENDIX;
            } else {
                this.appendix = Message.immutableCopyOf(list3);
            }
            List<FeedKV> list4 = builder.log_param;
            if (list4 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
            } else {
                this.log_param = Message.immutableCopyOf(list4);
            }
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
        this.title = builder.title;
        this.feedback = builder.feedback;
        this.business_info = Message.immutableCopyOf(builder.business_info);
        this.appendix = Message.immutableCopyOf(builder.appendix);
        this.log_param = Message.immutableCopyOf(builder.log_param);
        this.prefetch_schema = Message.immutableCopyOf(builder.prefetch_schema);
    }
}