package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FeedKV;

/* loaded from: classes4.dex */
public final class CommerceInfo extends Message {
    public static final List<Commerce> DEFAULT_COMMERCE = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Commerce> commerce;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedKV> log_param;

    public static final class Builder extends Message.Builder<CommerceInfo> {
        public List<Commerce> commerce;
        public List<FeedKV> log_param;

        public Builder() {
        }

        public Builder(CommerceInfo commerceInfo) {
            super(commerceInfo);
            if (commerceInfo == null) {
                return;
            }
            this.commerce = Message.copyOf(commerceInfo.commerce);
            this.log_param = Message.copyOf(commerceInfo.log_param);
        }

        @Override // com.squareup.wire.Message.Builder
        public CommerceInfo build(boolean z) {
            return new CommerceInfo(this, z);
        }
    }

    public CommerceInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<Commerce> list = builder.commerce;
            if (list == null) {
                this.commerce = DEFAULT_COMMERCE;
            } else {
                this.commerce = Message.immutableCopyOf(list);
            }
            List<FeedKV> list2 = builder.log_param;
            if (list2 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
                return;
            } else {
                this.log_param = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.commerce = Message.immutableCopyOf(builder.commerce);
        this.log_param = Message.immutableCopyOf(builder.log_param);
    }
}