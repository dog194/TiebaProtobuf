package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class PlaceholderLayout extends Message {

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedKV> business_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FeedKV> log_param;
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();

    public static final class Builder extends Message.Builder<PlaceholderLayout> {
        public List<FeedKV> business_info;
        public List<FeedKV> log_param;

        public Builder() {
        }

        public Builder(PlaceholderLayout placeholderLayout) {
            super(placeholderLayout);
            if (placeholderLayout == null) {
                return;
            }
            this.log_param = Message.copyOf(placeholderLayout.log_param);
            this.business_info = Message.copyOf(placeholderLayout.business_info);
        }

        @Override // com.squareup.wire.Message.Builder
        public PlaceholderLayout build(boolean z) {
            return new PlaceholderLayout(this, z);
        }
    }

    public PlaceholderLayout(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FeedKV> list = builder.log_param;
            if (list == null) {
                this.log_param = DEFAULT_LOG_PARAM;
            } else {
                this.log_param = Message.immutableCopyOf(list);
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
        this.log_param = Message.immutableCopyOf(builder.log_param);
        this.business_info = Message.immutableCopyOf(builder.business_info);
    }
}