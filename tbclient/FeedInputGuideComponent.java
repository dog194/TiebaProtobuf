package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedInputGuideComponent extends Message {
    public static final String DEFAULT_SCHEME = "";

    @ProtoField(tag = 7)
    public final FeedContentColor background;

    @ProtoField(tag = 1)
    public final FeedContentIcon left_icon;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedContentResource> left_text;

    @ProtoField(label = Message.Label.REPEATED, tag = 9)
    public final List<LayoutManageInfo> manage_list;

    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<FeedContentResource> mid_text;

    @ProtoField(tag = 5)
    public final FeedContentIcon right_icon;

    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<FeedContentResource> right_text;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String scheme;

    @ProtoField(tag = 3)
    public final FeedContentIcon strip;
    public static final List<FeedContentResource> DEFAULT_LEFT_TEXT = Collections.emptyList();
    public static final List<FeedContentResource> DEFAULT_MID_TEXT = Collections.emptyList();
    public static final List<FeedContentResource> DEFAULT_RIGHT_TEXT = Collections.emptyList();
    public static final List<LayoutManageInfo> DEFAULT_MANAGE_LIST = Collections.emptyList();

    public static final class Builder extends Message.Builder<FeedInputGuideComponent> {
        public FeedContentColor background;
        public FeedContentIcon left_icon;
        public List<FeedContentResource> left_text;
        public List<LayoutManageInfo> manage_list;
        public List<FeedContentResource> mid_text;
        public FeedContentIcon right_icon;
        public List<FeedContentResource> right_text;
        public String scheme;
        public FeedContentIcon strip;

        public Builder() {
        }

        public Builder(FeedInputGuideComponent feedInputGuideComponent) {
            super(feedInputGuideComponent);
            if (feedInputGuideComponent == null) {
                return;
            }
            this.left_icon = feedInputGuideComponent.left_icon;
            this.left_text = Message.copyOf(feedInputGuideComponent.left_text);
            this.strip = feedInputGuideComponent.strip;
            this.mid_text = Message.copyOf(feedInputGuideComponent.mid_text);
            this.right_icon = feedInputGuideComponent.right_icon;
            this.right_text = Message.copyOf(feedInputGuideComponent.right_text);
            this.background = feedInputGuideComponent.background;
            this.scheme = feedInputGuideComponent.scheme;
            this.manage_list = Message.copyOf(feedInputGuideComponent.manage_list);
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedInputGuideComponent build(boolean z) {
            return new FeedInputGuideComponent(this, z);
        }
    }

    public FeedInputGuideComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.left_icon = builder.left_icon;
            List<FeedContentResource> list = builder.left_text;
            if (list == null) {
                this.left_text = DEFAULT_LEFT_TEXT;
            } else {
                this.left_text = Message.immutableCopyOf(list);
            }
            this.strip = builder.strip;
            List<FeedContentResource> list2 = builder.mid_text;
            if (list2 == null) {
                this.mid_text = DEFAULT_MID_TEXT;
            } else {
                this.mid_text = Message.immutableCopyOf(list2);
            }
            this.right_icon = builder.right_icon;
            List<FeedContentResource> list3 = builder.right_text;
            if (list3 == null) {
                this.right_text = DEFAULT_RIGHT_TEXT;
            } else {
                this.right_text = Message.immutableCopyOf(list3);
            }
            this.background = builder.background;
            String str = builder.scheme;
            if (str == null) {
                this.scheme = "";
            } else {
                this.scheme = str;
            }
            List<LayoutManageInfo> list4 = builder.manage_list;
            if (list4 == null) {
                this.manage_list = DEFAULT_MANAGE_LIST;
                return;
            } else {
                this.manage_list = Message.immutableCopyOf(list4);
                return;
            }
        }
        this.left_icon = builder.left_icon;
        this.left_text = Message.immutableCopyOf(builder.left_text);
        this.strip = builder.strip;
        this.mid_text = Message.immutableCopyOf(builder.mid_text);
        this.right_icon = builder.right_icon;
        this.right_text = Message.immutableCopyOf(builder.right_text);
        this.background = builder.background;
        this.scheme = builder.scheme;
        this.manage_list = Message.immutableCopyOf(builder.manage_list);
    }
}