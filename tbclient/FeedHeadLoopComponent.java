package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedHeadLoopComponent extends Message {
    public static final List<FeedHeadImg> DEFAULT_IMAGE_LIST = Collections.emptyList();
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(tag = 3)
    public final FeedContentIcon icon_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FeedHeadImg> image_list;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String schema;

    @ProtoField(tag = 2)
    public final FeedContentText text_info;

    public static final class Builder extends Message.Builder<FeedHeadLoopComponent> {
        public FeedContentIcon icon_info;
        public List<FeedHeadImg> image_list;
        public String schema;
        public FeedContentText text_info;

        public Builder() {
        }

        public Builder(FeedHeadLoopComponent feedHeadLoopComponent) {
            super(feedHeadLoopComponent);
            if (feedHeadLoopComponent == null) {
                return;
            }
            this.image_list = Message.copyOf(feedHeadLoopComponent.image_list);
            this.text_info = feedHeadLoopComponent.text_info;
            this.icon_info = feedHeadLoopComponent.icon_info;
            this.schema = feedHeadLoopComponent.schema;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedHeadLoopComponent build(boolean z) {
            return new FeedHeadLoopComponent(this, z);
        }
    }

    public FeedHeadLoopComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FeedHeadImg> list = builder.image_list;
            if (list == null) {
                this.image_list = DEFAULT_IMAGE_LIST;
            } else {
                this.image_list = Message.immutableCopyOf(list);
            }
            this.text_info = builder.text_info;
            this.icon_info = builder.icon_info;
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str;
                return;
            }
        }
        this.image_list = Message.immutableCopyOf(builder.image_list);
        this.text_info = builder.text_info;
        this.icon_info = builder.icon_info;
        this.schema = builder.schema;
    }
}