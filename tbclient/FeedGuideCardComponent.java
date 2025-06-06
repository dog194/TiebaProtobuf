package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedGuideCardComponent extends Message {

    @ProtoField(tag = 5)
    public final FeedContentIcon background_url;

    @ProtoField(tag = 4)
    public final FeedButton button;

    @ProtoField(tag = 1)
    public final FeedHeadImg img;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedContentResource> sub_title;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedContentResource> title;
    public static final List<FeedContentResource> DEFAULT_TITLE = Collections.emptyList();
    public static final List<FeedContentResource> DEFAULT_SUB_TITLE = Collections.emptyList();

    public static final class Builder extends Message.Builder<FeedGuideCardComponent> {
        public FeedContentIcon background_url;
        public FeedButton button;
        public FeedHeadImg img;
        public List<FeedContentResource> sub_title;
        public List<FeedContentResource> title;

        public Builder() {
        }

        public Builder(FeedGuideCardComponent feedGuideCardComponent) {
            super(feedGuideCardComponent);
            if (feedGuideCardComponent == null) {
                return;
            }
            this.img = feedGuideCardComponent.img;
            this.title = Message.copyOf(feedGuideCardComponent.title);
            this.sub_title = Message.copyOf(feedGuideCardComponent.sub_title);
            this.button = feedGuideCardComponent.button;
            this.background_url = feedGuideCardComponent.background_url;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedGuideCardComponent build(boolean z) {
            return new FeedGuideCardComponent(this, z);
        }
    }

    public FeedGuideCardComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.img = builder.img;
            List<FeedContentResource> list = builder.title;
            if (list == null) {
                this.title = DEFAULT_TITLE;
            } else {
                this.title = Message.immutableCopyOf(list);
            }
            List<FeedContentResource> list2 = builder.sub_title;
            if (list2 == null) {
                this.sub_title = DEFAULT_SUB_TITLE;
            } else {
                this.sub_title = Message.immutableCopyOf(list2);
            }
            this.button = builder.button;
            this.background_url = builder.background_url;
            return;
        }
        this.img = builder.img;
        this.title = Message.immutableCopyOf(builder.title);
        this.sub_title = Message.immutableCopyOf(builder.sub_title);
        this.button = builder.button;
        this.background_url = builder.background_url;
    }
}