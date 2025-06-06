package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedbackCardLayout extends Message {

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedKV> business_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ComponentFactory> components;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedKV> log_param;
    public static final List<ComponentFactory> DEFAULT_COMPONENTS = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();

    public static final class Builder extends Message.Builder<FeedbackCardLayout> {
        public List<FeedKV> business_info;
        public List<ComponentFactory> components;
        public List<FeedKV> log_param;

        public Builder() {
        }

        public Builder(FeedbackCardLayout feedbackCardLayout) {
            super(feedbackCardLayout);
            if (feedbackCardLayout == null) {
                return;
            }
            this.components = Message.copyOf(feedbackCardLayout.components);
            this.business_info = Message.copyOf(feedbackCardLayout.business_info);
            this.log_param = Message.copyOf(feedbackCardLayout.log_param);
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedbackCardLayout build(boolean z) {
            return new FeedbackCardLayout(this, z);
        }
    }

    public FeedbackCardLayout(Builder builder, boolean z) {
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
                return;
            } else {
                this.log_param = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.components = Message.immutableCopyOf(builder.components);
        this.business_info = Message.immutableCopyOf(builder.business_info);
        this.log_param = Message.immutableCopyOf(builder.log_param);
    }
}