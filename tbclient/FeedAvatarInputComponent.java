package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedAvatarInputComponent extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final List<LayoutManageInfo> DEFAULT_MANAGE_LIST = Collections.emptyList();
    public static final String DEFAULT_SCHEMA = "";
    public static final String DEFAULT_TIP_TEXT = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String avatar;

    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<LayoutManageInfo> manage_list;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String schema;

    @ProtoField(tag = 3)
    public final IconUrlInfo send_icon;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tip_text;

    public static final class Builder extends Message.Builder<FeedAvatarInputComponent> {
        public String avatar;
        public List<LayoutManageInfo> manage_list;
        public String schema;
        public IconUrlInfo send_icon;
        public String tip_text;

        public Builder() {
        }

        public Builder(FeedAvatarInputComponent feedAvatarInputComponent) {
            super(feedAvatarInputComponent);
            if (feedAvatarInputComponent == null) {
                return;
            }
            this.avatar = feedAvatarInputComponent.avatar;
            this.tip_text = feedAvatarInputComponent.tip_text;
            this.send_icon = feedAvatarInputComponent.send_icon;
            this.manage_list = Message.copyOf(feedAvatarInputComponent.manage_list);
            this.schema = feedAvatarInputComponent.schema;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedAvatarInputComponent build(boolean z) {
            return new FeedAvatarInputComponent(this, z);
        }
    }

    public FeedAvatarInputComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.avatar;
            if (str == null) {
                this.avatar = "";
            } else {
                this.avatar = str;
            }
            String str2 = builder.tip_text;
            if (str2 == null) {
                this.tip_text = "";
            } else {
                this.tip_text = str2;
            }
            this.send_icon = builder.send_icon;
            List<LayoutManageInfo> list = builder.manage_list;
            if (list == null) {
                this.manage_list = DEFAULT_MANAGE_LIST;
            } else {
                this.manage_list = Message.immutableCopyOf(list);
            }
            String str3 = builder.schema;
            if (str3 == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str3;
                return;
            }
        }
        this.avatar = builder.avatar;
        this.tip_text = builder.tip_text;
        this.send_icon = builder.send_icon;
        this.manage_list = Message.immutableCopyOf(builder.manage_list);
        this.schema = builder.schema;
    }
}