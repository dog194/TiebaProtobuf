package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedSidewayItem extends Message {
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<FeedKV> business_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedContentResource> extra_data;

    @ProtoField(tag = 1)
    public final PicInfo image;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedContentResource> main_data;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String schema;
    public static final List<FeedContentResource> DEFAULT_MAIN_DATA = Collections.emptyList();
    public static final List<FeedContentResource> DEFAULT_EXTRA_DATA = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();

    public static final class Builder extends Message.Builder<FeedSidewayItem> {
        public List<FeedKV> business_info;
        public List<FeedContentResource> extra_data;
        public PicInfo image;
        public List<FeedContentResource> main_data;
        public String schema;

        public Builder() {
        }

        public Builder(FeedSidewayItem feedSidewayItem) {
            super(feedSidewayItem);
            if (feedSidewayItem == null) {
                return;
            }
            this.image = feedSidewayItem.image;
            this.main_data = Message.copyOf(feedSidewayItem.main_data);
            this.extra_data = Message.copyOf(feedSidewayItem.extra_data);
            this.schema = feedSidewayItem.schema;
            this.business_info = Message.copyOf(feedSidewayItem.business_info);
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedSidewayItem build(boolean z) {
            return new FeedSidewayItem(this, z);
        }
    }

    public FeedSidewayItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.image = builder.image;
            List<FeedContentResource> list = builder.main_data;
            if (list == null) {
                this.main_data = DEFAULT_MAIN_DATA;
            } else {
                this.main_data = Message.immutableCopyOf(list);
            }
            List<FeedContentResource> list2 = builder.extra_data;
            if (list2 == null) {
                this.extra_data = DEFAULT_EXTRA_DATA;
            } else {
                this.extra_data = Message.immutableCopyOf(list2);
            }
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
            } else {
                this.schema = str;
            }
            List<FeedKV> list3 = builder.business_info;
            if (list3 == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
                return;
            } else {
                this.business_info = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.image = builder.image;
        this.main_data = Message.immutableCopyOf(builder.main_data);
        this.extra_data = Message.immutableCopyOf(builder.extra_data);
        this.schema = builder.schema;
        this.business_info = Message.immutableCopyOf(builder.business_info);
    }
}