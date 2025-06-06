package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class MultiThreadComponent extends Message {
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(tag = 3)
    public final PicInfo image;

    @ProtoField(tag = 4)
    public final FeedContentText left_desc;

    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<FeedKV> log_param;

    @ProtoField(tag = 5)
    public final FeedContentText right_desc;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String schema;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FeedContentResource> title;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedContentResource> topic;
    public static final List<FeedContentResource> DEFAULT_TITLE = Collections.emptyList();
    public static final List<FeedContentResource> DEFAULT_TOPIC = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();

    public static final class Builder extends Message.Builder<MultiThreadComponent> {
        public PicInfo image;
        public FeedContentText left_desc;
        public List<FeedKV> log_param;
        public FeedContentText right_desc;
        public String schema;
        public List<FeedContentResource> title;
        public List<FeedContentResource> topic;

        public Builder() {
        }

        public Builder(MultiThreadComponent multiThreadComponent) {
            super(multiThreadComponent);
            if (multiThreadComponent == null) {
                return;
            }
            this.title = Message.copyOf(multiThreadComponent.title);
            this.topic = Message.copyOf(multiThreadComponent.topic);
            this.image = multiThreadComponent.image;
            this.left_desc = multiThreadComponent.left_desc;
            this.right_desc = multiThreadComponent.right_desc;
            this.schema = multiThreadComponent.schema;
            this.log_param = Message.copyOf(multiThreadComponent.log_param);
        }

        @Override // com.squareup.wire.Message.Builder
        public MultiThreadComponent build(boolean z) {
            return new MultiThreadComponent(this, z);
        }
    }

    public MultiThreadComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FeedContentResource> list = builder.title;
            if (list == null) {
                this.title = DEFAULT_TITLE;
            } else {
                this.title = Message.immutableCopyOf(list);
            }
            List<FeedContentResource> list2 = builder.topic;
            if (list2 == null) {
                this.topic = DEFAULT_TOPIC;
            } else {
                this.topic = Message.immutableCopyOf(list2);
            }
            this.image = builder.image;
            this.left_desc = builder.left_desc;
            this.right_desc = builder.right_desc;
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
            } else {
                this.schema = str;
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
        this.title = Message.immutableCopyOf(builder.title);
        this.topic = Message.immutableCopyOf(builder.topic);
        this.image = builder.image;
        this.left_desc = builder.left_desc;
        this.right_desc = builder.right_desc;
        this.schema = builder.schema;
        this.log_param = Message.immutableCopyOf(builder.log_param);
    }
}